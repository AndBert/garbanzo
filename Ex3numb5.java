import java.util.StringTokenizer; 

public class Ex3numb5 {

	public static void main(String[] args) {
		
		String text = " Текст для    подсчета слов  -- домашнее задание, по Java .   ";
		int i = 0 ;
 
		StringTokenizer st = new StringTokenizer(text, " \t\n\r,.-"); 
		while(st.hasMoreTokens()){
			i++;
			System.out.print(st.nextToken() + " " ) ; 
		}
		System.out.println() ;
		System.out.println("В строке " + i + " слов") ;
	}

}
