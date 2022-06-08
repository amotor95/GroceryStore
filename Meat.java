
public class Meat extends FoodItem {

	private double pricePerLb;
	
	public Meat(double pricePerLb, boolean frozen, int daysToExpiration) {
		super(false, frozen, daysToExpiration);
		this.pricePerLb = pricePerLb;
	}
	
	public double calculatePrice(double pounds) {
		return pounds * pricePerLb;
	}

}
