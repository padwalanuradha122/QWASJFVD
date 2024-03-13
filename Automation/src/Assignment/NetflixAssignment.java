package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixAssignment {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Netflix.com/");

		driver.findElement(By.xpath("//a[@id='signIn']")).click();
		driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys("kadamanuradha122@gmail.com");
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("171100anu");
	
	
	}
}