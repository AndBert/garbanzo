import java.util.Scanner;
import java.util.Random;

public class Ex2number6 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in); // задаем размер массива случайными числами
		System.out.println("Задайте размер массива: ");
 		int a = scan.nextInt();
		scan.close();
		int [] mass = new int [a];
		for ( int i = 0 ; i < a ; i++) {	
			int numb = getRandomX();
			mass [i] = numb; 
			System.out.print( mass[i] + " ");
		}
		System.out.println( );
		
		// ищем максимальное число
		int numbMax = 0;
		int numbMin = 100;
		int iMax = 0;
		int iMin = 0;
		for ( int i = 0 ; i < a ; i++) {	
			if ( numbMax < mass [i]) {
				numbMax = mass [i];
				iMax = i+1;
			}
			if ( numbMin > mass [i]) {
				numbMin = mass [i];
				iMin = i+1;
			}
			if ( numbMin > mass [i]) {
				numbMin = mass [i];
				iMin = i+1;
			}
		}
		
		//сумма между  max  и min
		int sum =0;
		if ( iMin < iMax ) {
			for ( int i = iMin ; i <= iMax ; i++) {	
					sum = sum + mass [i-1];
				}
			}else{
					for ( int i = iMax ; i <= iMin ; i++) {	
						sum = sum + mass [i-1];
					}
				}
									
			//вывод значений и позиций минимальных и максимальных чисел
			System.out.println("Максимальное число " + numbMax + " стоит в позиции " + iMax );
			System.out.println("Минимальное число " + numbMin + " стоит в позиции " + iMin );
			System.out.println("Сумма чисел между максимальным и минимальным числами = " + sum);
		}
			 
	private static int getRandomX() { // случайные числа до 10
		Random rand = new Random();
		return rand.nextInt(100);
	}
}	