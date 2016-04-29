package ali;

public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dice1;
		int dice2;
		int a;

		//** processing
		String[] roll = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
		int[] total = new int[11];


		for (int i = 0; i != 10000; i++) {
		dice1 = (int) (Math.random() * 6) + 1;
		dice2 = (int) (Math.random() * 6) + 1;
		a = dice1 + dice2;

		if (a == 2) {
		total[0]++;
		} else if (a == 3) {
		total[1]++;
		} else if (a == 4) {
		total[2]++;
		} else if (a == 5) {
		total[3]++;
		} else if (a == 6) {
		total[4]++;
		} else if (a == 7) {
		total[5]++;
		} else if (a == 8) {
		total[6]++;
		} else if (a == 9) {
		total[7]++;
		} else if (a == 10) {
		total[8]++;
		} else if (a == 11) {
		total[9]++;
		} else if (a == 12) {
		total[10]++;
		}
		}
		System.out.println("Total      Number of rolls" );
		for(int i=0; i!=11; i++){
		System.out.println(roll[i] +"          " + total[i] );
		}
		}
		

	}


