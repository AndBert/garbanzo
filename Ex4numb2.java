import java.util.Arrays;

public class Ex4numb2 {

	   public static void main(String[] args) {

		   Object[] x = new Object[]{1, 2f , 3l ,"srk", false};
		   for(Object i: x){ 
			   System.out.println("Индекс массива: " + Arrays.asList(x).indexOf(i));
			   System.out.println("Элемент " + i);
			   System.out.println(i.getClass());
			   System.out.println();
		  }   
	 }
}
