package WebDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClass {


public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement stf=driver.findElement(By.name("username"));
		stf.sendKeys("_anu_1711_");
		WebElement stf1=driver.findElement(By.name("password"));
		stf1.sendKeys("anu1711001");
		WebElement stf2=driver.findElement(By.name("_acap"));
		stf2.click();
}
}