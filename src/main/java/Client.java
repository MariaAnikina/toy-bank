public class Client implements Runnable {


	private Request request;
	private String name;

	public Client(Request request, String name) {
		this.request = request;
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Поток запущен");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public static void main(String[] args) {
//		Thread myThread1 = new MyThread();
//
//		myThread1.start();
//
//
//		Thread threadRunnable2 = new Thread(new MyThreadRunnable());
//
//		threadRunnable2.start();
//
//
//		Thread threadRunnable3 = new Thread(() -> System.out.println("создание потока с помощью лямбды"));
//
//		threadRunnable3.start();
//
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			throw new RuntimeException(e);
//		}
//
//
//	}
}
