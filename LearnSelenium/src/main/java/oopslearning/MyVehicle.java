package oopslearning;

public class MyVehicle {
	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		Car car = new Car();
		Auto auto=new Auto();
		BigTruck truck=new BigTruck();
		
		vehicle.applyBreak();
		vehicle.soundHorn();
		
		car.openDoor();
		car.applyBreak();
		car.soundHorn();
		
		auto.resetMeter();
		auto.applyBreak();
		auto.soundHorn();
		
		truck.openDoor();
		
		truck.applyBreak();
		truck.soundHorn();
		
		truck.truckType();
	}

}
