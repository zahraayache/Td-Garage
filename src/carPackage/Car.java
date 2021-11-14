package carPackage;

public class Car implements Vehicule{
	private final String brand ;
	private long value;
	private int vetuste=0;
	private Discount discount;
	
	public Car(String brand, long value) {
		
		if(brand.equals(null)) {
			throw new NullPointerException();
		}else {
			this.brand = brand;
		}
	
		if( value >=0 ){
			this.value = value;
		}else {
			throw new IllegalArgumentException();
		}
	}
	
	public Car(String brand, long value, Discount discount) {
		
		if(brand.equals(null)) {
			throw new NullPointerException();
		}else {
			this.brand = brand;
		}
	
		if( value >=0 ){
			this.value = value;
		}else {
			throw new IllegalArgumentException();
		}
		if(discount != null) {
			this.discount = discount;
			this.value = this.discount.getValue();
		}
		
	}
	public Car(String brand, long value,int vetusite) {
		if(brand.equals(null)) {
			throw new NullPointerException();
		}else {
			this.brand = brand;
		}
		if( value >=0 && vetusite >=0){
			this.vetuste =vetusite;
			
			if( value - this.vetuste*1000 <0 ) {
				throw new IllegalArgumentException();
			}
			else {
				this.value =  value - this.vetuste*1000;
			}
		}else {
			throw new IllegalArgumentException();
		}
	}

	public String getBrand() {
		return brand;
	}

	public long getValue() {
		return value;
	}
	
	
	public boolean contains(Car car) {
		
		return true;
	}

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + (int) (value ^ (value >>> 32));
		result = prime * result + vetuste;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (value != other.value)
			return false;
		if (vetuste != other.vetuste)
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "La voiture " + this.getBrand() + " a une value de ";
	}

	@Override
	public void setDiscount(Discount discount) {
		// TODO Auto-generated method stub
		this.discount = discount;
		this.value = this.discount.getValue();
	}

	@Override
	public int compareTo(Object compareTo) {
		
		Vehicule c = (Vehicule) compareTo;
		return (getBrand()+getValue()).compareTo(c.getBrand()+c.getValue());

    }
	
}
