package testCar;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import carPackage.Car;

public class CarTest {

	@Test
	public void testGetBrand() {
		Car car  = new Car("BMW", 20000);
		assertEquals("BMW", car.getBrand());
	}

	@Test
	public void testGetValue() {
		Car car  = new Car("Peugeot", 12000);
		assertEquals(12000, car.getValue());
	}

	@Test
	public void testVetuste() {
		Car car  = new Car("Peugeot", 12000, 2);
		assertEquals(10000, car.getValue());
	}
	
	@Test
	public void testInvalidValue() {
		assertThrows(IllegalArgumentException.class, () -> new Car("Truc", -1));
	}
	
	@Test
	public void testTooOld() {
		assertThrows(IllegalArgumentException.class, () -> new Car("Peugeot", 12000, 200));
	}

	@Test
	public void newCarNoBrand() {
		assertThrows(NullPointerException.class, () -> new Car(null, 20000));
	}
	
	@Test
	public void newCarNoBrand2() {
		assertThrows(NullPointerException.class, () -> new Car(null, 20000, 2));
	}
	
}
