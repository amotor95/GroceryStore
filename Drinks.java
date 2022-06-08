public class Drinks extends FoodItem 
{

	double unitPrice; 
	boolean refridgerated;
	
	public Drinks(boolean vegan, boolean frozen, int timeTillExpiration, double unitPrice, boolean refridgerated) 
	{
		super(vegan, frozen, timeTillExpiration);
		this.unitPrice = unitPrice;
		this.refridgerated = refridgerated;

	}
	
	public double calculatePrice(double unitsPurchased) 
	{
		return unitsPurchased * unitPrice;
	}
	
	public boolean expired(double monthsSince) 
	{
		if (refridgerated) {
			if (monthsSince > 18)
				return true;
			else
				return false;
		}
		else { 
			if (monthsSince > 9)
				return true;
			else
				return false;
		}
	}
}