package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Anu\\Selenium\\Training\\Selenium\\drivers\\chromedriver.exe"
				);
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://www.facebook.com");
		
		//Locators
		//ID
		driver.findElement(By.id("u_0_f")).sendKeys("Anupama");
		
		driver.findElement(By.id("u_0_h")).sendKeys("Krishnamurthy");
		
		//LinkText
		driver.findElement(By.linkText("Forgot account?")).click();
		
		//go to previous page
		driver.navigate().back();
		
		//Tagname
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		

	}

}
