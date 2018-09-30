import java.io.*;

public class Ex6numb1 {

	public static void main(String[] args) throws IOException {
		String stroka = "";
		for (int i = 0; i < 20 ; i++) {
			stroka +=  " " + (int)(Math.random()*100); 
		}
		System.out.println(stroka);
		FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\SixthHomework\\notes.txt");
		byte[] byteArrayW = stroka.getBytes();
		fos.write(byteArrayW);
		fos.close();
		System.out.println("Файл записан");
    
		FileInputStream fin=new FileInputStream("D:\\java\\workspace\\SixthHomework\\notes.txt");
        System.out.println("Файл прочитан");
        byte[] byteArrayR = new byte[fin.available()];
		
		for(int i = 0; i < byteArrayR.length; i++) {
			byteArrayR[i] = (byte) fin.read();
			System.out.print((char)byteArrayR[i]);
		}
		fin.close();
	}
}