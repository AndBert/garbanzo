import java.util.Scanner;

public class Ex2number2 {
	public static void main(String[] args) {
		
		System.out.println("Введите число: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int x = 0;
		
		for (int i=1 ; i < n ; i++ ) {
		if (n % i == 0) { 
			x++;
			}
			System.out.println("i=" + i);
			System.out.println(x);
		}
			if (x < 2) { 
			System.out.println("Число " + n + " простое");
			} else {
			System.out.println("Число " + n + " составное");
		}
				
	}

}


