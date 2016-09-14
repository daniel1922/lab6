import java.util.Scanner; //import scanner class to get 

public class PigLatin {

	public static void main(String[] args) {
	//the application welcomes and prompts the user to enter a word or phrase
	//the application translates the word entered by user into Pig Latin
	//the applications asks the user if they want to repeat	
		
		
		Scanner sc = new Scanner(System.in); 
		String original;
		String translated;
		char firstletter; 
	//welcomes and asks user to enter a word
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.print("enter a word: ");
	    original = sc.next();
	    
	//change entered word into all lowercase characters    
	//if starts with a vowel add way to the end
	    
	    firstletter = original.charAt(0); //
	    translated = original.substring(1) + firstletter + "ay";  
	    System.out.println("in pig latin, it's: " + translated);
			
		
		}
	}


