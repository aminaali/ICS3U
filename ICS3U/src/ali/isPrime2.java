package ali;

import java.util.Scanner;

public class isPrime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scan = new Scanner(System.in);
			int userNum; // The number the user inputs
			System.out.println("Please enter your number.");
			userNum = Integer.parseInt(scan.nextLine()); 

			if(isPrime2(userNum) == true)
			{
			System.out.println("It is not a prime number");
			}
			else if (isPrime2(userNum) == false)
			{
			System.out.println("It is a prime number");
			}


			}
			private boolean isPrime21(int userNum) {
		// TODO Auto-generated method stub
		return false;
	}
			public static boolean isDivisible(int userNum, int y)
			{
			/**
			*This method finds out if the number is prime or not
			 * @return 
			**/
			if (userNum % y == 0)
			{

			return true; // is not a prime number
			}

			return false; // is a prime number
			}
			public static boolean isPrime2(int userNum)
			{
			/**
			*This method will get the result (prime or not prime)
			**/
			if (userNum ==1 || userNum ==0 || userNum == -1)
			{
			return true;
			}
			for (int i = 2; i < userNum; i++)
			{
			if(isDivisible(userNum, i) == true)
			{
			return true;


			}

			}


			return false;


			}
	}


