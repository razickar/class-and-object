public class FlightDto{

	
	
	private String airLine;
	private String flightModel;
	private String from;
	private String destination;
	private boolean isPrivateFlight;
	private int ticketPrice;
	
	
	
	public void addBook(String airline,String flightModel,String from,String destination,boolean isPrivateFlight){
		
	this.airLine = airLine;	
	this.flightModel = flightModel;
	this.from = from;
	this.destination = destination;
	this.isPrivateFlight = isPrivateFlight;
	this.ticketPrice = ticketPrice;
	
	}
	 
	public String getAirLine(){
		return airLine;
	}
	public String getFlightModel(){
		return flightModel;
	}
	public String getFrom(){
		return from;
	}
	public String getDestination(){
		return destination;
	}
	public boolean getIsPrivateFlight(){
		return isPrivateFlight;
	}
	public int getTicketPrice(){
		return ticketPrice;
	}
	
	
	public void setAirline(String airLine){
		if(airLine == ""){
		System.out.println("INVALID AIRLINE");
		}
		else{
		
		this.airLine = airLine;
		}
	}
	public void setFlightModel(String flightModel){
		if(flightModel == ""){
		System.out.println("INVALID flightModel");
		}
		else{
		
		this.flightModel = flightModel;
		}
	}
	public void setFrom(String from){
		if(from.isBlank()){
		System.out.println("INVALID from");
		}
		else{
		
		this.from = from;
		}
	}
	public void setDestination(String destination){
		if(destination.isBlank()){
		System.out.println("INVALID destination");
		}
		else{
		
		this.destination = destination;
		}
		
	}
	public void setIsPrivateFlight(boolean isPrivateFlight){
		this.isPrivateFlight = isPrivateFlight;
	}
	public void setTicketPrice(){
		if(ticketPrice < 0){
		System.out.println("INVALID salary");
		}
		else{
		
		this.ticketPrice = ticketPrice;
		}
	}
	
	
	
	public static void main(String[] args){
	
	
	FlightDto spyjet = new FlightDto();
	System.out.println(spyjet.getAirLine());
		
		
	
	}

}

