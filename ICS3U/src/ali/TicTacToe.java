package ali;

import java.util.Scanner;

public class TicTacToe {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		
		// variables

		String[][] tttBoard = new String[3][3];

		tttBoard[0][0] = "";

		tttBoard[0][1] = "";

		tttBoard[0][2] = "";

		tttBoard[1][0] = "";

		tttBoard[1][1] = "";

		tttBoard[1][2] = "";

		tttBoard[2][0] = "";

		tttBoard[2][1] = "";

		tttBoard[2][2] = "";

		boolean win = false;

		int row;
		int column;
		

		boolean YesorNo = false;

		String play;

		

		System.out.println("Do you want to play Tic Tac Toe (yes/no)");

		play = scan.nextLine();

		if (play.equalsIgnoreCase("yes")) {

			YesorNo = true;

		} else {

			YesorNo = false;

		}while (YesorNo == true) {

		System.out.println("lets play Tic Tac Toe");

		System.out.println("enter from 1-3, first the row, then the column");

		while (win == false) {

		// X's turn

		System.out.println("Where do you want your X to go. read instructions above^");

		row = scan.nextInt();

		column = scan.nextInt();

		// planting x

		tttBoard[row - 1][column - 1] = "X";

		// display's board

		System.out.println(tttBoard[0][0] + " " + tttBoard[0][1] + " " + tttBoard[0][2]);

		System.out.println(tttBoard[1][0] + " " + tttBoard[1][1] + " " + tttBoard[1][2]);

		System.out.println(tttBoard[2][0] + " " + tttBoard[2][1] + " " + tttBoard[2][2]);

		// check's for winner

		if (tttBoard[0][0] == tttBoard[0][1] && tttBoard[0][0] == tttBoard[0][2]

		&& !tttBoard[0][2].equals("")) {

		System.out.println(tttBoard[0][0] + " wins!");

		win = true;

		} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[1][2]

		&& !tttBoard[1][2].equals("")) {

		System.out.println(tttBoard[1][0] + " wins!");

		win = true;

		} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]

		&& !tttBoard[2][2].equals("")) {

		System.out.println(tttBoard[2][0] + " wins!");

		win = true;

		} else if (tttBoard[0][0] == tttBoard[1][0] && tttBoard[0][0] == tttBoard[2][0]

		&& !tttBoard[1][0].equals("")) {

		System.out.println(tttBoard[1][0] + " wins!");

		win = true;

		} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][0] == tttBoard[1][2]

		&& !tttBoard[1][2].equals("")) {

		System.out.println(tttBoard[1][0] + " wins!");

		win = true;

		} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]

		&& !tttBoard[2][2].equals("")) {

		System.out.println(tttBoard[2][0] + " wins!");

		win = true;

		} else if (tttBoard[0][0] == tttBoard[1][1] && tttBoard[0][0] == tttBoard[2][2]

		&& !tttBoard[2][2].equals("")) {

		System.out.println(tttBoard[2][2] + " wins!");

		win = true;

		} else if (tttBoard[0][2] == tttBoard[1][1] && tttBoard[0][2] == tttBoard[2][0]

		&& !tttBoard[0][2].equals("")) {

		System.out.println(tttBoard[0][0] + " wins!");

		win = true;

		} else {

		win = false;
			System.out.println("Tie!!");
		}

		// player 2

		if (win == false) {

		System.out.println("second player, Where do you want the O to go?");

		row = scan.nextInt();
		

		column = scan.nextInt();

		// play 2's O

		tttBoard[row - 1][column - 1] = "O";

		// the board

		System.out.println(tttBoard[0][0] + " " + tttBoard[0][1] + " " + tttBoard[0][2]);

		System.out.println(tttBoard[1][0] + " " + tttBoard[1][1] + " " + tttBoard[1][2]);

		System.out.println(tttBoard[2][0] + " " + tttBoard[2][1] + " " + tttBoard[2][2]);

		// WINNER

		if (tttBoard[0][0] == tttBoard[0][1] && tttBoard[0][0] == tttBoard[0][2]

		&& !tttBoard[0][2].equals("")) {

		System.out.println(tttBoard[0][0] + " wins!");

		win = true;

		} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[1][2]

		&& !tttBoard[1][2].equals("")) {

		System.out.println(tttBoard[1][0] + " wins!");

		win = true;

		} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]

		&& !tttBoard[2][2].equals("")) {

		System.out.println(tttBoard[2][0] + " wins!");

		win = true;

		} else if (tttBoard[0][0] == tttBoard[1][0] && tttBoard[0][0] == tttBoard[2][0]

		&& !tttBoard[1][0].equals("")) {

		System.out.println(tttBoard[1][0] + " wins!");

		win = true;

		} else if (tttBoard[1][0] == tttBoard[1][1] && tttBoard[1][0] == tttBoard[1][2]

		&& !tttBoard[1][2].equals("")) {

		System.out.println(tttBoard[1][0] + " wins!");

		win = true;

		} else if (tttBoard[2][0] == tttBoard[2][1] && tttBoard[2][0] == tttBoard[2][2]

		&& !tttBoard[2][2].equals("")) {

		System.out.println(tttBoard[2][0] + " wins!");

		win = true;

		} else if (tttBoard[0][0] == tttBoard[1][1] && tttBoard[0][0] == tttBoard[2][2]

		&& !tttBoard[2][2].equals("")) {

		System.out.println(tttBoard[2][2] + " wins!");

		win = true;

		} else if (tttBoard[0][2] == tttBoard[1][1] && tttBoard[0][2] == tttBoard[2][0]

		&& !tttBoard[0][2].equals("")) {

		System.out.println(tttBoard[0][0] + " wins!");

		win = true;

		} else {

		win = false;

		}

		if (!tttBoard[0][0].equals("") && !tttBoard[0][1].equals("") && !tttBoard[0][2].equals("")

		&& !tttBoard[1][0].equals("") && !tttBoard[1][1].equals("") && !tttBoard[1][2].equals("")

		&& !tttBoard[2][0].equals("") && !tttBoard[2][1].equals("") && !tttBoard[2][2].equals("")) {

		win = true;



		}

		}

		}

		System.out.println("Do you want to play again?");

		scan.nextLine();

		play = scan.nextLine();

		if (play.equalsIgnoreCase("yes")) {

			YesorNo = true;

		win = false;

		tttBoard[0][0] = "";

		tttBoard[0][1] = "";

		tttBoard[0][2] = "";

		tttBoard[1][0] = "";

		tttBoard[1][1] = "";

		tttBoard[1][2] = "";

		tttBoard[2][0] = "";

		tttBoard[2][1] = "";

		tttBoard[2][2] = "";

		} else {

			YesorNo = false;

		}

		}

		System.out.println("Guess we wont play");

		}

		
	}


