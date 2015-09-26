
public class Assignment2 {

	public static void main (String[] args){
		house newHouse= new house();
		newHouse.cost= 200000;
		newHouse.doors= 10;
		newHouse.windows= 20;
		newHouse.garages= 2;
		newHouse.neighborhood= "Lombard";
		System.out.println("The new house was " +  newHouse.cost  + " dollars. It has " + newHouse.windows + " windows and " +  newHouse.doors + " doors. It also has " + newHouse.garages + " garages and is located in " + newHouse.neighborhood);
		
		car Honda= new car();
		Honda.cost= 15000;
		Honda.doors= 2;
		Honda.model= "S2000";
		Honda.year= 2005;
		System.out.println("My Honda was " + Honda.cost + " dollars. It is a " + Honda.model + " and has " + Honda.doors + " doors. It is a " + Honda.year + " year model.");
		
		cellphone Galaxy= new cellphone();
		Galaxy.cost= 200;
		Galaxy.brand="Samsung";
		Galaxy.model= "S6";
		System.out.println("My phone was " + Galaxy.cost + " dollars. It is a " + Galaxy.brand + " Galaxy "+ Galaxy.model + "." );
	}
}

	
	class house{
		int cost;
		int doors;
		int windows;
		int garages;
		String neighborhood;
	}
	
	class car{
		int cost;
		int doors;
		String model;
		int year;
		
	}
	
	class cellphone{
		int cost;
		String brand;
		String model;
	}
	
	

