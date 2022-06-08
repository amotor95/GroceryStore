
public abstract class FoodItem {
	
	boolean vegan;
	boolean frozen;
	int timeTillExpiration;
	
	public FoodItem(boolean vegan, boolean frozen, int timeTillExpiration) {
		
		this.vegan = vegan;
		this.frozen = frozen;
		this.timeTillExpiration = timeTillExpiration;
	}
	
	public abstract double calculatePrice();
	
	public abstract boolean expired();
	
}
