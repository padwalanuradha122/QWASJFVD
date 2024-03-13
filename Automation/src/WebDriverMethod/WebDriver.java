package WebDriverMethod;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {

public static void main(String[] args) {
	org.openqa.selenium.WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement stf=driver.findElement(By.id("_aa4b _add6 _ac4d _ap35"));
		stf.sendKeys("_anu_1711");
		WebElement stf1=driver.findElement(By.name("_aa4b _add6 _ac4d _ap35"));
		stf1.sendKeys("171100anu");
		WebElement stf2=driver.findElement(By.name("login"));
		stf2.click();
		
}
}