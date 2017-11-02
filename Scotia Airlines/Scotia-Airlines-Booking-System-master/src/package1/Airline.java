package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class Airline {

	private HashMap<String,Flight> flights;

	
	public HashMap<String,Flight> getFlights() { return flights; }
	
	public Airline()
	{
		flights =  new HashMap<String,Flight>();
		
		
	}
	

	public Flight getFlights(String flightNo){
		
		if (flights.containsKey(flightNo))
		{
			return flights.get(flightNo);
		}
		else
		{
			Flight aNewFlight = new Flight(0,0);
			flights.put(aNewFlight.getFlightNumber(), aNewFlight);
			return aNewFlight;
		}
		
	}
	
	public void addFlight(Flight aFlight)
	{
		flights.put(aFlight.getFlightNumber(), aFlight);
	}
	
	public void loadFlightsFromDB()
	{
		try
		{
			Connection conn = 
					DriverManager.getConnection("jdbc:ucanaccess://F:\\College\\2nd Year\\ECLIPSE\\Workspace\\Scotia Airlines Booking System\\Airline.accdb");
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Flight");
			
			while(rs.next())
			{
				String departure = rs.getString(1);
				String arrival = rs.getString(2);
				int rows = rs.getInt(3);
				int columns = rs.getInt(4);
				String flightNo = rs.getString(5);
				
				
				Flight aNewFlight = new Flight(flightNo,departure,arrival,rows, columns);
				addFlight(aNewFlight);
			}
		}
		catch(Exception ex)
		{
			
		}
	}
	
	
	public Seat getSeat(String FlightNo, String SeatNo)
	{
		if(flights.containsKey(FlightNo))
		{
			//if flight exists input flightNo
			Flight currentFlight = flights.get(FlightNo);
			
			//if seat exists within flight return seat found
			if(currentFlight.getSeats().containsKey(SeatNo))
			{
				Seat foundSeat = currentFlight.getSeats().get(SeatNo);
				
				return foundSeat;
			}
			else
			{
				Seat tempSeat = new Seat(SeatNo);
				
				currentFlight.getSeats().put(SeatNo, tempSeat);
				
				return tempSeat;
				
			}
		
			
		}
		else
		{
			return null;
		}
		
		
		
	}
}//end of class
	

