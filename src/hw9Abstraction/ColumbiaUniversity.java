package hw9Abstraction;

/*Only One keyword "extends" is used to inherit a regular Class.
A regular class can inherit only one regular class or one abstract class by extends keyword
A regular class can not inherit an Interface by extends keyword
 inheritance is allow in a regular class
*/






//we cannot create a abstract class inside regular class
//regular class only allow non abstract class
public class ColumbiaUniversity extends MedicalSchool {
	public void biology() {
		System.out.println("This is non abstract class");

	}

	public ColumbiaUniversity() {
	}
//Default method are allowed only in interface,not in regular class.
	@Override
	public void anatomylab() {
		
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
}
