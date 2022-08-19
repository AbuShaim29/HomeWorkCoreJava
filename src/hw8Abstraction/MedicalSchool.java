package hw8Abstraction;

// Can you create a Constructor inside MedicalSchool Abstract Class? If yes, create default Constructor on one of the Abstract Class. If no, comment out the created constructor and answer why not?
public abstract class MedicalSchool {
	public abstract void anatomylab();// abstract method

	public void biochemistryLab() {
		System.out.println("This is non abstract method");
	}

	public MedicalSchool() { // yes we can create a Constructor inside MedicalSchool Abstract Class
	}
}
