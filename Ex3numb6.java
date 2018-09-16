
public class Ex3numb6 {

	public static void main(String[] args) {
		String str1 = "Проверка ";
		String str2 = "на скорость";
		double start1 = System.currentTimeMillis();
		for (int i=0; i <= 100000; i++) {
			String sum1 = str1 + str2;
		}
		double finish1 = System.currentTimeMillis();
		double timeConsumedMillis1 = finish1 - start1;
		System.out.println("Сложение toString " + timeConsumedMillis1 );
		
		double start2 = System.currentTimeMillis();
		for (int i=0; i <= 100000; i++) {
			String sum2 =new StringBuilder(str1).append(str2).toString();
		}
		double finish2 = System.currentTimeMillis();
		double timeConsumedMillis2 = finish2 - start2;
		System.out.println("Сложение StringBuilder " + timeConsumedMillis2 );
	
		if ( timeConsumedMillis1 > timeConsumedMillis2 ) {
			System.out.println("StringBuilder быстрее toString");
		}else {
			System.out.println("toString быстрее StringBuilder");
		}
	}
}
