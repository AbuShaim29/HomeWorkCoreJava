package hw9Abstraction;

public interface University extends College,Hospital{
	public void classsize();

	public abstract void Playground();

	public void teacher();

	default void gymnasium() {
	}

	public static void library() {
	}
}

/* One keyword are used for the inheritance in interface .
 * an interface can not inherit a regular class or a abstract class by extend keyword. 
 * An Interface can inherit from one or more Interface by extends keyword.
 * 
 */






//we cannot create constructor inside interface class
// constructor only works in public static,final variables,public,abstract class