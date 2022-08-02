package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoPage;
import pomPages.SkillraryPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass {
	@Test
	public void tc2() throws IOException {
	SkillraryPage s = new SkillraryPage(driver);
	s.gearsbutton();
	s.skillrarydemoapplication();
	
	driverutilities.switchTabs(driver);
	SkillraryDemoPage d=new SkillraryDemoPage(driver);
	driverutilities.dropdown(d.getCoursedd(),pdata.getData("coursename"));
	
	TestingPage t=new TestingPage(driver);
	driverutilities.draganddrop(driver,t.getSeleniumtraining(),t.getCart());
	Point loc=t.getFacebook().getLocation();
	int x=loc.getX();
	int y=loc.getY();
	driverutilities.scrollBar(driver, x, y);
	t.facebookicon();
			
	}

}
