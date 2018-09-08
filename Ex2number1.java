import java.util.Scanner;

public class Ex2number1 {
	public static void main(String[] args) {
		System.out.print("Введите число от 10 до 15: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int factorial = 1;
		if (n<10 || n>15) {
			System.out.println("Введенное число не входит в диапазон от 10 до 15");
			} else {
				for (int i=1 ; i <= n ; i++ ) {
					factorial = factorial * i;
				}
				System.out.println("факториал числа " + n + " равен " + factorial );
			}	
		} 
	}
