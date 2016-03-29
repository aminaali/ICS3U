package ali;
/*
 * User vs. computer
 * March 29 2016
 * Amina Ali
 * 
 */
public class RollDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// *** Variables
		int userRoll;
		int cpuRoll;
		
		// *** Processing
		userRoll = (int)(Math.random() * 6) + 1;
		cpuRoll = (int)(Math.random() * 6) + 1;
		
		if (userRoll > cpuRoll){
			System.out.println("User: " + userRoll + " " + "CPU: " + cpuRoll);
			System.out.println("User wins! CPU Loses!");
		}
		else if (userRoll < cpuRoll){
			System.out.println("User: " + userRoll + " " + "CPU: " + cpuRoll);
			System.out.println("CPU wins! User Loses!");
		}
		else if (userRoll == cpuRoll){
			System.out.println("User: " + userRoll + " " + "CPU: " + cpuRoll);
			System.out.println("It was  tie!");
		}
			
		
		}
		
		
		
	}


