package package1;

public class IslandResident extends Passenger{
	
	private String islandOfResidence;

	public String getIslandOfResidence() {
		return islandOfResidence;
	}

	public void setIslandOfResidence(String islandOfResidenceIn) {
		islandOfResidence = islandOfResidenceIn;
	}

	public IslandResident(){
		super();
		
		islandOfResidence = "";
		
		}
	
	public IslandResident(String passengerNameIn, String islandOfResidenceIn){
		super(0.9f,passengerNameIn);
		
		islandOfResidence = islandOfResidenceIn;
		
		
	}
		
		
		public IslandResident(String islandOfResidenceIn, float discountAmountIn, String passengerNameIn){
			super(discountAmountIn, passengerNameIn);
			
			islandOfResidence = islandOfResidenceIn;
			
			discountAmountIn = 0.9f;
			
			
			
		}
	
	
	
}
