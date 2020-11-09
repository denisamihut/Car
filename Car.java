package oct27;

public class Car {
	   private String brand;
	   private int horsePower;
	   private double volum;

	public static void main(String[] args) {
		
	
	
	    public String getBrand() {
	        return brand;
	    }

	    public int gethorsePower() {
	        return horsePower;
	    }

	     double getVolum() {
	        return volum;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public void setHorsePower(int horsePower) {
	        this.horsePower = horsePower;
	    }

	    public void setVolum(double volum) {
	        this.volum = volum;
	    }

	    @Override
	    public String toString() {
	        return "Car{" +"brand='" + brand + '\'' + ", hp=" + horsePower + ", volum=" + volum +'}';
	    }
	}
}