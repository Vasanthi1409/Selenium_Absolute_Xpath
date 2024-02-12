package absolute_Xpath.com;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Absolute_Xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea")).sendKeys("facebook login");
		

	}

}
