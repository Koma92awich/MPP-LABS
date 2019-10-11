package lab5;

public class VehicleFactory {
	private VehicleFactory(){
	}

	public static Vehicle startEngine(String vehicleType) {

		if (vehicleType == null) {
			return null;
		}
		if (vehicleType.equalsIgnoreCase("Bus")) {
			return new Bus();
		}

		else if (vehicleType.equalsIgnoreCase("Truck")) {
			return new Truck();
		} else if (vehicleType.equalsIgnoreCase("ElectricCar")) {
			return new ElectricCar();
		} else if (vehicleType.equalsIgnoreCase("Car")) {
			return new Car();
		}
		return null;

	}

}
