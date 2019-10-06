package lab5;

public class Main {

	public static void main(String[] args) {
		
		VehicleFactory vf = new VehicleFactory();
		
		Vehicle vec  = vf.startEngine("ElectricCar");
		vec.startEngine();

	}

}
