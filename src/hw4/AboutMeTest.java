package hw4;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe(); // Constructor initialized
		
		
		aboutMe.name = "shaim";// variable initialized
		aboutMe.friends = 20;
		aboutMe.bankBlance = 5766648899995l;
		aboutMe.mobile = 4;
		aboutMe.height = 1.8546f;
		aboutMe.ssc = 4.20;
		aboutMe.sex = 'M';
		aboutMe.siblings = 3;
		aboutMe.rich = true;
		aboutMe.aboutme(); // method initialized

		System.out.println("\n--------------------------------------------------------\n");
		AboutMe aboutMe2 = new AboutMe();

		aboutMe2.name = "Alex";// variable initialized
		aboutMe2.friends = 8;
		aboutMe2.bankBlance = 56654565465544l;
		aboutMe2.mobile = 2;
		aboutMe2.height = 1.684f;
		aboutMe2.ssc = 3.80;
		aboutMe2.sex = 'M';
		aboutMe2.siblings = 4;
		aboutMe2.rich = true;
		aboutMe2.aboutme(); // method initialized 

	}

}
