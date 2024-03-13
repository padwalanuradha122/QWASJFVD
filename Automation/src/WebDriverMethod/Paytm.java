package WebDriverMethod;

import org.openqa.selenium.WebDriver;

public class Paytm {
	private static Object expected_title;

	public static void main(String[]args) {
		WebDriver driver = null;
		String source= driver.getPageSource();
		System.out.println(source);
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://paytm.com/";
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("TestCase is Pass");
		}
		else
			
		{
			System.out.println("TestCase is Fail");
    	}
		
		String actual_title=driver.getTitle();
	
				Object expected = null;
				if(actual_title.equals(expected ))
				{
					System.out.println("TestCase is Pass");	
				}
				else
				{
					System.out.println("TestCase is Fail");
				}
		driver.close();
	}
}
	


