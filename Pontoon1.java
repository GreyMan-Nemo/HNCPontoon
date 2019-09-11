/* Basic version of the game pontoon, 
 * Created as answer to a problem during HNC
*/

package pontoon;

// Importing required module(s)
import java.util.Scanner;

// Creating new class
public class pontoon {

	// Calling main method
	public static void main( String[] args) {
		
		// Kicking off imported module(s)
		Scanner scan = new Scanner( System.in);
		
		// Defining class variables
		int userInput = 0;
		int card1 = 0;
		int card2 = 0;
		int cardNew = 0;
		int total = 0;
		
		// Defining variable(s) for use in for loops
		int i = 0;
		
		// Creating random values for card 1 and 2 with for loop
		for ( i = 0; i < 1; i ++) {
			card1 = ( int)( Math.random()*10) + 1;
				System.out.println( "Card 1:     "+ card1);
			
			card2 = ( int)( Math.random()*10) + 1;
				System.out.println( "Card 2:     "+ card2);
				
				// Print out empty string to provide space in output
				System.out.println( "");
				
		} // Closing random number for loop
		
/* ********** *//* Some math to add cards 1 and 2,
 		 * Results will be housed in "int total" 
 		 * Will print out empty string to provide space in output
 		*/
		total = card1 + card2;
		System.out.println( "Hand value: "+ total);
		System.out.println( "");
		
		// Ask play if another card is wanted
		System.out.println( "Do you want another card? [1] Yes [2] No");
			userInput = scan.nextInt();
			
/* ********** *//* Create an if loop to catch yes input
 		 * Will contain nested while and for loops 
 		 * Will reuse previously written for loop from above
 		*/
		if ( userInput == 1) {
			while ( cardNew <= 3) {
				for ( cardNew = 0; cardNew < 1; cardNew ++) {
					cardNew = ( int)( Math.random()*10) + 1;
						System.out.println( cardNew);
			
				} // Closing random number for loop
			} // Closing while loop
		} // Closing yes if loop
		
/* ********** *//* Some more math to add new value to current value
 		 * Results will be housed in "int total" 
 		*/
		total = total + cardNew;
		System.out.println( "Hand value: "+ total);
		
/* ********** *//* Creating if/else statement to determine win/lose result
 		 * Use math to compare player's total to 18 ( house value)
 		 * Print out results to user	
 		*/
		if ( total >= 19 && total <= 21) {
			System.out.println( "You Win...");
			
		} // Closing result if statement
		
		else {
			System.out.println( "You lose...");
			
		} // CLosing else statement
			
	// Closing Scanner - scan
	scan.close();
	
	} // Closing main method
} // Closing class
