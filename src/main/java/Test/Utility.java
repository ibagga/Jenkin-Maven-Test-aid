package Test;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Utility {
	private static WebDriver driver;
	
	@Test
	public static void main()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\i077219\\Desktop\\TrashBin\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://localhost:8082/Jenkin-Maven-Web-aid/");  
		String title = driver.getTitle();
		System.out.print("Title is : " + title);
		 	

	}
	@Test
	public static void main1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\i077219\\Desktop\\TrashBin\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://localhost:8082/Jenkin-Maven-Web-aid/");  
		String title = driver.getTitle();
		System.out.print("Title is : " + title);
		 	

	}

}
