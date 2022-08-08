package hw5Q2Constructor;


public class Computer {
	
	// variable declare
	public String brand;
	public String model;
	public String operatingsystem;
	public int price;
	public boolean madeinUSA;
	public char grade;



	public Computer() {
		System.out.println("This default constructor is form Computer Class");

	}

	public Computer(String brand) {
		this.brand = brand;
		System.out.println("This Computer Brand Is: " + brand);
	}



	public Computer(String brand, String model, String operatingsystem, int price, boolean madeinUSA, char grade) {
		this.brand = brand;
		this.model = model;
		this.operatingsystem = operatingsystem;
		this.price = price;
		this.madeinUSA = madeinUSA;
		this.grade = grade;
 System.out.println("This Comptuter Brand: " + brand + ",Model Is: " + model + ",Operatingsystem Is: "+ operatingsystem
		 +",Price Is:" + price +",Computer is MadeInUSA: " + madeinUSA + ",Grade Is:" + grade);
	}
	


}
