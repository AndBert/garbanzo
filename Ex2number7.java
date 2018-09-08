import java.util.Scanner;

public class Ex2number7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // задаем размер массива 
		System.out.println("Задайте размер массива: ");
 		int a = scan.nextInt();
		scan.close();
		
		int [][] mass = new int [a][a]; //заполнение верхней части массива
		for ( int i = 0; i < a/2; i++) {  
            for (int j = 0; j < a; j++)
            { 
            	if (j >= i && j <= a - i - 1) {
            		mass[i][j] = 1;
            	} else {
            		mass [i][j] = 0;
            	}  	      	
           	System.out.print(mass[i][j] + " ");
            }
            System.out.println();
		}
		
		for ( int i = a/2; i < a; i++) {  // заполнение нижней части массива
            for (int j = 0; j < a; j++)
            { 
            	
            	if (j <= i && j >= a - i - 1) {
            		mass[i][j] = 1;
            	} else {
            		mass [i][j] = 0;
            	}
           	System.out.print(mass[i][j] + " ");
            }
            System.out.println();
		}
	}
}
