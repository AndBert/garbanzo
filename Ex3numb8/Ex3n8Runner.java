package Ex3numb8;

public class Ex3n8Runner {

	public static void main(String[] args) {

		Kettle ket = new Kettle();
		ket.setName ("Phillips");
		ket.setVol (2);
		ket.setState(true);
		ket.display();
		
		System.out.println( );
		
		Radio rad = new Radio();
		rad.setName ("Sony");
		rad.setChan(2);
		rad.setVol(5);
		rad.display();
		
	}

}
