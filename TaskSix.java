
public class TaskSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = (int )(Math.random() * 10000 + 1);
		int a = x / 1000;
		int b = (x / 100)% 10;
		int c =(x / 10)% 10;
		int d = x % 10;
		System.out.println("����� X = " + x );

		if(a == b || a == c  || a == d || b == c || b == d || c == d ) {
			System.out.println("� ����� " + x + " ���� ���������� �����");
		} else {
			System.out.println("� ����� " + x + " ��� ����� ������");
		}
	}
}
