import java.util.LinkedList;
import java.util.Queue;

public class FrontalService {

	private final Queue<Request> requests = new LinkedList<>();


	public void addRequest(Request request) {
		synchronized (requests) {
			while (requests.size() >= 2) {
				try {
					requests.wait();
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
			requests.add(request);
			requests.notifyAll();
		}
	}

	public Request getRequest() {
		synchronized (requests) {
			while (requests.size() == 0) {
				try {
					requests.wait();
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
			Request request = requests.poll();
			requests.notifyAll();
			return request;
		}
	}
}
