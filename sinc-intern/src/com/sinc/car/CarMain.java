package com.sinc.car;

import java.util.List;
import java.util.Vector;

public class CarMain {

	public static void main(String[] args) {
		List<Car> cars = new Vector<Car>();
		cars.add(new L3("L3", "1500", 50, 25, 0));
		cars.add(new L5("L5", "2000", 70, 35, 0));

		System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
		for (Car car : cars) {
			System.out.println(car.getName() + "\t" + car.getEngine() + "\t" + car.getOilTank() + "\t"
					+ car.getOilSize() + "\t" + car.getDistance() + "\t" + ((Temp) car).getTempGage());
		}
		System.out.println();

		System.out.println("25 주유");
		System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
		for (Car car : cars) {
			car.setOil(25);
			System.out.println(car.getName() + "\t" + car.getEngine() + "\t" + car.getOilTank() + "\t"
					+ car.getOilSize() + "\t" + car.getDistance() + "\t" + ((Temp) car).getTempGage());
		}
		System.out.println();

		System.out.println("80 주행");
		System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
		for (Car car : cars) {
			car.go(80);
			System.out.println(car.getName() + "\t" + car.getEngine() + "\t" + car.getOilTank() + "\t"
					+ car.getOilSize() + "\t" + car.getDistance() + "\t" + ((Temp) car).getTempGage());
		}
		System.out.println();

	}

}
