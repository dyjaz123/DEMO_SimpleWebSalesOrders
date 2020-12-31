package Supporting_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveAll {
	public static void removeAll(WebDriver driver) throws InterruptedException 
	{driver.findElement(By.className("btn-primary")).click();
	Thread.sleep(2000);
	 driver.findElement(By.linkText("Remove all")).click();}
}
