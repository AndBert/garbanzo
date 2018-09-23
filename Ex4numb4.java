import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex4numb4 {

	public static void main(String[] args) {
		
	Set < Integer > set1 = new HashSet < Integer> () ;
	set1.add( 1 );
	set1.add( 2 );
	set1.add( 3 );
	set1.add( 5 );
	set1.add( 7 );
	set1.add( 8 );
	System.out.println(set1);
	
	Set < Integer > set2 = new HashSet < Integer> () ;
	set2.add( 1 );
	set2.add( 6 );
	set2.add( 9 );
	set2.add( 14 );
	set2.add( 3 );
	set2.add( 7 );
	System.out.println(set2);
	
	union(set1, set2) ;
	intersect(set1, set2);
	}
	
	private static void union(Set<Integer> set1, Set<Integer> set2) {
		List < Integer > setUnion = new ArrayList<Integer>() ;
		setUnion.addAll(set1);
		setUnion.addAll(set2);
		System.out.println(setUnion);
	}

	private static void intersect(Set<Integer> set1, Set<Integer> set2) {
		List < Integer > intersection = new ArrayList<Integer>() ;
		intersection.addAll(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
	}
}
