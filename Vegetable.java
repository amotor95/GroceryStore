
public class Vegetable extends FoodItem
{
	private double pricePerPound;
	private int temperatureKeptAt;
	private int daysExpired;
	
	public Vegetable(boolean frozen, int daysTillExpiration, double costPerPound, int temperatureKeptAt, int daysAfterExpiration) 
	{
		super(true, frozen, daysTillExpiration);
		this.pricePerPound = costPerPound;
		this.temperatureKeptAt = temperatureKeptAt;
		this.daysExpired = daysAfterExpiration;
	}
	
	
	
	public double calculatePrice(double pounds) 
	{
		return pricePerPound * pounds;
	}
	
	
	public boolean safeToEat() 
	{
		if (temperatureKeptAt <= 32 && daysExpired <= 240)
				return true;
		else 
		{ 
			if (daysExpired > 0)
				return false;
			else
				return true;
		}
	}
}