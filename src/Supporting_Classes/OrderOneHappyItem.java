package Supporting_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderOneHappyItem {
	public static void order1Happy(WebDriver driver) throws InterruptedException 
	{driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/a")).click();	
	// Note that I was unable to get an implicit or explicit wait to work.  That is why
	// I am using Thread.sleep.  I do know that it is preferred to use a wait instead of 
	// Thread.sleep.
	Thread.sleep(1000);			
		
	driver.findElement(By.id("cart")).click();	 
	 
	}

}
