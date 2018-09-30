import java.util.*;

public class Ex5numb1 {

	public static void main(String[] args) {
		LinkedList <Integer> linkl = new LinkedList <> () ;
		ArrayList <Integer> arrl = new ArrayList <> () ;
		TreeSet <Integer> tres = new TreeSet <> () ;
		HashSet <Integer> hashs = new HashSet <> () ;
		HashMap <String, Collection <Integer> > hashm = new HashMap <> () ;

		hashm.put("LinkedList " + time (linkl), linkl);
		hashm.put("ArrayList " + time (arrl), arrl);
		hashm.put("TreeSet " + time (tres), tres);
		hashm.put("HashSet " + time (hashs), hashs);
		System.out.println(hashm);
	}
		
public static double time (Collection <Integer> o) {
	double start = System.currentTimeMillis();
	 for (int i = 0; i <= 1000; i++) {
        o.add(i);
     }
	 for (int i = 0; i <= 1000; i++) {
	        o.contains(i);
	     }
	 for (int i = 0; i <= 980; i++) {
	        o.remove(i);
	     }
		double finish = System.currentTimeMillis();
		double time = finish - start ;
		System.out.println(" Time " + o.getClass()+ " : " +  time); 
		return time ;
		}
}