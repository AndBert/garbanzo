import java.util.Random;
import java.util.Scanner;

public class Ex3numb2 {
	
	public static void main (String[] args) {
		char taskLet = (char) (getRandomX() + 65);
		System.out.println( "Right letter " + taskLet );	
		System.out.println( (int)taskLet );
		boolean result = true ;
		char let ;
		
		while (result) {
			Scanner scan = new Scanner(System.in); 
			System.out.println("Enter letter (A-Z): ");
			let = scan.next().charAt(0);
			
			System.out.println( (int)let );
		
			if (let == taskLet) {
				System.out.println( "Right");
				result = false ;
				scan.close();
			} else {
				result = true ;
				if ((int)let < (int)taskLet) {
					System.out.println("You’re too low");
				}else {
					System.out.println("You’re too high");
				}
			}
		}	
	}

private static int getRandomX() { 
	Random rand = new Random();
	return rand.nextInt(21);
	}
	
}
