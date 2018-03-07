package practicepackage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotClass {

	public static void main(String[] args) throws IOException, AWTException, HeadlessException, UnsupportedFlavorException {
		
		Runtime.getRuntime().exec("notepad.exe");
		
		Robot r= new Robot();
		
		StringSelection s=new StringSelection("this is java robot automated text");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		
		
		
		//Copy Text to notepad
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		//Save NotePAd
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//Enter File save Location
		
		StringSelection s1=new StringSelection("E:\\JavaRobotSaved File\\Robot.txt");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1,null);
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_F4);
		
		
	 String s2=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println(s);
		
		
		
	
		
		
		
		

	}

}
