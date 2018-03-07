package practicepackage;


import java.io.File;
//import org.apache.commons.io.FileUtils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class PracticeClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\myworkspace_selenium\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//ArrayList<String> win=new ArrayList<String>(driver.getWindowHandles());
//		driver.get("https://www.google.co.in");
//		String s=driver.getWindowHandle();
//		System.out.println(s);
//	    Dimension d= driver.manage().window().getSize();
//	    System.out.println(d);
//	    Point p=driver.manage().window().getPosition();
//	    System.out.println(p);
//	    System.out.println(driver.manage().getCookies());
	    driver.navigate().to("https://www.facebook.com");
//	    driver.navigate().back();
//	    driver.navigate().forward();
//	    driver.navigate().refresh();
//	    List<WebElement> list=driver.findElements(By.tagName("input"));
//	    System.out.println(list.size());
//	    for(int i=0;i<list.size();i++)
//	    {
//	    	System.out.println(list.get(i));
//	    }

//	    File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    FileUtils.copyFile(f, new File("E:\\ScreenShot.jpeg"));
	    Select s=new Select(driver.findElement(By.id("Email")));
	    Actions a=new Actions(driver);
	    a.keyDown(Keys.CONTROL).click(s.getOptions().get(2));
	    a.sendKeys(Keys.chord("o",Keys.ENTER));
	    WebElement e=driver.findElement(By.id("Email"));
	    e.getLocation().getX();
	   
	    
	

	}
}
