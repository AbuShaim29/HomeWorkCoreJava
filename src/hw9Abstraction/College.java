package hw9Abstraction;

//we must have to put abstract keyword in abstract class
//An abstract class can inherit only one abstract class or one regular class by extends key word
//An abstract class can't inherit an Interface by extends key word




public interface College {
	public void commonRoom();

	public abstract void laboratory();

	public void languageClub();
	
	default void dorm() {
	}public static void studyRoom() {
		
	}
}
