package practicepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowserTest {

	public static void main(String[] args) {
//		  WebDriver driver=new HtmlUnitDriver();
//			//WebDriver driver=new ChromeDriver();
//			
//	       driver.get("https://www.facebook.com");
//	       System.out.println(driver.getTitle());
	       
	       ChromeOptions options=new ChromeOptions();
	       options.addArguments("window-size=1400,800");
	       options.addArguments("headless");

			System.setProperty("webdriver.chrome.driver","E:\\myworkspace_selenium\\software\\chromedriver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver(options);
	       driver.get("https://www.facebook.com");
	       System.out.println(driver.getTitle());
	       
	       
	}

}
