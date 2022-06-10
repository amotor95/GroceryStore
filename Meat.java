
public class Meat extends FoodItem {

	private double pricePerLb;
	
	public Meat(double pricePerLb, boolean frozen, int daysToExpiration) {
		super(false, frozen, daysToExpiration);
		this.pricePerLb = pricePerLb;
	}
	
	public double calculatePrice(double pounds) {
		return pounds * pricePerLb;
	}
	
	public boolean expired(int daysPassed) {
		if(frozen) {
			if(daysPassed < this.timeTillExpiration*10) {
				return false;
			}
		} else if(daysPassed < this.timeTillExpiration) {
			return false;
		}
		return true;
	}

}
