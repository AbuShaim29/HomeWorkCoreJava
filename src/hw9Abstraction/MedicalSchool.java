package hw9Abstraction;

// Can you create a Constructor inside MedicalSchool Abstract Class? If yes, create default Constructor on one of the Abstract Class. If no, comment out the created constructor and answer why not?
public abstract class MedicalSchool  extends NursingSchool{
	public abstract void anatomylab();// abstract method

	public void biochemistryLab() {
		System.out.println("This is non abstract method");
	}

	public MedicalSchool() { // yes we can create a Constructor inside MedicalSchool Abstract Class
	}
}

/*One keywords are used for the inheritance in Java for Abstract Class.
 * An abstract class can inherit only one abstract class or one regular class by extends keyword
 * An abstract can not inherit an interface by extend key word
 * Implements keyword is used to inherit interface in abstract class
 * An abstract class can inherit more than interface
 * An abstract class cannot inherit a regular class or abstract by implement keyword
 */


