package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/register");
			
			WebElement stf=driver.findElement(By.name("FirstName"));
			stf.sendKeys("Anuradha");
			WebElement stf1=driver.findElement(By.name("LastName"));
			stf1.sendKeys("Kadam");
			WebElement stf2=driver.findElement(By.name("Email"));
				
			stf2.sendKeys("kadamanuradha122@gmail.com");
			WebElement stf3=driver.findElement(By.name("Password"));
			stf3.sendKeys("171100anu");
			WebElement stf4=driver.findElement(By.name("ConfirmPassword"));
			stf4.sendKeys("171100anu");
			WebElement stf5=driver.findElement(By.name("register-button"));
			stf5.click();
			
	}
}


			;

