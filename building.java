public class building {

	public static void main(String args[]) {

		school cpsa = new school();

		cpsa.classrooms = 20;
		cpsa.hallways= 2;
		cpsa.name= "cpsa";
		cpsa.doors= 50;

	}

}

class school {

	int classrooms;
	int hallways;
	String name;
	int doors;
}