package de.neuefische;

import java.util.Objects;

public class Car {
	private int numberOfTires;
	private int numberOfDoors;
	private boolean seatBelt;
	private boolean airbag;

	public Car(int numberOfTires, int numberOfDoors, boolean seatBelt, boolean airbag) {
		this.numberOfTires = numberOfTires;
		this.numberOfDoors = numberOfDoors;
		this.seatBelt = seatBelt;
		this.airbag = airbag;
	}

	public Car() {
	}

	public int getNumberOfTires() {
		return numberOfTires;
	}

	public void setNumberOfTires(int numberOfTires) {
		this.numberOfTires = numberOfTires;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public boolean isSeatBelt() {
		return seatBelt;
	}

	public void setSeatBelt(boolean seatBelt) {
		this.seatBelt = seatBelt;
	}

	public boolean isAirbag() {
		return airbag;
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return numberOfTires == car.numberOfTires && numberOfDoors == car.numberOfDoors && seatBelt == car.seatBelt && airbag == car.airbag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numberOfTires, numberOfDoors, seatBelt, airbag);
	}

	@Override
	public String toString() {
		return "Car{" +
				"numberOfTires=" + numberOfTires +
				", numberOfDoors=" + numberOfDoors +
				", seatBelt=" + seatBelt +
				", airbag=" + airbag +
				'}';
	}
}
