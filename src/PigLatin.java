	/*This application will do three things. 
	 	* 1. It will and prompts the user to enter a word or phrase
		* 2. It will translates the word entered by user into Pig Latin
		* 3. It will ask the user if they want to repeat*/	

	/*This application needs help :(
	 	* 1. Needs to resolve error on line 39 
		* 2. Add build specification 3
		* 3. Add extended features*/	

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		String original;
		String translated;
		String userCont;
		char firstletter; 
		
		System.out.println("Welcome to the Pig Latin Translator!");//user greeting
		System.out.print("enter a word: ");//user inputs a word
	    original = sc.nextLine();
	    
	    System.out.println(original.toLowerCase( ) );
	    original = original.toLowerCase();
		
		//change inputed word into all lower case characters
		
		//determine if first letter is a vowel
		//if first letter is vowel add "say"
		//else first letter is consonant loop through users inputed word and add "ay" at end
		
	    System.out.println("Continue? (y/n)");
		
		
		 if(userCont.equalsIgnoreCase("y")){
		    	
		    	
		 }
		    else {
				firstletter = original.charAt(0);
				//takes first character and isolates it if i replaced (0) with (1) it would isolate the second letter 
				translated = original.substring(1) + firstletter + "ay";
				//takes off the first letter of the inputed word
				System.out.println("in pig latin, it's: " + translated);
			}
		   
		   sc.close();
	}
}

