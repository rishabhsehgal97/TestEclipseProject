package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B2BHomepage{

	WebDriver ldriver;

	public B2BHomepage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}


	@FindBy(xpath = "//a[@title='JDmart - B2B marketplace']")
	WebElement B2BBanner;

	@FindBy(xpath = "(//ul[contains(@class,'new__jdmart__subnav__left')]//li)[1]")
	WebElement AllCatB2B;

	@FindBy(xpath = "//div[contains(@class,'homecard_28_heading')]")
	WebElement firstSec;

	@FindBy(xpath = "//section[contains(@class,'jdmart_rfqdeal_pop')]")
	WebElement RFQPopup;
	
	@FindBy(xpath = "//div[contains(@class,'rfqdeal_maintext')]")
	WebElement RFQPopupHeading;

	@FindBy(xpath = "//div[contains(@class,'jdmart_modal_close')]")
	WebElement RFQPopupclose;
	


	public void ClickB2BBanner() {
		B2BBanner.click();
	}

	public String SecB2BGT() {
		return firstSec.getText();
	}

	public String AllCatB2BGT() {
		return AllCatB2B.getText();
	}

	public boolean CheckRFQPopup() {
		return RFQPopup.isDisplayed();
	}

	public String HeadingRFQPopup() {
		return RFQPopupHeading.getText();
	}

	public void DismissRFQPopup() {
		RFQPopupclose.click();
	}
	
	 

}
