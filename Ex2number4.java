import java.util.Random;
import java.util.Scanner;

public class Ex2number4 {

	public static void main(String[] args) {
	
		System.out.println("Сколько учеников в класс? ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int [] marks = new int[n];
		int max = 1;
		int iMax = 0;
	
		for (int i = 0; i < n ; i++) {
				marks[i] = getRandomX();
				System.out.print(marks[i] + " ");
				if (max < marks[i]) {
					max = marks[i];
					iMax = i;
				}
			}
		System.out.println(" ");
		System.out.println("Первая оценка " + marks[0] + ", последняя оценка " + marks[(n - 1)] );
		System.out.println("Максимальная оценка " + max + " в позиции " + ( iMax + 1 ));
		
	}
	
private static int getRandomX() {
	Random rand = new Random();
	return rand.nextInt(10);
	}
}