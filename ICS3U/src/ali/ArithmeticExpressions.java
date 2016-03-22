package ali;
/*
 * The sum of all five numbers
The result after subtracting the second number from the third
The product of the first and fifth numbers
The quotient of the fourth number divided by the second
The remainder when dividing the fourth number by the second
The first number raised to the power of the third number
The square root of the fifth number
 * Mar 03 2016
 * Amina Ali
 */
import java.util.Scanner;

public class ArithmeticExpressions {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scan = new Scanner(System.in);

		
		// ** Variables
		double nmbr1; // first number
		double nmbr2; // second number
		double nmbr3; // third number
		double nmbr4; // fourth number
		double nmbr5; // fifth number
		double sum; // first answer
		double subtract; // second answer
		double product; // third answer
		double quotient; // fourth answer
		double remainder; // fifth answer
		double power; // sixth answer
		double sqrtRoot; // seventh answer
		
		// **inputs
		
		System.out.println("What is your first number?");
		nmbr1 = Double.parseDouble(scan.nextLine());
		System.out.println("What is your second number?");
		nmbr2 = Double.parseDouble(scan.nextLine());
		System.out.println("What is your third number?");
		nmbr3 = Double.parseDouble(scan.nextLine());
		System.out.println("What is your fourth number?");
		nmbr4 = Double.parseDouble(scan.nextLine());
		System.out.println("What is your fifth number?");
		nmbr5 = Double.parseDouble(scan.nextLine());
		
		// ** processing
		
		sum = nmbr1 + nmbr2 + nmbr3 + nmbr4 + nmbr5;
		subtract = nmbr3 - nmbr2;
		product = nmbr1 * nmbr4;
		quotient = nmbr4%nmbr2;
		remainder = nmbr4 / nmbr2;
		power = (Double)Math.pow(nmbr1,  nmbr3);		
		sqrtRoot = (Double)Math.sqrt(nmbr5);
		
		//** outputs
		
		System.out.println("The sum of all numbers are " + sum + " ");
		System.out.println("The subtract is " + subtract + "" );
		System.out.println("The product is " + product + "" );
		System.out.println("The quotient is " + quotient + "" );
		System.out.println("The remainder is " + remainder + "" );
		System.out.println("The power is " + power + "" );
		System.out.println("The sqrtRoot is " + sqrtRoot + "" );
	}
}
