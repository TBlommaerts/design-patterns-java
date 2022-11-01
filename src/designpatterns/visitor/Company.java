package designpatterns.visitor;


public class Company implements IBusinessEntity {

	private final String name;
	
	public Company(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void doBusiness() {
		System.out.println("Company \"" + name + "\" is doing business.");
	}

	@Override
	public void calculateBelgianTaxes() {
		System.out.println("Calculated tax for business entity \"" + name + "\" using algorithm for companies based on the Belgian tax regulations.");
	}

	@Override
	public void calculateGermanTaxes() {
		System.out.println("Calculated tax for business entity \"" + name + "\" using algorithm for companies based on the German tax regulations.");
	}
}