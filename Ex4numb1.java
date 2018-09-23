import java.util.Arrays;
import java.util.List;

public class Ex4numb1 {

	public static void main(String[] args) {
		Integer [] mass = { 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
		for( int i = 0 ; i < mass.length ; i++ ) {
			System.out.print( mass [ i ] + " ");
		}
	System.out.println( );
	List < Integer > list = Arrays.asList( mass );
	System.out.println( list );
	}
}