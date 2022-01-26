package IoandExceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoIO2 {
	public static void main(String[] args) {
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new FileReader(new File("foo.txt")));
//			String line=null;
//			while((line=br.readLine())!=null) {
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}catch(IOException ex) {
//			ex.printStackTrace();
//		} 
//		finally {
//			if (br != null) {
//				try {
//					br.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		
//Java version 7 onwards, try-with-resources	
//ARM : Automatic resource management
		try(BufferedReader br = new BufferedReader(new FileReader(new File("foo.txt")));) {
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException | NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			System.out.println("This is finally Block");
		}

	}
}
