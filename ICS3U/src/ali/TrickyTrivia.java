
package ali;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Scanner;

import hsa_new.Console;
/**
 * @author 323009274
 *
 */
public class TrickyTrivia {

	static Console trivia ;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// pictures
		Image jpgtricky_triviaImage = Toolkit.getDefaultToolkit().getImage("tricky trivia.jpg");
		
		
		String subject;
		trivia = new Console(45,155);
		Scanner scan = new Scanner(System.in);
		// ask user 
	
		
		trivia.println("Welcome to Tricky Trivia! Please enter your name");
				while(!(Toolkit.getDefaultToolkit().prepareImage(jpgtricky_triviaImage, jpgtricky_triviaImage.getWidth(null), jpgtricky_triviaImage.getHeight(null), null)));

		trivia.drawImage (jpgtricky_triviaImage, 150, 150, 500, 300, null);
		subject = trivia.readLine();
		
		trivia.println("\n" + "In this trivia, you can be quized on 4 different categories! SONGS, TV SHOWS, CELEBS, AND GAMES");
		trivia.println("\n" + "Please type the category you want to play.");
		subject = trivia.readLine();
		trivia.clear();
		
		// store user input in a variable
		int totalPoints = 0;
		int grandTotal = 0;

		// directing to a proper method
		if (subject.equalsIgnoreCase("Songs")){
			totalPoints = songsCategory(totalPoints); 
		}
		else if (subject.equalsIgnoreCase("tv shows")){
			totalPoints = tvshowCategory(totalPoints);
		}
		else if (subject.equalsIgnoreCase("celebs")){
			totalPoints = celebsCategory(totalPoints);
		}
		
		else if (subject.equalsIgnoreCase("games")){
			totalPoints = gamesCategory(totalPoints);
		}
		
		
		// return value by adding it to an array
		
		grandTotal = grandTotal + totalPoints;
		
		// while loop to ask the user to continue
		
		while(true)
		{
		trivia.println(" You have won " + grandTotal + " worth of points. would you like to continue? (Yes / No)");
		String answer;
		answer = trivia.readLine();
		
		// user wants to continue playing
		if (answer.equalsIgnoreCase("yes"))
		{
			trivia.println("Please enter the name of the subject you wish to be quizzed on. SONGS, TV SHOWS, CELEBS, OR GAMES");	
			subject = trivia.readLine();
			totalPoints = 0;
				if (subject.equalsIgnoreCase("songs"))
				{
					totalPoints = totalPoints + songsCategory(totalPoints);
				}
				else if (subject.equalsIgnoreCase("tv shows"))
				{
					totalPoints = totalPoints + tvshowCategory(totalPoints);
				}
				else if (subject.equalsIgnoreCase("celebs"))
				{
					totalPoints = totalPoints + celebsCategory(totalPoints);
				}
				else if (subject.equalsIgnoreCase("games"))
				{
					totalPoints = totalPoints + gamesCategory(totalPoints);
				}			
				else {
					trivia.println("sorry invalid answer, please enter a valid answer!");
				}               
				 
		}
		
		// if the user doesn't want to continue playing
		
		else if (subject.equalsIgnoreCase("no")){
			trivia.println(" Thanks for playing! You have won " + totalPoints + " worth of points.");
			
		}
		
		
		
		}
		
	}
		
	public static int songsCategory(int totalPoints)
	{
		// create new scanner
		Scanner scan = new Scanner(System.in);
		
		//output a greeting
		trivia.println("\n" + "Welcome to the SONGS CATEGORY of Tricky Trivia!, Lets Begin! Please Select A, B, C or D");
		
		
		// declaring arrays
		
		String [] songsQuestions = new String [10];
		String [] songsAnswers = new String [10];
		Image [] songsPicture = new Image[10];
		String userAnswers = new String();
		
		
		
		// Assign question & answer to array

		
		songsQuestions[0] = "Who made the debut single Pillow Talk?" + "\n" + "A. Justin Bieber" + "\n" + "B. Zayn Malik" + "\n" +"C. One Direction" + "\n" + "D. Drake";
		songsAnswers[0] = "B";
		songsPicture[0] = Toolkit.getDefaultToolkit().getImage("zayn.jpg");
			
		songsQuestions[1] = "What was Michael Jacksons last song?" + "\n" + "A. One More Chance" + "\n" + "B. Thriller" + "\n" +"C. Beat it" + "\n" + "D. Got to Be There ";
		songsAnswers[1] = "A";
		songsPicture[1] = Toolkit.getDefaultToolkit().getImage("michael.jpg");
		
		songsQuestions[2] = "What was Justin Bieber's first hit?" + "\n" + "A. Baby" + "\n" + "B. One time" + "\n" +"C. One less lonley girl" + "\n" + "D. My world";
		songsAnswers[2] = "B";
		songsPicture[2] = Toolkit.getDefaultToolkit().getImage("jb.jpg");
		
		songsQuestions[3] = "'Down came the rain.. & washed the spider out'" + "\n" + "A. Humpty Dumpty" + "\n" + "B. Mary had a little lamb" + "\n" +"C. Ittsy Bittsy Spider" + "\n" + "D. Monekys jumping on the bed";
		songsAnswers[3] = "C";
		songsPicture[3] = Toolkit.getDefaultToolkit().getImage("nr.jpg");
		
		songsQuestions[4] = "'Im all the way.. Nothing can stop me'" + "\n" + "A. Drake" + "\n" + "B. Lil Wayne" + "\n" +"C. J cole" + "\n" + "D. Fat Joe and Remy Ma";
		songsAnswers[4] = "D";
		songsPicture[4] = Toolkit.getDefaultToolkit().getImage("n.jpg");
		
		songsQuestions[5] = "' Baby, You light up my world like nobody else, the way that you flip your hair gets me overwhelmed' " + "\n" + "A. Justin Bieber" + "\n" + "B. Zayn Malik" + "\n" +"C. One Direction" + "\n" + "D. Drake";
		songsAnswers[5] = "C";
		songsPicture[5] = Toolkit.getDefaultToolkit().getImage("1d.jpg");
		
		songsQuestions[6] = " 'Hey whats up hello? Seen your pretty *** soon as you came through the door' " + "\n" + "A. Justin Bieber" + "\n" + "B. Fetty wap" + "\n" +"C. French Montana" + "\n" + "D. Nicki Minaj";
		songsAnswers[6] = "B";
		songsPicture[6] = Toolkit.getDefaultToolkit().getImage("fetty.jpg");
		
		songsQuestions[7] = "' woppin' gangnum style.. woop woop" + "\n" + "A. Lady gaga" + "\n" + "B. Nicki Minaj" + "\n" +"C. Taylow Swift" + "\n" + "D. PSY";
		songsAnswers[7] = "D";
		songsPicture[7] = Toolkit.getDefaultToolkit().getImage("psy.jpg");
		
		songsQuestions[8] = "Destiny Child's first album was.." + "\n" + "A. The writtings on the wall" + "\n" + "B. Survivor " + "\n" +"C. Love ones" + "\n" + "D. Say My Name";
		songsAnswers[8] = "A";
		songsPicture[8] = Toolkit.getDefaultToolkit().getImage("destiny-read.jpg");
		
		songsQuestions[9] = "Drake's latest Album was.." + "\n" + "A. Nothing was the same" + "\n" + "B. Views" + "\n" +"C. Take care " + "\n" + "D. What a time to be alive";
		songsAnswers[9] = "b";
		songsPicture[9] = Toolkit.getDefaultToolkit().getImage("drake.jpg");
		
		// Make a for loop to output each question
		
		for (int i = 0; i<= 9; i++)
		{
			trivia.println(songsQuestions[i]);
			trivia.drawImage (songsPicture[i], 150, 400, 600, 500, null);
			
			// Store user answer into an array
			userAnswers = trivia.readLine();
			
			// Checking if user answer is correct 
			if(userAnswers.equalsIgnoreCase(songsAnswers[i]))
			{
				trivia.println("You are Correct! You get 1 points");
				totalPoints = totalPoints + 1;
				try {
					 Thread.sleep (2000);
					 } catch (InterruptedException e) {
					 // TODO Auto-gene.
						 
					 }
				
			}
			else
			{
				trivia.println("Sorry the answer was " + songsAnswers[i] + ".");
				try {
					 Thread.sleep (2000);
					 } catch (InterruptedException e) {
					 // TODO Auto-generated catch block
					 e.printStackTrace();
					 }
			}	
			trivia.clear();
	}
		
		//return the value of points to the main
		return (totalPoints);	}
		
	public static int tvshowCategory(int totalPoints)
	{
	// create new scanner
			Scanner scan = new Scanner(System.in);
			
			//output a greeting
			trivia.println("\n" + "Welcome to the TV SHOW CATEGORY of Tricky Trivia!, Lets Begin! Please Select A, B, C or D");
			
			
			// declaring arrays
			String [] tvshowsQuestions = new String [10];
			String [] tvshowsAnswers = new String [10];
			Image [] tvshowsPicture = new Image[10];
			String userAnswers = new String();
			
			// Assign question & answer to array

			
			tvshowsQuestions[0] = "\n" + "Who is in the lead female role in the 100?" + "\n" + "A. Clark" + "\n" + "B. Raven" + "\n" +"C. Abby" + "\n" + "D. Harper";
			tvshowsAnswers[0] = "A";
			tvshowsPicture[0] = Toolkit.getDefaultToolkit().getImage("100.jpg");
				
			tvshowsQuestions[1] = "\n" + "What season did Derek Sheppard from Grey's Anatomy Die? " + "\n" + "A. Season 2" + "\n" + "B. Season 5" + "\n" +"C. Season 12" + "\n" + "D. Season 11 ";
			tvshowsAnswers[1] = "D";
			tvshowsPicture[1] = Toolkit.getDefaultToolkit().getImage("derek.jpg");
		
			tvshowsQuestions[2] = "\n" + "Who did Izzie Stevens date in Greys Anatomy? " + "\n" + "A. George O'Mailey" + "\n" + "B. Denny Duquette " + "\n" +"C. Alex Kurev" + "\n" + "D. All of the Above";
			tvshowsAnswers[2] = "D";
			tvshowsPicture[1] = Toolkit.getDefaultToolkit().getImage("izzie.jpg");
			
			tvshowsQuestions[3] = "\n" + "Who are the murderes in 'How to get away with Murder'?" + "\n" + "A. The lawyers" + "\n" + "B. The teacher" + "\n" +"C. The students" + "\n" + "D. All of the above";
			tvshowsAnswers[3] = "D";
			tvshowsPicture[3] = Toolkit.getDefaultToolkit().getImage("murder.jpg");
			
			tvshowsQuestions[4] = "\n" + "Who is the main character in the Walking Dead" + "\n" + "A. Rick Grimes" + "\n" + "B. Carol Grimes" + "\n" +"C. Daryl Dixon " + "\n" + "D. Glenn Rhee";
			tvshowsAnswers[4] = "A";
			tvshowsPicture[4] = Toolkit.getDefaultToolkit().getImage("walking.jpg");
			
			tvshowsQuestions[5] = "\n" + "Who killed Flash's mom from the show 'The Flash'" + "\n" + "A. Negative Flash" + "\n" + "B. Harrison Wells " + "\n" +"C. Eur Barrett Thong " + "\n" + "D. All of the above";
			tvshowsAnswers[5] = "D";
			tvshowsPicture[5] = Toolkit.getDefaultToolkit().getImage("flash.jpg");
			
			tvshowsQuestions[6] = "\n" + "Who is the villan in Pretty Little Liars " + "\n" + "A. - B" + "\n" + "B. - A" + "\n" +"C. - Liars" + "\n" + "D. - Killer";
			tvshowsAnswers[6] = "B";
			tvshowsPicture[6] = Toolkit.getDefaultToolkit().getImage("pll.jpg");
			
			tvshowsQuestions[7] = "\n" + "What does Walter White produce in the 'Breaking Bad'" + "\n" + "A. Cocaine" + "\n" + "B. Crystal Meth" + "\n" +"C. Moli" + "\n" + "D. Heroine";
			tvshowsAnswers[7] = "B";
			tvshowsPicture[7] = Toolkit.getDefaultToolkit().getImage("bb.jpg");
			
			tvshowsQuestions[8] = "\n" + "What are the faries Name in`Fairy Odd Parents`?" + "\n" + "A. Cosmo & Wanda" + "\n" + "B. Carter & Waneta " + "\n" +"C. Waneta & Cosomo" + "\n" + "D. Carter & Wanda";
			tvshowsAnswers[8] = "A";
			tvshowsPicture[8] = Toolkit.getDefaultToolkit().getImage("fairy.jpg");
			
			tvshowsQuestions[9] = "\n" + "What is Mr. Krab's Daughter name in 'Sponge Bob Square Pants'?" + "\n" + "A. Mercedes" + "\n" + "B. Diamond" + "\n" +"C. Pearl " + "\n" + "D. Gold";
			tvshowsAnswers[9] = "C";
			
			// Make a for loop to output each question
			
			for (int i = 0; i<= 9; i++)
			{
				trivia.println(tvshowsQuestions[i]);
				trivia.drawImage (tvshowsPicture[i], 150, 400, 600, 500, null);
				
				// Store user answer into an array
				userAnswers = trivia.readLine();
			
				
				// Checking if user answer is correct 
				if(userAnswers.equalsIgnoreCase(tvshowsAnswers[i]))
				{
					trivia.println("\n" + "You are Correct! You get 1 points"+ "\n" );
					totalPoints = totalPoints + 1;
					 try {
						 Thread.sleep (2000);
						 } catch (InterruptedException e) {
						 // TODO Auto-generated catch block
						 e.printStackTrace();
						 }					
				}
				else
				{
					trivia.println("\n" + "Sorry the answer was " + tvshowsAnswers[i] + "." + "\n" );
					 try {
						 Thread.sleep (2000);
						 } catch (InterruptedException e) {
						 // TODO Auto-generated catch block
						 e.printStackTrace();
						 }

				}	
				trivia.clear();
		}
			
			//return the value of points to the main
			return (totalPoints);	}
	
	public static int celebsCategory(int totalPoints)
	{
		// create new scanner
				Scanner scan = new Scanner(System.in);
				
				//output a greeting
				trivia.println("\n" + "Welcome to the CELEBS CATEGORY of Tricky Trivia!, Lets Begin! Please Select A, B, C or D");
				
				
				// declaring arrays
				String [] celebsQuestions = new String [10];
				String [] celebsAnswers = new String [10];
				Image [] celebsPicture = new Image[10];
				String userAnswers = new String();
				
				// Assign question & answer to array

				
				celebsQuestions[0] = "What is Kim Kardashian & Kanye west son name?" + "\n" + "A. North West" + "\n" + "B. Saint West" + "\n" +"C. South West" + "\n" + "D. East West";
				celebsAnswers[0] = "B";
				celebsPicture[0] = Toolkit.getDefaultToolkit().getImage("saint.jpg");
				
				celebsQuestions[1] = "Who is the youngest Kardashian? " + "\n" + "A. Kim" + "\n" + "B. Khloe" + "\n" +"C. Kylie" + "\n" + "D. Kourtney";
				celebsAnswers[1] = "D";
				celebsPicture[1] = Toolkit.getDefaultToolkit().getImage("kk.jpg");
				
				celebsQuestions[2] = "Which member left One direction?" + "\n" + "A. Zayn Malik" + "\n" + "B. Harry Styles " + "\n" +"C. Nial Horan" + "\n" + "D. Liam Payne";
				celebsAnswers[2] = "A";
				celebsPicture[2] = Toolkit.getDefaultToolkit().getImage("1dd.jpg");
				
				celebsQuestions[3] = "How long was Kim Kardashian's marriage with Kris Humphries " + "\n" + "A. 28 days" + "\n" + "B. 1 day" + "\n" +"C. 2 months" + "\n" + "D. 72 days";
				celebsAnswers[3] = "D";
				celebsPicture[3] = Toolkit.getDefaultToolkit().getImage("kkk.jpg");
				
				celebsQuestions[4] = "Who did Zayn Malik date after he left the band?" + "\n" + "A. Gigi Hadid" + "\n" + "B. Perrie Edwards " + "\n" +"C. Kehlani" + "\n" + "D. Rihanna";
				celebsAnswers[4] = "A";
				celebsPicture[4] = Toolkit.getDefaultToolkit().getImage("zg.jpg");
				
				celebsQuestions[5] = "Where is Drake from?" + "\n" + "A. Seatle" + "\n" + "B. Missisauga" + "\n" +"C. Toronto" + "\n" + "D. New York";
				celebsAnswers[5] = "C";
				celebsPicture[5] = Toolkit.getDefaultToolkit().getImage("drake.jpg");
				
				celebsQuestions[6] = "What is The Weeknd's background?" + "\n" + "A. Somalia" + "\n" + "B. Eritrea" + "\n" +"C. Ethopia" + "\n" + "D. Sudan";
				celebsAnswers[6] = "C";
				celebsPicture[6] = Toolkit.getDefaultToolkit().getImage("w.jpg");
				
				celebsQuestions[7] = "What is J cole's labels name?" + "\n" + "A. Young Money" + "\n" + "B. Dreamville" + "\n" +"C. OVO" + "\n" + "D. XO";
				celebsAnswers[7] = "B";
				celebsPicture[7] = Toolkit.getDefaultToolkit().getImage("j.jpg");
				
				celebsQuestions[8] = "Which celeberty cut their hair short?" + "\n" + "A. Halle Berry" + "\n" + "B. Amber Rose " + "\n" +"C. Miley Cyrus" + "\n" + "D. All of the above";
				celebsAnswers[8] = "D";
				celebsPicture[8] = Toolkit.getDefaultToolkit().getImage("saint.jpg");
				
				celebsQuestions[9] = "Which celeberty never smiles?" + "\n" + "A. Emeninem" + "\n" + "B. Lil Wayne" + "\n" +"C. Kanye West " + "\n" + "D. Donald Trump";
				celebsAnswers[9] = "C";
				
				
				// Make a for loop to output each question
				
				for (int i = 0; i<= 9; i++)
				{
					trivia.println(celebsQuestions[i]);
					trivia.drawImage (celebsPicture[i], 150, 400, 600, 500, null);
					
					
					// Store user answer into an array
					userAnswers = trivia.readLine();
					
					// Checking if user answer is correct 
					if(userAnswers.equalsIgnoreCase(celebsAnswers[i]))
					{
						trivia.println("You are Correct! You get 1 points");
						totalPoints = totalPoints + 1;
						try {
							 Thread.sleep (2000);
							 } catch (InterruptedException e) {
							 // TODO Auto-generated catch block
							 e.printStackTrace();
							 }
						
					}
					else
					{
						trivia.println("Sorry the answer was " + celebsAnswers[i] + ".");
						try {
							 Thread.sleep (2000);
							 } catch (InterruptedException e) {
							 // TODO Auto-generated catch block
							 e.printStackTrace();
							 }
						
					}	
					trivia.clear();
			}
				
				//return the value of points to the main
				return (totalPoints);	}
	public static int gamesCategory(int totalPoints)
	{
	// create new scanner
			Scanner scan = new Scanner(System.in);
			
			//output a greeting
			trivia.println("\n" + "Welcome to the Games CATEGORY of Tricky Trivia!, Lets Begin! Please Select A, B, C or D");
			
			
			// declaring arrays
			String [] gamesQuestions = new String [10];
			String []  gamesAnswers = new String [10];
			Image [] gamesPicture = new Image[10];
			String userAnswers = new String();
			
			// Assign question & answer to array

			
			 gamesQuestions[0] = "Who is Mario's enemy?" + "\n" + "A. Yoshi" + "\n" + "B. Bowzer " + "\n" +"C. Luigi" + "\n" + "D. Princess Peach";
			 gamesAnswers[0] = "B";
			 gamesPicture[0] = Toolkit.getDefaultToolkit().getImage("mario.jpg");
				
			 gamesQuestions[1] = "What Animal is Sonic?" + "\n" + "A. HedgeHodge" + "\n" + "B. Armadillo" + "\n" +"C. Squirell" + "\n" + "D. Chipmunk";
			 gamesAnswers[1] = "A";
			 gamesPicture[1] = Toolkit.getDefaultToolkit().getImage("sonic.jpg");
		
			 gamesQuestions[2] = "What year was NBA 2k released?" + "\n" + "1999" + "\n" + "B. 2000" + "\n" +"C. 2001" + "\n" + "D. 2007";
			 gamesAnswers[2] = "B";
			 gamesPicture[2] = Toolkit.getDefaultToolkit().getImage("2k.jpg");
			
			 gamesQuestions[3] = "What system is gamertag used in?" + "\n" + "A. Playstation" + "\n" + "B. X BOX" + "\n" +"C. None" + "\n" + "D. Both";
			 gamesAnswers[3] = "C";
			 gamesPicture[3] = Toolkit.getDefaultToolkit().getImage("gg.jpg");
			
			 gamesQuestions[4] = "When was was the video game 'FIFA' first released?" + "\n" + "A. 1985" + "\n" + "B. 1999" + "\n" +"C. 2002" + "\n" + "D. 1993";
			 gamesAnswers[4] = "D";
			 gamesPicture[4] = Toolkit.getDefaultToolkit().getImage("ney.jpg");
			
			 gamesQuestions[5] = " Why was Flappy Bird deleted?" + "\n" + "A. the owner accidently deleted it" + "\n" + "B. Apple bought the app" + "\n" +"C. the owner felt attacked from all the hate" + "\n" + "D. None";
			 gamesAnswers[5] = "C";
			 gamesPicture[5] = Toolkit.getDefaultToolkit().getImage("fl.jpg");
			 
			 gamesQuestions[6] = " The app 'Score Hero' is a.." + "\n" + "A. Basketball game" + "\n" + "B. Soccer game" + "\n" +"C. A fun Quiz" + "\n" + "D. An action game";
			 gamesAnswers[6] = "B";
			
			
			 gamesQuestions[7] = " Which social media app was first made to be a game" + "\n" + "A. Facebook" + "\n" + "B. Twitter" + "\n" +"C. Instagram" + "\n" + "D. Snapchat";
			 gamesAnswers[7] = "D";
			 gamesPicture[7] = Toolkit.getDefaultToolkit().getImage("social.jpg");
			
			 gamesQuestions[8] = "Which console first used motion.." + "\n" + "A. Wii" + "\n" + "B. XBOX " + "\n" +"C. Playstation" + "\n" + "D. Gamecube";
			 gamesAnswers[8] = "A";
			 
			
			 gamesQuestions[9] = " The most popular app in 2013 was.." + "\n" + "A. Temple run" + "\n" + "B. Candy crush" + "\n" +"C. Subway Surfer " + "\n" + "D. Brick Breaker";
			 gamesAnswers[9] = "b";
			 
			
			// Make a for loop to output each question
			
			for (int i = 0; i<= 9; i++)
			{
				trivia.println( gamesQuestions[i]);
				trivia.drawImage (gamesPicture[i], 150, 400, 600, 500, null);
				
				// Store user answer into an array
				userAnswers = trivia.readLine();
				
				// Checking if user answer is correct 
				if(userAnswers.equalsIgnoreCase( gamesAnswers[i]))
				{
					trivia.println("You are Correct! You get 1 points");
					totalPoints = totalPoints + 1;
					try {
						 Thread.sleep (2000);
						 } catch (InterruptedException e) {
						 // TODO Auto-generated catch block
						 e.printStackTrace();
						 }
					
				}
				else
				{
					trivia.println("Sorry the answer was " +  gamesAnswers[i] + ".");
					try {
						 Thread.sleep (2000);
						 } catch (InterruptedException e) {
						 // TODO Auto-generated catch block
						 e.printStackTrace();
						 }
				}	
				trivia.clear();
		}
			
			//return the value of points to the main
			return (totalPoints);	}
		
		
	}


