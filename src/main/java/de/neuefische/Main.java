package de.neuefische;

public class Main {
	public static void main(String[] args) {
		Car car = new Car(4, 5, true, true);
		if (CarInspectionService.checkCar(car)) {
			System.out.println("Car bekommt TÜV");
		} else {
			System.out.println("Car bekommt keinen TÜV");
		}

		Car car2 = new Car(4, 4, true, true);
		if (CarInspectionService.checkCar(car2)) {
			System.out.println("Car2 bekommt TÜV");
		} else {
			System.out.println("Car2 bekommt keinen TÜV");
		}
	}
}
