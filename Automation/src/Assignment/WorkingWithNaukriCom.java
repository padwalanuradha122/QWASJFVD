package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNaukriCom {
	


public static void main(String[] args) {
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.naukri.com/");
	
	
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	
	//enter name in name
	driver.findElement(By.id("name")).sendKeys("komal");
	
	//enter email
	driver.findElement(By.id("email")).sendKeys("171100komal@gmail.com");
	
	//enter pwd
	driver.findElement(By.id("password")).sendKeys("85@965475");
	
	//enter mobile no
	driver.findElement(By.id("mobile")).sendKeys("8596968596");
	
	//click on fresher
	driver.findElement(By.xpath("(//div[@tabindex='0'])[2]")).click();
	//enter current location
	driver.findElement(By.xpath("//span[text()='Pune']")).click();

	//click on check box
	driver.findElement(By.xpath("//i[@class='ico resman-icon resman-icon-check-box']")).click();
	
	//click on register
	driver.findElement(By.xpath("//button[text()='Register now']")).click();
	
	
	//click on login
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	//enter email
	driver.findElement(By.id("usernameField")).sendKeys("171100komal@gmail.com");
	//Enter pwd
	driver.findElement(By.id("passwordField")).sendKeys("85@965475");
	//click on login button
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	

}
}