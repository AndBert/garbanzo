import java.util.Random;

public class TaskFour {

	public static void main(String[] args) {

		int y = getRandomX();
		int x;
		if (y<0) {
			x=-y;
			} else {
				x=y;
				}
				if(x%10 == 1 & x%100 != 11)  {
				System.out.println( y + " рубль");
			} else {
				if(x%10 >= 2 & x%10 < 5 & (x%100 < 10 | x%100 > 20))  {
					System.out.println( y + " рубля");
				} else {
					System.out.println( y + " рублей");
					} 
		}
			
	}
	
	private static int getRandomX() {
		Random rand = new Random();
		return rand.nextInt();
	}

}

