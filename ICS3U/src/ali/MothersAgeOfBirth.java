package ali;

import java.util.Scanner;

/* 
 * MothersAgeOfBirth.Java
 * This program tells you the mother's age of birth when she had the child
 * Amina Ali
 * Mar 8 2016
 */
public class MothersAgeOfBirth {

	public static void main(String[] args) {
	
	Scanner myInput = new Scanner(System.in);
	
	
		// ** variables
		int age; //user's age
		String name; //user's name
		int kidsAge; //user's child age
		String kidsName; //user's child name
		int ageAtBirth; //user's age at birth
		
		
		// ** input
		 System.out.println("What is your name?");
		name = myInput.nextLine();
		
	     System.out.println("What year were your born in?");
		age = Integer.parseInt(myInput.nextLine());
	    		
		 System.out.println("What is your Child's name?");
		 kidsName = myInput.nextLine();
		    	
		 System.out.println("What year was your Child born in?");
		kidsAge = Integer.parseInt(myInput.nextLine());
		    		
	    		
	    		
	    // ** processing
		ageAtBirth = kidsAge - age; // how old is the mother when her child was born
				
       
		// ** output
		System.out.println("if " + name + " was born in " + age + " and " + kidsName + " was born in " + kidsAge + " then, you were " + ageAtBirth + " when " + kidsName + " was born.");
		

	}

}
