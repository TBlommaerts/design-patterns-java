package designpatterns.visitor;

public class SoleTrader implements IBusinessEntity {
	
	private final String name;
	
	public SoleTrader(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void doBusiness() {
		System.out.println("Sole trader \"" + name + "\" is doing business.");
	}

	@Override
	public void calculateBelgianTaxes() {
		System.out.println("Calculated tax for business entity \"" + name + "\" using algorithm for sole traders based on the Belgian tax regulations.");
	}

	@Override
	public void calculateGermanTaxes() {
		System.out.println("Calculated tax for business entity \"" + name + "\" using algorithm for sole traders based on the German tax regulations.");
	}
}

