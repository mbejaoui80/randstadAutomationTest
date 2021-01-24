package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RandstadHomePage extends PageBase
{

	public RandstadHomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver);
	}

	@FindBy(id=("id_What"))
	WebElement qualifTxtBox;

	/*@FindBy(id = ("nlc"))
	WebElement locationBtn;*/

	@FindBy(xpath=("//span[contains(.,\'région ou département\')]"))
	WebElement UserlocationBox;
	
	@FindBy(xpath = ("//li[contains(.,\'Bretagne\')]"))
	WebElement UserLocationChoice;


	@FindBy(css=(".d-lg-block > .icon"))
	WebElement submitBtn;

	public void taperQualification(String qualification)
	{

		setTextElementText(qualifTxtBox, qualification);

	}

	public void selectionnerLocation()
	{
		/*select = new Select(locationBtn); 
		select.selectByVisibleText("Bretagne");*/
		clickButton(UserlocationBox);
		clickButton(UserLocationChoice);
		
		
	}
	
	public void validerRecherche()
	{
		

		clickButton(submitBtn);
	}




}
