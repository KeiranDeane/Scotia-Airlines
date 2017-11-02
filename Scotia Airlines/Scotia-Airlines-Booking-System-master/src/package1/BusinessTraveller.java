package package1;

public class BusinessTraveller extends Passenger{
	
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyNameIn) {
		companyName = companyNameIn;
	}
	
	public BusinessTraveller(){
		super();
	}

	public BusinessTraveller(String companyNameIn,float discountAmountIn, String passengerNameIn){
		super(discountAmountIn, passengerNameIn);
		
		
			companyName = companyNameIn ;
			discountAmountIn = 0.75f;
		
	}
	
	public BusinessTraveller(String passengerNameIn, String companyNameIn){
		super(0.75f ,passengerNameIn);
		
		companyName = companyNameIn;
		
		
	}
	
	
}
