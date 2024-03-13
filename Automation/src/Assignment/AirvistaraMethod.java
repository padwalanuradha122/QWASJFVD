package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirvistaraMethod {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.airvistara.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='cookieModalCloseBtn']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search origin']")).sendKeys("PAT");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\'flightSearchFrom\']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search destination']")).sendKeys("BOM");

		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-date=\'3\']")).click();
		Thread.sleep(1000);

		WebElement stf5=driver.findElement(By.id("return-radio"));
		stf5.click();
		
		
		WebElement stf1=driver.findElement(By.name("ui-state-default ui-state-active"));
		stf1.click();
		
		
		
		
}
}