package Test_Suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.*;

import Supporting_Classes.CheckOut;
import Supporting_Classes.OrderOneHappyItem;

public class OrderOneItem {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stickerfy.herokuapp.com/");
		
		OrderOneHappyItem.order1Happy(driver);		
		Thread.sleep(1000);		
				
		CheckOut.checkOut(driver);
		Thread.sleep(3000);
		// Note that I was unable to get an implicit or explicit wait to work.  That is why
		// I am using Thread.sleep.  I do know that it is preferred to use a wait instead of Thread.Sleep.
		
		WebElement total = driver.findElement(By.id("total"));
		
		Assert.assertEquals("Total: $5.5", total.getText());
		
		//Note - I would not have the below in a normal test.  Just added it for reference.
		System.out.println(total.getText());
				
		driver.quit();			

	}	
	
}
