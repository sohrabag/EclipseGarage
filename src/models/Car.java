package models;

import utilities.VehicleType;

public class Car extends Vehicle {

	public Car(String registrationNumber, String color, int numberOfWheels) {
		super(registrationNumber);
		this.color = setColor(color);
		this.numberOfWheels = numberOfWheels;
		this.vehicleType = VehicleType.CAR;

	}


	protected String setColor(String color) {
		if (color.equals("Black")) {
			this.color = color;
		}
		else if (color.equals("White") ) {
			this.color = color;
		}
		else if (color.equals("Green") ) {
			this.color = color;
		}
		else if (color.equals("Red") ) {
			this.color = color;
		}
		else if (color.equals("Yellow") ) {
			this.color = color;
		}
		else {
			throw new ColorNotFoundException();
		}

		public String getColor() throws ColorNotFoundException {
			return this.color;
		}

		public String toString

	}
