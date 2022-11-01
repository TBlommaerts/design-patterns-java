package designpatterns.visitor;

public class NonProfitAssociation implements IBusinessEntity {

	private final String name;
	
	public NonProfitAssociation(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void doBusiness() {
		System.out.println("Non profit association \"" + name + "\" is doing business.");
	}

	@Override
	public void calculateBelgianTaxes() {
		System.out.println("Calculated tax for business entity \"" + name + "\" using algorithm for non profit associations based on the Belgian tax regulations.");
	}

	@Override
	public void calculateGermanTaxes() {
		System.out.println("Calculated tax for business entity \"" + name + "\" using algorithm for non profit associations based on the German tax regulations.");
	}
}
