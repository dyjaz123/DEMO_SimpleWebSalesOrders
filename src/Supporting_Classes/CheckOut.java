package Supporting_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOut {
	public static void checkOut(WebDriver driver){
		driver.findElement(By.id("checkout")).click();
		
		WebElement total = driver.findElement(By.id("total"));
	}

}
