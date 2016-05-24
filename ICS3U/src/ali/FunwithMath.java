package ali;
/* Amina Ali 
 * 24/05/2016
 * This is the Fun Math Program. Insert two numbers and It will add, subtract, multiply, and divide the numbers!
 * 
 */

import java.util.Scanner;

public class FunwithMath {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner scan = new Scanner(System.in);
			
			// ** Variables 
			
			int num1;
			int num2;
			int total;
			
			// ** Input
			System.out.println("Please input the first number.");
			num1 = Integer.parseInt(scan.nextLine());
			System.out.println("Please input the second number.");
			num2 = Integer.parseInt(scan.nextLine());
			printMultiply(num1, num2);
			printDivide(num1, num2);
			printAdd(num1, num2);
			printSubtract(num1, num2);

			}
			
		// ** Output
			public static void printMultiply(int num1, int num2)
			{
			int total = num1 * num2;
			System.out.println("" + num1 + " X " + num2 + " = " + total);
			}
			public static void printDivide(double num1, double num2)
			{
			double total = num1 / num2;
			System.out.println("" + num1 + " / " + num2 + " = " + total);
			}
			public static void printAdd(int num1, int num2)
			{
			int total = num1 + num2;
			System.out.println("" + num1 + " + " + num2 + " = " + total);
			}
			public static void printSubtract(int num1, int num2)
			{
			int total = num1 - num2;
			System.out.println("" + num1 + " - " + num2 + " = " + total);
			}

		
		
		
		
	}


