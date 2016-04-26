package ali;
/*
 * Amina Ali
 * This program is a list of names, using an array
 * 26/04/2016
 */
import java.util.Scanner;

public class NamesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
				//*variables
				int name;
		
				//** Processing
				System.out.println("How many names are you inputting?");
				name = Integer.parseInt(scan.nextLine());
				
				String [] names=new String [name];
		
				System.out.println("Enter the " + name + " names one by one");
			
				for (int i = 0; i<name; i++) 
						names[i] = scan.nextLine(); 
				
					
					
					for (int i = name - 1; i >=0; i--){	
						
						System.out.println(names[i]);
					}
						
	}

}
