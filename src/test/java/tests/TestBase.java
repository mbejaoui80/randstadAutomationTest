package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	public static WebDriver driver ;

	@BeforeTest

	public void startDriver()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe"); 
		driver = new ChromeDriver();
		
		// 1 | Ouvrir https://www.randstad.fr/
		
		driver.navigate().to("https://www.randstad.fr/");
		
		// 2 | Maximiser la fenêtre
		driver.manage().window().maximize();

		// 3 | Accepter les cookies
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div/button")).click();
		
		// 4 |  Fermer le chat
		
		driver.findElement(By.cssSelector(".greeting-message-box path")).click();
	}

	@AfterTest(enabled=true)

	//  | Fermer le navigateur 
	
	public void stopDriver()
	{
		driver.quit();
	}


}
