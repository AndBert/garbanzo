public class Ex3numb4 {

	public static void main(String[] args) {
		char [] punkt={'.' , '?' , '!' , ',' , ':' , ';' , '-'};
		String text = " Текст !для   :, подсчета слов  -- домашнее? задание, по Java .   ";
		char[] textSimb = text.toCharArray();
		int sum = 0 ; 
		for ( int i = 0; i < textSimb.length; i++) {   
			for ( int j = 0 ; j < punkt.length ; j++ ) {
				if (textSimb[i] == punkt[j] ) {
					sum++ ;
				}
			}
		} 
		System.out.println("В исходной строке " + sum + " знаков пунктуации");
	} 
}
			
			
			
	


