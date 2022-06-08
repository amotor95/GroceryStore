public class Snacks extends FoodItem
{
	
	String flavor;
	double unitPrice;
	
	public Snacks(boolean vegan, boolean frozen, int timeTillExpiration, String Cflavor, double unitPrice)
	{
		super(vegan, frozen, timeTillExpiration);
		this.flavor = Cflavor;
		this.unitPrice = unitPrice;
	}
	
	public void checkFlavor(String checkFlavor)
	{
		flavor = checkFlavor;
	}
	
	public double calculatePrice(double count)
	{
		return count * unitPrice;
	}

}


