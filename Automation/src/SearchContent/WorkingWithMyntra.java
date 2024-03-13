package SearchContent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithMyntra {
		public static void main(String[] args) {
			 WebDriver driver=new ChromeDriver();
			 
			 
			 driver.manage().window().maximize();
			 
			 driver.get("https://www.myntra.com/login");
			 
			 
			 driver.findElement(By.xpath("//a[text()='Women']']]")).click();
				
				
}
}