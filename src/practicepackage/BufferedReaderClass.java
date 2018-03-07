package practicepackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
	
	public static void main(String[] args) throws IOException {
	// to read data from keyboard we use System.in we need to connect it with some stream as
		
		//InputStreamReader obj= new InputStreamReader(System.in);
		
		//BufferedReader br=new BufferedReader(obj);
		
		//or
		
		System.out.println("Enter a String to Display\n");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String s= br.readLine();
		
		System.out.println(s);
		
		

		
	}

}
