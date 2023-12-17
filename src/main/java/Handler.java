public class Handler implements Runnable {
	private String name;
	private FrontalService frontalService;
	private Bank bank;

	public Handler(String name, FrontalService frontalService, Bank bank) {
		this.name = name;
		this.frontalService = frontalService;
		this.bank = bank;
	}

	@Override
	public void run() {
		while (true) {
			Request request = frontalService.getRequest();
			System.out.println("Получена заявка на обработку по клиенту " + request.getClient());
			if (request.getProcedure().equals(Procedure.INCREASE)) {
				bank.increaseBalance(request.getSum(), name, request);
			}
			if (request.getProcedure().equals(Procedure.DECREASE)) {
				bank.reduceBalance(request.getSum(), name, request);
			}
		}
	}

	public FrontalService getFrontalService() {
		return frontalService;
	}

	public void setFrontalService(FrontalService frontalService) {
		this.frontalService = frontalService;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
