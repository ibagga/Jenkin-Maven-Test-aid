package Test;


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
		driver.get("http://10.54.139.155:8082/Jenkin-Maven-Web-aid/");  
		String title = driver.getTitle();
		System.out.print("Title is : " + title);
		 	

	}

}
