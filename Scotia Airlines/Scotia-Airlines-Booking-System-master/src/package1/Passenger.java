package package1;

public class Passenger {

	private float discountAmount;
	private String passengerName;
	
	
	
	public float getDiscountAmount() {
		return discountAmount;
	}
	
	public String getPassengerName() {
		return passengerName;
	}
	public void setDiscountAmount(float discountAmountIn) {
		discountAmount = discountAmountIn;
	}
	
	public void setPassengerName(String passengerNameIn) {
		passengerName = passengerNameIn;
	}

	public Passenger(){
		
		discountAmount = 0;
		passengerName = "";
		
	}
	
	public Passenger(String passengerNameIn)
	{
		discountAmount = 0f;
		passengerName = passengerNameIn;
	}
	
	public Passenger(float discountAmountIn, String passengerNameIn){
		
		discountAmount = discountAmountIn;
		passengerName = passengerNameIn;
		
	}
	
}//end of class
