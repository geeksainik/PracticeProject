package practicepackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) throws IOException {

        System.out.println("Enter Employee age,name,salary:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str," ");
		String s1=st.nextToken();
		String s2=st.nextToken();
		String s3=st.nextToken();
		s1=s1.trim();
		s2=s2.trim();
		s3=s3.trim();
		
		
		int age=Integer.parseInt(s1);
		System.out.println("Employee age is:" +age);
		
		String name=s2.toString();
		System.out.println("Employee name is:" +name);
		
		float sal=Float.parseFloat(s3);
		System.out.println("Employee sal is:" +sal);
		
		
		
		
		
	}

}
