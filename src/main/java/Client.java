public class Client implements Runnable {
	private String name;
	private Request request;
	private FrontalService frontalService;

	public Client(String name, FrontalService frontalService) {
		this.name = name;
		this.frontalService = frontalService;
	}

	@Override
	public void run() {
		frontalService.addRequest(request);
		System.out.println(name + ": " + request.toString() + " отправлена в банк");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}
}
