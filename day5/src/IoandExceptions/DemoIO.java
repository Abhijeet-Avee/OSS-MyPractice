package IoandExceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DemoIO {
	public static void main(String[] args) throws IOException {
		//Print all unique char, collection api : HashSet,TreeSet,LinkedHashSet
		Set<String> words = new HashSet<>();
		
		BufferedReader br = new BufferedReader(
				new FileReader(
						new File("foo.txt")));
		String line=null;
		while((line=br.readLine())!=null) {
			String []tokens = line.split("");
			for(String token: tokens) {
				words.add(token.toLowerCase());
			}
		
		}
		//Now print all the unique words from the file
		for(String word: words) {
			System.out.print(word);
		}
	}
}
