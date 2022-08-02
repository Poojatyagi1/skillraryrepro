package scripts;


import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaPages;
import pomPages.SkillraryPage;
import pomPages.WishListPage;

public class Testcase3 extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException 
	{
	SkillraryPage s=new SkillraryPage(driver);
	s.searchtextbox(pdata.getData("searchtextbox"));
	s.searchbutton();
	
	CorejavaPages c=new CorejavaPages(driver);
	c.seleniumcourse();
	
	WishListPage w= new WishListPage(driver);
	driverutilities.switchtoframe(driver);
	w.playbutton();
	
	Thread.sleep(10000);
	w.pausebutton();
	
    driverutilities.switchbackframe(driver);
	w.wishlistbtn();
	
	}
}
