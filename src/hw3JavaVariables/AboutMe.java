package hw3JavaVariables;

public class AboutMe {

	int age; // variable declared

	// variable initialize
	String name = "Shaim";
	short friends = 20;
	long bankBalance = 5456555445656556l;
	byte mobile = 4;
	float hieght = 1.85554f;
	double ssc = 4.00;
	char sex = 'm';
	int siblings = 3;
	boolean rich = false;

	public static void main(String[] args) {
		AboutMe me = new AboutMe();
		System.out.println("My Name is =" + me.name + "\nI Have Friend =" + me.friends + "\nMy Bank Balance ="
				+ me.bankBalance + "\nI Have Mobile=" + me.mobile + "\nMy Height is=" + me.hieght + "\nMy SSC gpa is="
				+ me.ssc + "\nMy gender is=" + me.sex + "\nI Have siblings=" + me.siblings + "\nI Am Rich=" + me.rich);

	}
}
