package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarInspectionServiceTest {

	@Test
	void hasFourTires_expectTrue_whenCarHasFourTires() {
		// GIVEN
		Car car = new Car(4, 4, true, true);
		// WHEN
		boolean actual = CarInspectionService.hasFourTires(car);
		// THEN
		Assertions.assertTrue(actual);
	}

	@Test
	void hasFourTires_expectFalse_whenCarHasNotFourTires() {
		// GIVEN
		Car car = new Car(3, 4, true, true);
		// WHEN
		boolean actual = CarInspectionService.hasFourTires(car);
		// THEN
		Assertions.assertFalse(actual);
	}

	@Test
	void hasSeatBelt_expectTrue_whenCarHasSeatBelt() {
		// GIVEN
		Car car = new Car(4, 4, true, true);
		// WHEN
		boolean actual = CarInspectionService.hasSeatBelt(car);
		// THEN
		Assertions.assertTrue(actual);
	}

	@Test
	void hasSeatBelt_expectFalse_whenCarHasNoSeatBelt() {
		// GIVEN
		Car car = new Car(4, 4, false, true);
		// WHEN
		boolean actual = CarInspectionService.hasSeatBelt(car);
		// THEN
		Assertions.assertFalse(actual);
	}

	@Test
	void hasAirbag_expectTrue_whenCarHasAirbag() {
		// GIVEN
		Car car = new Car(4, 4, true, true);
		// WHEN
		boolean actual = CarInspectionService.hasAirbag(car);
		// THEN
		Assertions.assertTrue(actual);
	}
	@Test
	void hasAirbag_expectFalse_whenCarHasNoAirbag() {
		// GIVEN
		Car car = new Car(4, 4, true, false);
		// WHEN
		boolean actual = CarInspectionService.hasAirbag(car);
		// THEN
		Assertions.assertFalse(actual);
	}


	@Test
	void hasThreeOrFiveDoors_expectTrue_whenCarHasThreeDoors() {
		// GIVEN
		Car car = new Car(4, 3, true, false);
		// WHEN
		boolean actual = CarInspectionService.hasThreeOrFiveDoors(car);
		// THEN
		Assertions.assertTrue(actual);
	}

	@Test
	void hasThreeOrFiveDoors_expectTrue_whenCarHasFiveDoors() {
		// GIVEN
		Car car = new Car(4, 5, true, false);
		// WHEN
		boolean actual = CarInspectionService.hasThreeOrFiveDoors(car);
		// THEN
		Assertions.assertTrue(actual);
	}

	@Test
	void hasThreeOrFiveDoors_expectFalse_whenCarHasNotFiveOrThreeDoors() {
		// GIVEN
		Car car = new Car(4, 2, true, false);
		// WHEN
		boolean actual = CarInspectionService.hasThreeOrFiveDoors(car);
		// THEN
		Assertions.assertFalse(actual);
	}

	@Test
	void checkCar_expectTrue_whenCarHasFourTiresAndHasSeatBeltAndHasAirbagAndHasThreeDoors() {
		// GIVEN
		Car car = new Car(4, 3, true, true);
		// WHEN
		boolean actual = CarInspectionService.checkCar(car);
		// THEN
		Assertions.assertTrue(actual);
	}

	@Test
	void checkCar_expectTrue_whenCarHasFourTiresAndHasSeatBeltAndHasAirbagAndHasFiveDoors() {
		// GIVEN
		Car car = new Car(4, 5, true, true);
		// WHEN
		boolean actual = CarInspectionService.checkCar(car);
		// THEN
		Assertions.assertTrue(actual);
	}

	@Test
	void checkCar_expectFalse_whenCarHasNotFourTiresAndHasSeatBeltAndHasAirbagAndHasFiveDoors() {
		// GIVEN
		Car car = new Car(3, 5, true, true);
		// WHEN
		boolean actual = CarInspectionService.checkCar(car);
		// THEN
		Assertions.assertFalse(actual);
	}

	@Test
	void checkCar_expectFalse_whenCarHasNotFourTiresAndHasNotSeatBeltAndHasAirbagAndHasFiveDoors() {
		// GIVEN
		Car car = new Car(3, 5, false, true);
		// WHEN
		boolean actual = CarInspectionService.checkCar(car);
		// THEN
		Assertions.assertFalse(actual);
	}

	@Test
	void checkCar_expectFalse_whenCarHasNotFourTiresAndHasNotSeatBeltAndHasNotAirbagAndHasFiveDoors() {
		// GIVEN
		Car car = new Car(3, 5, false, false);
		// WHEN
		boolean actual = CarInspectionService.checkCar(car);
		// THEN
		Assertions.assertFalse(actual);
	}

	@Test
	void checkCar_expectFalse_whenCarHasNotFourTiresAndHasNotSeatBeltAndHasNotAirbagAndHasNotFiveOrThreeDoors() {
		// GIVEN
		Car car = new Car(3, 2, false, false);
		// WHEN
		boolean actual = CarInspectionService.checkCar(car);
		// THEN
		Assertions.assertFalse(actual);
	}
}
