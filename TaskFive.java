public class TaskFive {

	public static void main(String[] args) {
		
		int x = (int )(Math.random() * 10000 + 1);
		int a = x / 1000;
		int b = (x / 100)% 10;
		int c =(x / 10)% 10;
		int d = x % 10;
		System.out.println("число X = " + x );

		int x1 = (((( d * 10 + c) * 10) + b) * 10) + a;
		System.out.println("число X наоборот " + x1);
	}
	
}
