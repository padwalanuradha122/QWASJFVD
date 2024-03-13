package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeAssignment {
public static void main(String[]args) throws InterruptedException {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=20p7lqm0r0xab");
		WebElement stf=driver.findElement(By.name("username"));
		stf.sendKeys("admin");
		WebElement stf1=driver.findElement(By.name("pwd"));
		stf1.sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@class='content users']")).click();
		 
		 driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Anuradha");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Anu171100");
		 
		 driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("Anu171100");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Nilam");
		 
		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Doke");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9545271374");
		 
		 driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("(9665896895)");
		 
		driver.findElement(By.xpath("//input[@type='submit' and @value='   Create User   ']")).click();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@class='logout']")).click();
}
}