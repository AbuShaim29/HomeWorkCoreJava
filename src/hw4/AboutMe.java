package hw4;

public class AboutMe {

	String name; // variable declared
	short friends;
	long bankBlance;
	byte mobile;
	float height;
	double ssc;
	char sex;
	int siblings;
	boolean rich;
	
 //Constructor declared
	public AboutMe() {
		System.out.println("This is all about us");

	}
 //method implemented
	public void aboutme() {
		System.out.println("My Name Is :" + name + "\nI Have Friends :" + friends + "\nMy Bank Balance Is : "
				+ bankBlance + "\nI Have Mobile :" + mobile + "\nMy Height Is :" + height + "\nMy SSC Results Was :"
				+ ssc + "\nMy Gender Is :" + sex + "\nI Have Siblings :" + siblings + "\nI Am Rich : " + rich);
	}

}
