public class Request {

	private String client;
	private double sum;
	private boolean isAddition;

	public Request(String client, double sum, boolean isAddition) {
		this.client = client;
		this.sum = sum;
		this.isAddition = isAddition;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public boolean isAddition() {
		return isAddition;
	}

	public void setAddition(boolean addition) {
		isAddition = addition;
	}

	//	Client client1 = new Client(1, "Oleg");
//	Client client2 = new Client(2, "Anna");
//	Client client3 = new Client(3, "Maria");
//	Client client4 = new Client(4, "Barsik");


}
