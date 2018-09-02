
public class TaskOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sec = 4_500_000;
		int min = sec/60;
		int hour = min/60;
		int day = hour/24;
		int week = day/7;
		int secRest = sec%60;
		int minRest = min%60;
		int hourRest = hour%24;
		int dayRest = day%7;
		
	System.out.println(sec + " second is " + min + " full minutes and " + secRest + " seconds ");
	System.out.println("OR");
	System.out.println(sec + " second is " + hour + " full hours and " + minRest + " full minutes and " + secRest + " seconds ");
	System.out.println("OR");
	System.out.println(sec + " second is " + day + " full days and " + hourRest + " full hours and " + minRest + " full minutes and " + secRest + " seconds ");
	System.out.println("OR");
	System.out.println(sec + " second is " + week + " full weeks and " + dayRest + " full days and " + hourRest + " full hours and " + minRest + " full minutes and " + secRest + " seconds ");
	}

}
