package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DetailOffrePage extends PageBase
{

	public DetailOffrePage(WebDriver driver)
	{
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver);
	}

	@FindBy(xpath = ("//p[contains(text(),\"niveau d'études :\")]"))
	
	public WebElement TextDetail;

	public void veriferTextOffre()
	{
		scrollToButton();
		System.out.println(TextDetail.getText());

		
	}


}
