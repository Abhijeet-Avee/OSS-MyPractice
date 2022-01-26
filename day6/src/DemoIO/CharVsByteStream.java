package DemoIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharVsByteStream {

	public static void main(String[] args) {
		//char
		try(FileReader reader = new FileReader("abc.txt");
			FileWriter writer = new FileWriter("abc2.txt")){
			int i=0;
			while((i=reader.read())!=-1) {
				writer.write(i);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		//byte
		try(FileInputStream reader = new FileInputStream("image.jpg");
				FileOutputStream writer = new FileOutputStream("image2.jpg")){
			int i=0;
			while((i=reader.read())!=-1) {
				writer.write(i);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
