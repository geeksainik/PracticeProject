package practicepackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleOfBufferedClass {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter id:");
		int id= Integer.parseInt(br.readLine());
		System.out.println("Enter Sex M/F:");
		char s=(char)br.read();
		br.skip(2);//if this is not written then it will not take name as read method accepts only 1 char and /n will be give to readLine() which will not take name
		
		System.out.println("Enter name:");
		String name=br.readLine();
		
		System.out.println("********** Entered Values are ************");
		System.out.println("Enter id is:" +id);
		System.out.println("Entered name is:" +name);
		System.out.println("Entered sex is:" +s);
		
		
	}

}
