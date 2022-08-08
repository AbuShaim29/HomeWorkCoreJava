package hw5Q3;

public class Student {

	// variable declare
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from default Constructor of Student class");

	}

	public Student(String stName) {
		this.stName = stName;
		System.out.println("Student name is :" + stName);
	}

	public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student name is :" + stName + "Student ID is :" + stID + "Student SEX is :"
				+ "Student isprogrammer :" + isProgrammer + "Student grade is :" + grade);

	}
}
