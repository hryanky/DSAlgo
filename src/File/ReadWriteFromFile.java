package File;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class ReadWriteFromFile {

	public static void main(String[] args) {
		File file = new File("/Users/mraleraskar/Desktop/priyanka.txt");
		//System.out.println("..");
		try {
			
			FileReader fileread = new FileReader(file);
			
			BufferedReader br = new BufferedReader(fileread);
			String line = br.readLine();
			System.out.println(line);
			
			// methos toread byte and weird characters
			
//			FileInputStream fileread = new FileInputStream(file);
//			byte b[] = new byte[1000];
//			
//			System.out.println(fileread.read(b));
			
			// ***********
//			try {
//				String line = br.readLine();
//				System.out.println(line);
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			try {
//				fileread.read();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			// writing to the file 
			
			FileWriter write = new FileWriter(file);
			BufferedWriter fileWriter = new BufferedWriter(write);
			fileWriter.write("Hello Priyanka..");
			fileWriter.close();
			
			BufferedReader b = new BufferedReader(fileread);
			String updateline = br.readLine();
			System.out.println(updateline);
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
	}

}
