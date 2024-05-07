package TestCases;

import org.testng.annotations.Test;

import PageObjects.B2BHomepage;

public class TC_001 extends BaseClass {

	@Test

	public void B2BHomepage() throws InterruptedException {
		
		

		B2BHomepage BH = new B2BHomepage(driver);

		driver.get(basURL);
		BH.ClickB2BBanner();

		Thread.sleep(2000);

		BH.SecB2BGT();
		System.out.println(driver.getCurrentUrl());

		/*
		 * if(BH.CheckLoginPopup()) { BH.DismissLoginPopup(); }
		 * 
		 * Thread.sleep(2000);
		 * 
		 * 
		 * 
		 * if(BH.CheckRFQPopup()) { System.out.println(BH.HeadingRFQPopup());
		 * BH.DismissRFQPopup(); Thread.sleep(2000); }
		 */

	}

}
