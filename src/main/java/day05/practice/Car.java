package day05.practice;


	public class Car {
	    // Instance variables
	    private String brand;
	    private String model;
	    private int year;
	    private String color;

	    // Constructor
	    public Car(String brand, String model, int year, String color) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	        this.color = color;
	    }

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

	
	}

 class Main {
	    public static void main(String[] args) {
	        // Creating instances (objects) of the Car class
	        Car car1 = new Car("Toyota", "Camry", 2022, "Silver");
	        Car car2 = new Car("Honda", "Civic", 2021, "Black");

	        // Setting properties using setters (if available)
	        car1.setColor("Red"); // Assuming setColor() method is available in the Car class
	        car2.setYear(2020);  // Assuming setYear() method is available in the Car class

	        // Accessing properties using getters (if available)
	        System.out.println("Car 1 Details:");
	        System.out.println("Brand: " + car1.getBrand());
	        System.out.println("Model: " + car1.getModel());
	        System.out.println("Year: " + car1.getYear());
	        System.out.println("Color: " + car1.getColor());

	        System.out.println();

	        System.out.println("Car 2 Details:");
	        System.out.println("Brand: " + car2.getBrand());
	        System.out.println("Model: " + car2.getModel());
	        System.out.println("Year: " + car2.getYear());
	        System.out.println("Color: " + car2.getColor());
	    
	}

}
