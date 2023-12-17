public class Request {

	private String client;
	private double sum;
	private Procedure procedure;

	public Request(String client, double sum, Procedure procedure) {
		this.client = client;
		this.sum = sum;
		this.procedure = procedure;
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

	public Procedure getProcedure() {
		return procedure;
	}

	public void setProcedure(Procedure procedure) {
		this.procedure = procedure;
	}

	@Override
	public String toString() {
		return "Request{" +
				"client='" + client + '\'' +
				", sum=" + sum +
				", procedure=" + procedure +
				'}';
	}
}
