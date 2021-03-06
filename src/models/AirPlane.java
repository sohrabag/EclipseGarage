package models;

import utilities.VehicleType;

public class AirPlane extends Vehicle {
	
	private String airlineName;
	
	public AirPlane(String registrationNumber, int numberOfWheels, String airlineName) throws AirlineNameNotFoundException {
		super(registrationNumber);
		this.numberOfWheels = numberOfWheels;
		this.vehicleType = VehicleType.AIRPLANE;
		this.setAirlineName(airlineName);
	}
	
	public void setAirlineName(String airlineName) throws AirlineNameNotFoundException
	{
		if(airlineName.equalsIgnoreCase("SAS")) {
			this.color = "white";
			this.airlineName = airlineName;
		}
		else if(airlineName.equalsIgnoreCase("Alitalia")) {
			this.color = "Green";
			this.airlineName = airlineName;			
		}
		else if(airlineName.equalsIgnoreCase("Berlin")) {
			this.color = "Red";		
			this.airlineName = airlineName;	
		}

		else
			throw new AirlineNameNotFoundException();
	}
	
	public String toString() {
		System.out.println();
		StringBuilder sb = new StringBuilder();
		sb.append("-------- Airplane ---------\n");
		sb.append("registration number is: ");
		sb.append(this.registrationNumber);
		sb.append("\n");
		sb.append("color is: ");
		sb.append(this.color);
		sb.append("\n");
		sb.append("number of wheels: ");
		sb.append(numberOfWheels);
		sb.append("\n");
		sb.append("airplane name is: ");
		sb.append(this.getAirlineName().toUpperCase());
		
		return sb.toString();
	}

	public String getAirlineName() {
		return airlineName;
	}
}
