package carPackage;

import java.util.*;
public class Garage {
	private ArrayList<Vehicule> carList;
	private static int n;
	private final int id;

	public Garage() {
		carList = new ArrayList<Vehicule>();
		n++;
		this.id = n;
	}

	public void addCar(Vehicule car) {
		if(this.carList.contains(car)) {

		}
		if (Objects.requireNonNull(car) != null) {
			ListIterator<Vehicule> iterator =  carList.listIterator();
	        while(iterator.hasNext()) {
	        	if(iterator.next().compareTo(car) > 0) {
	        		break;
	        	}
	        }
	        iterator.add(car);
			
		}
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String cars = "";
		for( Vehicule car : carList) {
			cars += " " + car.getBrand();
		}
		StringBuilder str = new StringBuilder();
		str.append("Le Garage Numero" + this.getId() + " a " + this.carList.size() + " cars :" + cars);
		return str.toString();
	}

	public int getCarValues() {
		int sommeVALUE =0;
		for(Vehicule car : this.carList) {
			sommeVALUE += car.getValue();
		}
		return sommeVALUE;
	}

	public Vehicule firstCarByBrand(String brand) {

		for(Vehicule car : this.carList) {
			if (car.getBrand() == brand) {
				return car;
			}
		}
		System.out.println("Il ya pas de voiture de cette marque");
		return null;

	}

	public void protectionism(String brand) {
		Iterator<Vehicule> ite = carList.iterator();
	    while (ite.hasNext()) {
	        if (ite.next().getBrand() == brand) {
	            ite.remove();
	            
	        }
	    }
		
	}
	
	
	public void remove(Vehicule car) {
		if(carList.contains(car)) {
			carList.remove(car);
		}
		else {
			throw new IllegalStateException();
		}
	}

	public long getValue() {
		long somme =0;
		// TODO Auto-generated method stub
		for(Vehicule car : this.carList) {
			somme += car.getValue();
		}
		return somme;
	}

	public boolean equals(Garage g) {
		
		return this.carList.equals(g.carList);
		
	}
	public boolean equals(Object o) {
		if (!(o instanceof Garage)) {
			return false;
		}
		Garage garage = (Garage) o;
		Collections.sort(this.carList);
		Collections.sort(garage.carList);
		return this.equals(garage);
	}




}
