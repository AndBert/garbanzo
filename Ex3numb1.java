import java.util.Scanner;

public class Ex3numb1 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in); 
		System.out.println("Введите строку (0-9, a-z, A-Z): ");
 		String str = scan.nextLine();
		scan.close();

		System.out.println("Строка состоит из  " + str.length() + " символов");
		int sum = 0 ;
		String result = "";
		for ( int i = 0; i < str.length(); i++) {   //перебор символов
			 if ( str.charAt(i) >= 48 && str.charAt(i) <= 57 ) { //поиск цифр в строке
				sum = sum +  str.charAt(i) - 48;
			 } else {											//поиск букв
				 if ((str.charAt(i) >= 65 && str.charAt(i) <= 90 ) || (str.charAt(i) >= 97 && str.charAt(i) <= 122) ) {
					 result = result + Character.toString(str.charAt(i)) ;
				 } else {
					 System.out.println( "Введены неверные символы");
				 }
			 } 
		}
		System.out.println( "Сумма цифр в строке " + sum ); // вывод результов
		System.out.println( "Строка без цифр " + result );
	}
}


	


