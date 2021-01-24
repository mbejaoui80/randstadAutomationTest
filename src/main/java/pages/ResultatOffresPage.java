package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ResultatOffresPage extends PageBase
{
	public ResultatOffresPage(WebDriver driver) {

		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver);}


	@FindBy(xpath = ("(//a[contains(@href, 'https://www.randstad.fr/offre/001-pst-0000041_10l/boulanger_f_h_/')])[3]"))
	WebElement offreBtn;


	public void afficherOffrePage()
	{

		scrollToButton();
		clickButton(offreBtn);

	}
}


