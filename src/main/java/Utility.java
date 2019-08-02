import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Utility {
	private static WebDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\i077219\\Desktop\\TrashBin\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://localhost:8082/Jenkin-Maven-Web-aid/");  
		String title = driver.getTitle();
		System.out.print("Title is : " + title);
		 	

	}

}
