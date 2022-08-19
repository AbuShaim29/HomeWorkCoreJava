package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		BullDog bullDog = new BullDog();// multilevel inheritance
		bullDog.bulldoginfo();
		bullDog.doginfo();
		bullDog.mammalinfo();
		bullDog.animalinfo();

		System.out.println("\n----------------------------------------\n");
		Birds birds = new Birds(); // multilevel inheritance and Hierarchical inheritance
		birds.birdsinfo();
		birds.animalinfo();

		System.out.println("\n--------------------------------------\n");
		Mammal mammal = new Mammal();// multilevel inheritance and Hierarchical inheritance
		mammal.mammalinfo();
		mammal.animalinfo();

		System.out.println("\n-----------------------------------------\n");
		Dog dog = new Dog();// multilevel inheritance
		dog.doginfo();
		dog.animalinfo();
		dog.mammalinfo();

		System.out.println("\n----------------------------------------------\n");
		Cobra cobra = new Cobra();// multilevel inheritance
		cobra.cobrainfo();
		cobra.snakeinfo();
		cobra.animalinfo();
		cobra.reptileinfo();

		System.out.println("\n---------------------------------------------------\n");
		Reptile reptile = new Reptile();// multilevel inheritance and Hierarchical inheritance
		reptile.reptileinfo();
		reptile.animalinfo();

		System.out.println("\n-------------------------------------------------------\n");
		Robin robin = new Robin();// multilevel inheritance
		robin.robininfo();
		robin.birdsinfo();
		robin.animalinfo();

		System.out.println("\n-------------------------------------------------\n");
		Snake snake = new Snake();// multilevel inheritance
		snake.snakeinfo();
		snake.animalinfo();

		System.out.println("\n--------------------------------------------------\n");
		Animal animal = new Animal();// single inheritance and also called parents class,super class
		animal.animalinfo();

	}

}
