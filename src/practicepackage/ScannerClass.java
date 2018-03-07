package practicepackage;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		System.out.println("Enter a name age sal:");
		Scanner sc=new Scanner(System.in);
		
		String name= sc.nextLine();
		int age =sc.nextInt();
		float sal=sc.nextFloat();
		
		System.out.println("name:"+ name+"\n"+"age:"+age+"\n"+"sal:"+sal);
		
	}

}
