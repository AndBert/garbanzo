import java.util.Random;

public class TaskTwo {

	public static void main(String[] args) {

		int x = getRandomX();
		
		System.out.println("случайное число: " + x);
		
		if(x/100 >= 1)  {
			System.out.println( x + " трехзначное число");
		}
		if(x %10 == 7) {
			System.out.println(x + " заканчивается на 7");
		} else {
			System.out.println(x + " заканчивается не на 7");
		}
		if(x %2 != 1) {
			System.out.println(x + " четное число");
		} else {
			System.out.println(x + " нечетное число");
		}
		
	}
	
	private static int getRandomX() {
		Random rand = new Random();
		return rand.nextInt(1000);
	}

}
