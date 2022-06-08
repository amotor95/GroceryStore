
public class Fruit extends FoodItem
{
	double pricePerPound;
	boolean seasonal;
	
	public Fruit(boolean vegan, boolean frozen, int timeTillExpiration, int pricePerPound, boolean seasonal) 
	{
		super(vegan, frozen, timeTillExpiration);
		this.pricePerPound = pricePerPound;
		this.seasonal = seasonal;
	}
	
	public double calculatePrice(double pounds)
	{
		return pounds * pricePerPound;
	}
	
	public boolean expired(int days)
	{
		return days > 7;
	}
	
	public boolean isSeasonal()
	{
		return seasonal;
	}
}
