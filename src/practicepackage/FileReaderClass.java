package practicepackage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderClass {

	public static void main(String[] args) throws IOException {
		
		//Reading a file
		
		//Using Bufferedreader
		
//		File f=new File("E:\\JavaRobotSaved File\\Robot1.txt");
//		BufferedReader br=new BufferedReader(new FileReader(f));
//		String s;
//		while((s=br.readLine())!=null)
//		System.out.println(s);
//		
		
		//USing FileReader
		
		
//		FileReader f=new FileReader("E:\\JavaRobotSaved File\\Robot1.txt");
//		int i;
//	    while ((i=f.read()) != -1)
//	      System.out.print((char) i);
		
		//Using Scanner
		
		//FileReader f=new FileReader("E:\\JavaRobotSaved File\\Robot1.txt");
		
		Scanner sc=new Scanner(new FileReader("E:\\JavaRobotSaved File\\Robot1.txt"));
		//or
		//Scanner sc=new Scanner(f);
		while (sc.hasNextLine())
		      System.out.println(sc.nextLine());


	}

}
