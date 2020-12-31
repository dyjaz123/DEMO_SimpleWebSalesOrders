package Test_Suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

import Supporting_Classes.CheckOut;
import Supporting_Classes.OrderThreeHappyItems;
import Supporting_Classes.RemoveOne;

public class Order3OfOneItemRemove1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stickerfy.herokuapp.com/");
		
		OrderThreeHappyItems.order3Happy(driver);		
		Thread.sleep(2000);
		
		RemoveOne.remove1(driver);
		Thread.sleep(2000);
				
		CheckOut.checkOut(driver);
		Thread.sleep(2000);
		
		WebElement total = driver.findElement(By.id("total"));
		
		Assert.assertEquals("Total: $11", total.getText());
		
		//Note - would not have the below in a normal test.  Just added it for reference.
		System.out.println(total.getText());
				
		driver.quit();			

	}	
	
}
