package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoShop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("yadavkajal156@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Kajal123456@");
         
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[text()='Health Book']/ancestor::div[@class='item-box']/descendant::input[@type='button']")).click();
			
		
			driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			
			
			driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
			
			driver.findElement(By.xpath("//button[@id='checkout']")).click();
			
			driver.findElement(By.xpath("//input[@value='Checkout as Guest']")).click();
			
			driver.findElement(By.xpath("////span[@id='billing-please-wait']")).click();
			
			driver.findElement(By.xpath("//input[@fdprocessedid='5tl7z4']")).click();
			driver.findElement(By.xpath("//input[@fdprocessedid='1soaz2']")).click();
			
			driver.findElement(By.xpath("//input[@fdprocessedid='l28oyc']")).click();
			driver.findElement(By.xpath("//input[@fdprocessedid='ex2vo9']")).click();
			
			
			driver.findElement(By.xpath("//input[@fdprocessedid='mcgry']")).click();
			
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			
}
	
}