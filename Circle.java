import java.util.Scanner ;
	
public class Circle {
	
	public /*static*/ double x;
	public /*static*/ double y;
	public double r;
	public double d;
	public static boolean t;
	
	public static void main(String[] argsd) {
		Circle circ1 = new Circle();
		circ1.printCircle();
		circ1.lenght();
		circ1.move();
		circ1.printCircle();
		Circle circ2 = new Circle();
		circ2.printCircle();
		dist (circ1, circ2);
		System.out.println("Расстояние между центрами окружностей " + dist(circ1, circ2));
		touch (circ1, circ2);
		System.out.println("Окружности касаются: " + touch(circ1, circ2));
	}
	
	//вариант с значеними конструктора по умолчанию
	//Circle(){
	//	x = 1;
	//	y = 2;
	//	r = 3;
	//	}
	
	public Circle(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите x: ");
		x = scan.nextDouble();
		System.out.println("Введите y: ");
		y = scan.nextDouble();
		System.out.println("Введите r: ");
		r = scan.nextDouble();
	}
	
	public void printCircle(){
		System.out.println("Центр окружности " + x + " " + y + " радиус " + r );
	}
	
	public void lenght(){
		double l = 2 * Math.PI * r;
		System.out.println("Длина окружности " + l );
	}
	
	public void move(){
		x = (int)(Math.random()*198-99);
		y = (int)(Math.random()*198-99);
		System.out.println("Центр окружности после смещения " + x + " " + y );
	}
	
	public static double dist(Circle circ1, Circle circ2) {
		double d = Math.sqrt(((circ2.x-circ1.x)*(circ2.x-circ1.x)) + ((circ2.y-circ1.y)*(circ2.y-circ1.y)));
		return d;
	}

	public static boolean touch(Circle circ1, Circle circ2) {
		if ((circ1.r+circ2.r)== dist(circ1, circ2)) {
			t = true;
		}else {
			if((circ1.r + dist(circ1, circ2))== circ2.r || (circ2.r + dist(circ1, circ2))== circ1.r){
				t = true;		
			}else{
				t= false;
			}
		}
		return t;
	}

}