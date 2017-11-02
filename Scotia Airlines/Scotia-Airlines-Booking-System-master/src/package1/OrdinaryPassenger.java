package package1;

public class OrdinaryPassenger extends Passenger {

	private char currentPromotion;

	public char getCurrentPromotion() {
		return currentPromotion;
	}

	public void setCurrentPromotion(char currentPromotionIn) {
		currentPromotion = currentPromotionIn;
	}
	
	public OrdinaryPassenger(){
	super();
	
	currentPromotion = ' ';
	
	}
	
	

	
	public OrdinaryPassenger(String passengerNameIn, char currentPromotionIn)
	{
		super(passengerNameIn);
		
		currentPromotion = currentPromotionIn;
	
		
		
		if(currentPromotion == 'y')
		{
			
		this.setDiscountAmount(0.95f);
		
		}else{
			
		this.setDiscountAmount(1.0f);
		}
		
		
	}
	

	
}//end of class
