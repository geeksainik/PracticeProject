package practicepackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeries {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//Fibnocci number are likes 0,1,1,2,3,5,8,13,21....etc
		
		System.out.println("Enter the count of series");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		
		
		long f1=0;
		long f2=1;
		System.out.println("fibnocci series is \n"+f1+"\n"+f2);
		
		long f=f1+f2;
		System.out.println(f);
		
		int count= 3; // as 3 numbers are printed in series
		
		while(count<n)
		{
			f1=f2;
			f2=f;
			f=f1+f2;
			System.out.println(f);
			count++;
				
		}
		
		
		
	}

}
