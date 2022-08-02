package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoPage {
	@FindBy(id="course")
	private WebElement coursetab;
	

	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtrainingtab;
	
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	

	public WebElement getCoursedd()
	{
		return coursedd;
	}


	public WebElement getCoursetab()
	{
		return coursetab;
	}

	 
	public SkillraryDemoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
    
	public void seleniumtraining() {
		seleniumtrainingtab.click();
	}

}
