package ali;

import java.util.Scanner;

/*
 * This is a practice If statement
 * March 22 2016
 * Amina Ali
 * 
 */
public class IFStatement {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);	
		
		// *** Variables
		int integer; // the number
		int mnu; // the remainder
		
		// *** input
		System.out.println("Please enter a number");
		integer = Integer.parseInt(scan.nextLine());
		
		// *** processing
		
		mnu = integer % 7;
		
		// *** output
		if (integer > 0) {
			System.out.println("The number is positive");
		}
		else
			System.out.println("The number is negative");
			
		
		if (mnu == 0) {
			System.out.println("The number is divisible by 7");
		}
		else
			System.out.println("The number is not divisible by 7");
		
		
		
	}

}
