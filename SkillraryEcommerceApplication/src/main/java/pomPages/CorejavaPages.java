package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorejavaPages
{
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement selenium;
	
	public CorejavaPages(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void seleniumcourse()
	{
		selenium.click();
	}
	
}
