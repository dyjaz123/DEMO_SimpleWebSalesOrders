package Supporting_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderThreeHappyItems {
	public static void order3Happy(WebDriver driver) throws InterruptedException 
	{driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/a")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/a")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/a")).click();
	 Thread.sleep(2000);	 	 
	
	// Note that I tried using Implicit and Explicit Waits instead of the thread.sleep but could 
	// not get either to work.  Without the delay, the clicking of the cart button does not work.  
	Thread.sleep(1000);			
		
	 driver.findElement(By.id("cart")).click();	 
	 
	}

}
