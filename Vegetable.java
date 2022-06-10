
public class Vegetable extends FoodItem {
	
	private double pricePerPound;
	private int tempretureKeptAt;
	private int daysExpired;
	
	public Vegetable(boolean frozen, int daysTillExpiration, double costPerPound, int tempretureKeptAt, boolean canned, int daysAfterExpiration) {
		
		super(true, frozen, daysTillExpiration);
		this.pricePerPound = costPerPound;
		this.daysExpired = daysAfterExpiration;
		
		
	}
	
	
	
	public double calculateprice(double pounds) {
		
		return pricePerPound * pounds;
		
	}
	
	
	public boolean safetoeat() {
		
		int daysTillExpiration = getExpirationTime();
		
		if(isFrozen()) {
			
			if((tempretureKeptAt <= 32) && (daysExpired <= 240)) {
				
				return true;
				
			}
			
			else {
				
				return false;
				
			}
			
		}
		
		else {
			
			if(daysTillExpiration == 0) {
				
				return false;
			}
			
			
			else {
				return true;
			}
			
			
		}
		
		
		
		
	}
	
	
	
	

	
	
	

}

