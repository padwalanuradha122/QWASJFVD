package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropdown {


private static final int i = 0;

public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Anuradha/Desktop/Registration%20page.html");
	WebElement multiselectDropdown=driver.findElement(By.id("//select[@id='dropdown']"));
	
	Select s =new Select(multiselectDropdown);
	
	
	for(int i=0;i<4;i++);
	{
		
		s.selectByIndex(i);
		Thread.sleep(2000);
	}
	
	for(int i=0;i<4;i++);
	{
		
		s.deselectByIndex(i);
		Thread.sleep(2000);
	}
	
	
}
}