import java.util.Scanner;

public class Ex2number3 {

	public static void main(String[] args) {

		System.out.println("Сколько чисел должно делиться на 3 без остатка? ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int sum = 0;
		for (int i = 1 ; i <= n*3 ; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Сумма " + n + " чисел, которые делятся на 3 равна " + sum);
	}
}
