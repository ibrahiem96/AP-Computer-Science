
public class Lesson1 {

	public static void main (String[] args){		//main method
		
		car nissan = new car();
		nissan.doors = 4;
		nissan.engine = "really good engine";
		nissan.mileage = 123000;	
	}
	
}

class car{

	public void is_valid_car(int wheels){

		if (wheels < 4)
			System.out.println("This is not a valid car");
	}

}

