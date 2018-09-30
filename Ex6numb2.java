import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Ex6numb2 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\java\\workspace\\SixthHomework");
		Arrays.asList(file.listFiles()).forEach(System.out::println);

		FileWriter filewriter = new FileWriter("Test.txt");

		for(File addr : Arrays.asList(file.listFiles())){
			filewriter.write(addr.getName()+" ");
		}
		filewriter.close();
	}
}
