package ali;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  calculate the two roots of a quadratic equation (ax2 + bx + c) using the quadratic formula
 * March 21 2016	
 * Amina Ali
 */
public class QuadraticFormula {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner scan = new Scanner(System.in);		
		//*** Variables
		int a;
		int b;
		int c;
		double x1;
		double x2;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		//*** Input
		
		System.out.println("Please enter the A value");
		a = Integer.parseInt(scan.nextLine());
		System.out.println("Please enter the B value");
		b = Integer.parseInt(scan.nextLine());
		System.out.println("Please enter the C value");
		c = Integer.parseInt(scan.nextLine());	
				
		x1 = (-b + (Math.sqrt(Math.pow(b,  2) - 4 * a * c)))/(2 * a);
		x2 = (-b + (Math.sqrt(Math.pow(b,  2) - 4 * a * c)))/(2 * a);
				
		//*** Output
		
		
		if (Math.pow(b, 2) - 4 * a * c<0){
			System.out.println("There arent any roots");
		}
		else if (Math.pow(b, 2) - 4 * a * c == 0){
			System.out.println("There is only one root and it is" + df.format(x1));
		}
		else {
			System.out.println("the roots are " + df.format(x1) + " and " + df.format(x2));
		}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
	}

}
