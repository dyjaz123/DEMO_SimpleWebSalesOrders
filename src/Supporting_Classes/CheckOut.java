package Supporting_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {
	public static void checkOut(WebDriver driver){
		driver.findElement(By.id("checkout")).click();
		
		}

}
