package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingChandlerBing {
public static void main(String[]args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Chandler Bing",Keys.ENTER);
		driver.findElement(By.xpath("//canvas[@class='lNPNe']")).click(); 
}     
		
}
