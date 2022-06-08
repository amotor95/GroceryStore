
public abstract class FoodItem {
	
	boolean vegan;
	boolean frozen;
	int timeTillExpiration;
	
	public FoodItem(boolean vegan, boolean frozen, int timeTillExpiration) {
		
		this.vegan = vegan;
		this.frozen = frozen;
		this.timeTillExpiration = timeTillExpiration;
	}
	
	public abstract double calculatePrice(double foodUnit);
	
	public boolean expired(int daysPassed) {
		if(daysPassed < this.timeTillExpiration) {
			return false;
		}
		return true;
	}
	
	public boolean isVegan() {
		return this.vegan;
	}
	
	public boolean isFrozen() {
		return this.frozen;
	}
	
	public int getExpirationTime() {
		return this.timeTillExpiration;
	}
	
	public void setExpirationTime(int time) {
		this.timeTillExpiration = time;
	}
}
