
public class Lesson1 {

	public static void main (String[] args){		//main method
		
		char letters[] = {'a', 'e', 'r', 'y', 't', 'p', 'x', 'k', 'm', 'b'};
		
		retNothing(0);
		
		System.out.println(calculate(3, 6));
		
		System.out.println(wordBuilder(letters));
		
		
	}
	
	public static int calculate(int a, int b){
		
		int result = (a + b) - 5 + 3;
		
		return result;
	}
	
	public static void retNothing(int x){
		x = 23 + 9;
	}
	
	public static String wordBuilder(char[] letters){
		
		String word = "word: ";
		
		for (int i = 0; i < letters.length; i++){
			word += Character.toString(letters[i]);
		}
		
		return word;
		
	}
	
	
}



