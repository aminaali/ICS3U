package ali;

import java.util.Scanner;

public class WordGuess {

	@SuppressWarnings({ "unused", "resource", "null" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		// variables and my arrays
		String[] food = {"Ice cream", "Lasagna", "Pizza", "Donuts", "Timbits", "Pasta", "Bananna", "Chips", "Candy", "Chocolate", "Burger", "Fries", "Chicken", "Rice", "Nuggets", "Apple", "Salad", "Cake", "Cookies", "Brownie", "Muffin"};
		int random;
		Scanner scan = new Scanner(System.in);
		String letterGuess = null;
		String wordGuess;
		int  num;
		boolean fullWord = false;
		int counter = 0;
		
		//gets the word
		random = (int) (Math.random() * food.length);
		String word = "";

		for (int i = 0;  i < food[random].length(); i++) {
		word = word + "-";
		}
		System.out.println("Welcome lets play hangman");
		System.out.println("Rules are simple: you guess a letter each time, and if you know the food just enter '!'");
		System.out.println(word);

		do{
		if (word.equals(food[random])){
		fullWord = true;
		}else{
		System.out.println("Guess a letter");
		letterGuess = scan.nextLine();
		if (letterGuess.equals("!")){
		fullWord = true;
		}
		else{

		num = food[random].indexOf(letterGuess);
		if (num== -1){
		System.out.println("that word isnt in there");
		}
		else{
		word = word.substring(0, num) + letterGuess + word.substring ((num+1), word.length()); 

		System.out.println(word);
		}
		}
		}
		} while (!fullWord);
		if (letterGuess.equals("!")){
		System.out.println("Enter the whole word now");
		wordGuess = scan.nextLine();
		if (wordGuess.equalsIgnoreCase(food[random])){
		System.out.println("You guessed the word, Congratulations you won!");
		}
		else {
		System.out.println("you only had one chance to guess the word and you got it wrong so you lost.");
		}
		}
		else {
		System.out.println("You guessed the word, congragulations you won!");
		}



		}
		



		}
		

		
		
		
	
	


