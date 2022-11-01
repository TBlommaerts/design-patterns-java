package designpatterns.visitor;

/*
 * Imagine these classes contain volatile business logic and are already in production, and we need to add new tax calculation algorithms...
 * Every time we update these classes, we risk breaking existing functionality!
 */
public interface IBusinessEntity {
	
	public String getName();
	
	public void doBusiness();
	
	// Bad separation of logic, implementations of this interface should not be responsible for this!
	public void calculateBelgianTaxes();
	public void calculateGermanTaxes();
}