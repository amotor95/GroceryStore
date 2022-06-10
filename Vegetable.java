
public class Vegetable extends FoodItem
{
	double priceperpound;
    int tempreturekeptat;
  

	
	public Vegetable(boolean frozen, int daysTillExpiration, double costperpound, int tempreturekeptat, boolean canned) 
	{
		super(true, frozen, daysTillExpiration);
        this.priceperpound = costperpound;
        this.tempreturekeptat = tempreturekeptat;
	}
  
 public double calculateprice(int pounds){
  
  return priceperpound * pounds;
  
  }
  
public boolean safetoeat(){
 
  int daystillexpiration = getgetExpirationTime();
 
  if(isFrozen()){
  
    if(tempreturekeptat <= 32) {
    
        return true;
        
    }
    
    else if((tempreturekeptat > 32) && (daystillexpiration == 0)){
    
    return false;
    
    }
    
    
  
   }
  
  else{
  
     if(daystillexpiration == 0){
  
     return false;
  
     }
  
    else{
  
     return true;
  
     }
  
   
  
  }
  
  
  
  }
	
}
