package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryPage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbutton;
	
	
	public SkillraryPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gearsbutton()
	{
		gearsbtn.click();
	}
	
	public void searchtextbox(String name)
	{
		searchtb.sendKeys(name);
	}
	
	public void searchbutton()
	{
		searchbutton.click();
	}
	
	
	public void skillrarydemoapplication() {
		skillrarydemoapp.click();
	}

}
