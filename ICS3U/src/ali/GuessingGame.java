package ali;

import java.util.Scanner;

public class GuessingGame {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);

		//*** Variables
		String yesNo;
		int counter = 0;

		// ** Arrays
		String[] food = {"Ice cream", "Lasagna", "Pizza", "Donuts", "Timbits", "Pasta", "Bananna", "Chips", "Candy", "Chocolate", "Burger", "Fries", "Chicken", "Rice", "Nuggets", "Apple", "Salad", "Cake", "Cookies", "Brownie", "Muffin"};
		boolean[] foods = new boolean [food.length];


		// ** input
		System.out.println("Time for a guessing game!! Think of an food.. enter (Y/N) Y for correct, N for incorrect");
		yesNo = scan.nextLine();

		// ** output
		while(yesNo.equalsIgnoreCase("Y")){

			if (yesNo.equalsIgnoreCase("Y")){

				while(counter <10){
					counter++;

					// ** processing
					int cpuGuess = (int)(Math.random()*food.length);
					System.out.println(cpuGuess);

					if (!foods[cpuGuess]){
						System.out.println("Is it " +food[cpuGuess]+ " ? (Y/N)");
						yesNo = scan.nextLine();

						if (yesNo.equalsIgnoreCase("Y")){
							System.out.println("Wow! I win in " + counter + " guesses!");
							counter = 0;
						}

						else if (counter == 10)

							System.out.println("Sorry, you have run out of your 10 guesses.");
						{
							foods[cpuGuess]= true;
						}
					}
				}
			}
			else 
			{

			}


		}
	}






}


