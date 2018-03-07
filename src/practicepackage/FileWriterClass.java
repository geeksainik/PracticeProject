package practicepackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\FileWriter\\FileWriter.txt")); 

			String content = "This is the content to write into file\n";
//					+ "so that i can will shodud huyhios iojda hhad \n"
//					+ "kjhklfdgjnnkdfl;gbnmm,fskl;skdfgnksdl;kf \n"
//					+ "gkhjhjklkfsdl;kfyhnmsdl;gksopd"
//					+ "nlkj;lkfdslkl;fkl;skdgfshgsjkh"
//					+ "hgkjfhskjf;sjkldfl;"
//					+ "jhjklhgskldhfsdhfgsdklgjgf \n"
//					+ "jnhskldjgklsdjgklsdklgnklsd \n"
//					+ "************************* \n"
//					+ "This is end of file";

		bw.write(content);

			

			System.out.println("Done");

	}

}
