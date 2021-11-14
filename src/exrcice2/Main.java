package exrcice2;

import java.util.ArrayList;
import java.util.HashSet;

import carPackage.Car;

public class Main {


	public static void main(String[] args) {
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==d);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(a.equals(d));
		//1- Non le comportement n'est pas naturel puisque b et c sont les meme donc devraient retourner true
		ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		System.out.println(list.indexOf(a));
		System.out.println(list.indexOf(b));
		System.out.println(list.indexOf(c));
		System.out.println(b.equals(c));
		//2-Non c pas un comportement logique list.indexof(c) devrait retourner l'indice de b car ils sont pareil
		//on modify en ajoutant @Override dans equals
		HashSet<Car> set = new HashSet<Car>();
		set.add(b);
		System.out.println(set.contains(c));
		//3- -Non c pas un comportement logique set.contains(c) devrait retourner l'indice de b car ils sont pareil
		//on modify en ajoutant @Override dans hashcode
		
		
	}

}
