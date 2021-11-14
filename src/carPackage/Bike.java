package carPackage;

public class Bike implements Vehicule{
	private String brand;
	private long value= 100;
	private Discount discount;
	
	public Bike(String brand) {
		
		if(brand.equals(null)) {
			throw new NullPointerException();
		}else {
			this.brand = brand;
		}
	}
	
	public Bike(String brand, Discount discount) {
		
		if(brand.equals(null)) {
			throw new NullPointerException();
		}else {
			this.brand = brand;
		}
		if(discount != null) {
			this.discount = discount;
			this.value = this.discount.getValue();
		}
	}
	@Override
	public void setDiscount(Discount discount) {
		// TODO Auto-generated method stub
		this.discount = discount;
		this.value = this.discount.getValue();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((discount == null) ? 0 : discount.hashCode());
		result = prime * result + (int) (value ^ (value >>> 32));
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
		Bike other = (Bike) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (discount == null) {
			if (other.discount != null)
				return false;
		} else if (!discount.equals(other.discount))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	@Override
	public long getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return this.brand;
	}
	
	public int compareTo(Object compareTo) {
		
		Vehicule b = (Vehicule) compareTo;
		return (getBrand()+getValue()).compareTo(b.getBrand()+b.getValue());  

    }
}
