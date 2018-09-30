import java.util.*;

public class Ex5numb3 {

	public static void main(String[] args) {
		String text="java HashSet String words new HashSet java";
		String []arrW = text.split(" ");
		HashSet<String> words= new HashSet<>(Arrays.asList(arrW));
		for(String word : words){
			int count=0;
			for ( String i : arrW) {
				if (word.equals(i)) {
					count++ ;
				}
			}
			System.out.println(word + " - " + count);
		}
	}
} 