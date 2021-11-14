package testCar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import carPackage.Car;
import carPackage.Garage;

public class GarageTest {
	

	@Test
	public void firstCarByBrand() {
		Car car1 = new Car("BMW", 750000);
		Car car2 = new Car("Peugeot", 75000);
		Car car3 = new Car("Peugeot", 80000);
		Garage garage = new Garage();
		garage.addCar(car1);
		garage.addCar(car2);
		garage.addCar(car3);
		assertSame(car1, garage.firstCarByBrand("BMW"));
		assertSame(car2, garage.firstCarByBrand("Peugeot"));
	}

	@Test
	public void firstCarByBrand2() {
		Car car = new Car("Truc", 6000);
		Garage garage = new Garage();
		garage.addCar(car);
		assertNull(garage.firstCarByBrand("Bli"));
	}

	@Test
	public void testWithNull() {
		Garage garage = new Garage();
		assertThrows(NullPointerException.class, () -> garage.addCar(null));
		//assertThrows(NullPointerException.class, () -> garage.firstCarByBrand("Renault"));
	}

	
	@Test
	public void getPrice() {
		Car car1 = new Car("BMW", 750000);
		Car car2 = new Car("Peugeot", 75000);
		Garage garage = new Garage();
		garage.addCar(car1);
		garage.addCar(car2);
		assertEquals(car1.getValue() + car2.getValue(), garage.getCarValues());
	}
	
	@Test
	public void testGetIDIncr() {
		for(int i=0;i<1000;i++) {
			new Garage();
		}
		Garage garagen = new Garage();
		Garage garagen2 = new Garage();
		Garage garagen3 = new Garage();
		System.out.println(garagen.getId()+ " " + garagen2.getId() + " " + garagen3.getId());
		assertEquals(garagen.getId(), garagen2.getId()-1);
	}
	
}
