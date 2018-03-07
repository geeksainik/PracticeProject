package practicepackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter a String to check if its a palindrome or not?");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String rev="";
	     int len=str.length();
	     //System.out.println("Length of String is:"+len);
	     for(int i=len-1;i>=0;i--)
	     {
	    	 rev=rev+ str.charAt(i);
	    	 
	     }
	     System.out.println(rev);
	     if(str.equalsIgnoreCase(rev))
		System.out.println("String is a palindrome ");
	     else
	    	 System.out.println("String is not a palindrome");
	}

}
