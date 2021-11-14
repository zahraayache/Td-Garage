package carPackage;

public interface Vehicule extends Comparable{
	final String brand ="";
	final long value =100;
	boolean discout = false;
	long getValue();
	String getBrand();
	void setDiscount(Discount discount);
	public default int compareTo(Object o) {
		// TODO Auto-generated method stub
    	Vehicule v = (Vehicule) o;
		return this.getClass().getName().compareTo(v.getClass().getName());
	}
	
	
}
