//  import java.util.Random;

public class TaskThree {
	public static void main(String[] args) {
	// комментариями скрыт вариант для случайный размеров прямоугольника и круга
	//	int a = getRandomX();	
	//	int b = getRandomX();
	//	int r = getRandomX();
		int a = 5;
		int b = 6;
		int r = 4;
		int squareRec = a*b;
		System.out.println("rectangle size " + a + " X " + b);
		System.out.println("square rectangle " + squareRec);
		System.out.println("circle radius " + r);
		System.out.println("square circle " + 3.14*r*r);
		if(r*2>a && r*2>b && (3.14*r*r>a*b)) {
			System.out.println("YES ");
			} else {
			System.out.println("NO ");	
			}
		}
//	private static int getRandomX() {
//		Random rand = new Random();
//		return rand.nextInt(100); // числа для вычислений взяты в рамках 100
//	}
}
