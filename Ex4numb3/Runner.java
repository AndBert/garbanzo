package Ex4numb3;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Runner {

	public static void main(String[] args) {

		List<Student> inst = new ArrayList<Student>();

		inst.add ( new Student ("Vasya" , 1) ) ;
		inst.add ( new Student ("Sasha" , 2) ) ;
		inst.add ( new Student ("Dasha" , 3) ) ;
		inst.add ( new Student ("Petya" , 4) ) ;
		inst.add ( new Student ("Ira" , 5) ) ;
		inst.add ( new Student ("Misha" , 1) ) ;
		inst.add ( new Student ("Masha" , 2) ) ;
		inst.add ( new Student ("Grisha" , 3) ) ;
		inst.add ( new Student ("Kira" , 4) ) ;
		inst.add ( new Student ("Lena" , 5) ) ;
		printStudents(inst);
	}
 
public static void printStudents(List<Student> inst) {
	for (int i = 1 ; i <= 5 ; i++) {
		 System.out.println("Students " + i + " course");
		 Iterator<Student> st= inst.iterator();
		 while (st.hasNext()) {
			 Student stud = st.next();
			 if (stud.getCourse() == i) {
				 System.out.println( "Student " + stud.getName() + " of " + stud.getCourse() + " course" );
			 	}
		 	}
		}
 	}
}
