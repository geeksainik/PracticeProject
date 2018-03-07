package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptClass {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","E:\\myworkspace_selenium\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement e=driver.findElement(By.name("email"));
		js.executeScript("arguments[0].value='harshitha.sayana@gmail.com';", e);
		
		
		
	}  

}
