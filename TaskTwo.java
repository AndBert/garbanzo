import java.util.Random;

public class TaskTwo {

	public static void main(String[] args) {

		int x = getRandomX();
		
		System.out.println("��������� �����: " + x);
		
		if(x/100 >= 1)  {
			System.out.println( x + " ����������� �����");
		}
		if(x %10 == 7) {
			System.out.println(x + " ������������� �� 7");
		} else {
			System.out.println(x + " ������������� �� �� 7");
		}
		if(x %2 != 1) {
			System.out.println(x + " ������ �����");
		} else {
			System.out.println(x + " �������� �����");
		}
		
	}
	
	private static int getRandomX() {
		Random rand = new Random();
		return rand.nextInt(1000);
	}

}
