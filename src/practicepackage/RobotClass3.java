package practicepackage;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class RobotClass3 {
	
	public static void main(String[] args) throws HeadlessException, UnsupportedFlavorException, IOException {
		
		//To get Data in ClipBoard
		String s=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println(s);
		
		
		
		
	}

}
