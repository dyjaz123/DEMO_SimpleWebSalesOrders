package Test_Suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

import Supporting_Classes.OrderThreeHappyItems;
import Supporting_Classes.RemoveAll;

public class Order3OfOneItemRemoveAll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stickerfy.herokuapp.com/");
		
		OrderThreeHappyItems.order3Happy(driver);		
		Thread.sleep(2000);
		
		RemoveAll.removeAll(driver);
		Thread.sleep(2000);
		// Note that I was unable to get an implicit or explicit wait to work.  That is why
		// I am using Thread.sleep.  I do know that it is preferred to use a wait instead of Thread.Sleep.
				
		WebElement removeAllResult = driver.findElement(By.xpath("/html/body/div/div/div/h2"));
		
		Assert.assertEquals("Add items to the cart", removeAllResult.getText());
		
		//Note - I would not have the below in a normal test.  Just added it for reference.
		System.out.println(removeAllResult.getText());
				
		driver.quit();			

	}	
	
}
