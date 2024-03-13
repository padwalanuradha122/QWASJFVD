package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingFacebookLogin {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://www.facebook.com/campaign/landing.php?");	
		   
	WebElement stf=driver.findElement(By.name("firstname"));
	stf.sendKeys("Anuradha");
	WebElement stf1=driver.findElement(By.name("lastname"));
	stf1.sendKeys("Kadam");
	
	WebElement stf2=driver.findElement(By.name("reg_email__"));
	stf2.sendKeys("kadamanuradha122@gmail.com");
	WebElement stf3=driver.findElement(By.name("reg_email_confirmation__"));
	stf3.sendKeys("kadamanuradha122@gmail.com");
	WebElement stf4=driver.findElement(By.name("reg_passwd__"));
	stf4.sendKeys("anu1711001");
	
	WebElement stf5=driver.findElement(By.id("month"));
	stf5.sendKeys("Nov");
	WebElement stf6=driver.findElement(By.id("day"));
	stf6.sendKeys("17");
	WebElement stf7=driver.findElement(By.id("year"));
	stf7.sendKeys("2000");
	
	WebElement stf8=driver.findElement(By.cssSelector("input[value='1']"));
	stf8.click();
	
	WebElement stfA=driver.findElement(By.name("websubmit"));
	stfA.click();
}

}
			


