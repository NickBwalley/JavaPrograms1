package textfilereadwrite;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		try {
		File file = new File("fileName1.txt");
		
			if(!file.exists()) {
			file.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file);
			pw.println("This is my file Content!");
			pw.println(5000);
			pw.close();
			System.out.println("Done!");
		}

		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		// readFile method invoked
		ReadTxtFile.fileReader();
	}
}
