import java.util.Random;
import java.util.Scanner;

public class Ex2number5 {
	public static void main(String[] args) throws InterruptedException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Задайте размер внешнего массива ");
		int a = scan.nextInt();
		System.out.println("Задайте размер внутренного массива ");
		int b = scan.nextInt();
		scan.close();
		int mass[][] = new int [a][b];
			for ( int i = 0; i < a; i++) {  //заполнение массива случайными числами до 10
            for (int j = 0; j < b; j++)
            {
            mass[i][j] = getRandomX(); 
           	System.out.print(mass[i][j] + " ");
            }
            System.out.println();
		}
		
		Thread.sleep(2000);
		
		System.out.println();
		
		for ( int i = 0; i < a; i++) {  //поворот массива
            for (int j = 0; j < b/2; j++)
            {
           	int temp = mass[i][j]; 
            mass[i][j] = mass[a-i-1][b-j-1]; 
            mass[a-i-1][b-j-1] = temp;
            }
		}
	for ( int i = 0; i < a; i++) {  //вывод перевернутого массива
    for (int j = 0; j < b; j++)
    	{
        System.out.print(mass[i][j] + " ");
        }   
      System.out.println();
	}
}
		
private static int getRandomX() { // случайные числа до 10
	Random rand = new Random();
	return rand.nextInt(10);
	}
}