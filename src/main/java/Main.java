import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		FrontalService frontalService = new FrontalService();

		Client client1 = new Client("Oleg", frontalService);
		Client client2 = new Client("Anna", frontalService);
		Client client3 = new Client( "Maria", frontalService);
		Client client4 = new Client( "Barsik", frontalService);

		Thread c1 = new Thread(client1);
		Thread c2 = new Thread(client2);
		Thread c3 = new Thread(client3);
		Thread c4 = new Thread(client4);

		Request request1 = new Request(client1.getName(), 500, Procedure.INCREASE);
		Request request2 = new Request(client2.getName(), 250, Procedure.INCREASE);
		Request request3 = new Request(client3.getName(), 100, Procedure.DECREASE);
		Request request4 = new Request(client4.getName(), 50, Procedure.INCREASE);

		client1.setRequest(request1);
		client2.setRequest(request2);
		client3.setRequest(request3);
		client4.setRequest(request4);


		Bank bank = new Bank(1000);


		Handler handler1 = new Handler("Обработчик 1", frontalService, bank);
		Handler handler2 = new Handler("Обработчик 2", frontalService, bank);



		Thread h1 = new Thread(handler1);
		Thread h2 = new Thread(handler2);

		c1.start();
		c2.start();
		c3.start();
		c4.start();

		h1.start();
		h2.start();
	}
}
