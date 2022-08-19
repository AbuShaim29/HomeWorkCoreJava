package hw8Abstraction;

public interface University {
	public void classsize();

	public abstract void Playground();

	public void teacher();

}
//we cannot create constructor inside interface class
// constructor only works in public static,final variables,public,abstract class