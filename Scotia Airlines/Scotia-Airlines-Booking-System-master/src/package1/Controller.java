package package1;

public class Controller {

	public static void main(String[] args) 
	{
		
		Airline myAirline = new Airline();
		myAirline.loadFlightsFromDB();
		
		UserInterface ui = new UserInterface(myAirline);
		ui.mainMenu();
		
	

	}

}
