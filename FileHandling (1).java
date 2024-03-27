import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws Exception {
		File file = new File("info.text");
		if(!file.exists()) {
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file);
		writer.write("one");
		writer.append("two");
		writer.write("three");
		writer.close();
		
		File readFile = new File("data.txt");
		Scanner sc = new Scanner(readFile);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
