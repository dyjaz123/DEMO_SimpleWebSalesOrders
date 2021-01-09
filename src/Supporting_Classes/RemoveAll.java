package Supporting_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveAll {
	public static void removeAll(WebDriver driver) throws InterruptedException 
	{driver.findElement(By.className("btn-primary")).click();
	 Thread.sleep(2000);
	// Note that I was unable to get an implicit or explicit wait to work.  That is why
	// I am using Thread.sleep.  I do know that it is preferred to use a wait instead of Thread.Sleep.
	 driver.findElement(By.linkText("Remove all")).click();}
}
