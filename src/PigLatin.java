import java.util.Scanner; //import scanner class to get 

public class PigLatin {

	public static void main(String[] args) {
	//the application welcomes and prompts the user to enter a word or phrase
	//the application translates the word entered by user into Pig Latin
	//the applications asks the user if they want to repeat	
		
		
		Scanner sc = new Scanner(System.in); 
		String original;
		String translated;
		String userCont;
		char firstletter; 
		boolean Cont; 
		
	//welcomes and asks user to enter a word
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.print("enter a word: ");
	    original = sc.nextLine();
	    
	    System.out.println(original.toLowerCase( ) );
	    
	    original = original.toLowerCase();
	    
	//change entered word into all lowercase characters    
	//if starts with a vowel add way to the end
	    System.out.println("Continue? (y/n)");
		userCont =input.nextLine();
	    
	    if(userCont.equalsIgnoreCase("y")){
	    	userCont=true); //update if statement 
	        //need to figure out build specification 3
	    }
	    else {
			firstletter = original.charAt(0);
			//takes first character and isolates it if i replaced (0) with (1) it would isolate the second letter 
			translated = original.substring(1) + firstletter + "ay";
			//takes off the first letter of the inputed word
			System.out.println("in pig latin, it's: " + translated);
		}
	   
	   sc.close(); //use to close 	
	
		}
	
	}


