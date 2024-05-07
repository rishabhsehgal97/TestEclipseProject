package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	@FindBy(xpath = "//section[contains(@class,'loginPop')]")
	WebElement LoginPopup;
	
	@FindBy(xpath = "//span[@aria-label='May be later']")
	WebElement LoginPopupClose;

	@FindBy(xpath = "//li[contains(@class,'headnav_user')]")
	WebElement LoginBtn;

	@FindBy(xpath = "//input[@placeholder='Mobile Number']")
	WebElement LoginNumber;

	@FindBy(id = "loginOtpTriggerBtn")
	WebElement LoginWithOtpBtn;

	/*
	@FindBy(xpath = "//input[contains(@class,'otpfield')]")
	List<WebElement> OtpField;
	WebElement OtpField;
	*/
	
	@FindBy(xpath="(//div[contains(@class,'login_otpfield')]//input)[1]") WebElement
	  OtpField1;
	  
	  @FindBy(xpath="(//div[contains(@class,'login_otpfield')]//input)[2]") WebElement
	  OtpField2;
	  
	  @FindBy(xpath="(//div[contains(@class,'login_otpfield')]//input)[3]") WebElement
	  OtpField3;
	  
	  @FindBy(xpath="(//div[contains(@class,'login_otpfield')]//input") WebElement
	  OtpField4;
	 
	  @FindBy(xpath="(//div[contains(@class,'login_otpfield')]//input)[5]") WebElement
	  OtpField5;
	  
	  @FindBy(xpath="(//div[contains(@class,'login_otpfield')]//input)[6]") WebElement
	  OtpField6;
	

	/*
	  @FindBy(xpath="(//input[contains(@class,'otpfield')])[1]") WebElement
	  OtpField1;
	  
	  @FindBy(xpath="(//input[contains(@class,'otpfield')])[2]") WebElement
	  OtpField2;
	  
	  @FindBy(xpath="(//input[contains(@class,'otpfield')])[3]") WebElement
	  OtpField3;
	  
	  @FindBy(xpath="(//input[contains(@class,'otpfield')])[4]") WebElement
	  OtpField4;
	 
	  @FindBy(xpath="(//input[contains(@class,'otpfield')])[5]") WebElement
	  OtpField5;
	  
	  @FindBy(xpath="(//input[contains(@class,'otpfield')])[6]") WebElement
	  OtpField6;
	
	 */
	  
	  

		public boolean CheckLoginPopup() {
			return LoginPopup.isDisplayed();
		}
		
		public void DismissLoginPopup() {
			LoginPopupClose.click();
		}
		

	public void ClickLoginButton() {
		LoginBtn.click();
	}

	public void SetLoginNumber(String mobnum) {
		LoginNumber.sendKeys(mobnum);
	}

	public void ClickLoginWithOtpBtn() {
		LoginWithOtpBtn.click();
	}
	
/*
	  public void SetOtpField(String OTPvalue) 
	  { 
		  OtpField.sendKeys(OTPvalue);
	  }
*/

	
	

	/*
	public void SetOtpField1(String OTPvalue) { OtpField1.sendKeys
		 (String.valueOf(OTPvalue.charAt(0)));
	 }
	public void SetOtpField2(String OTPvalue) { OtpField2.sendKeys
		 (String.valueOf(OTPvalue.charAt(1)));
	 }
	public void SetOtpField3(String OTPvalue) { OtpField3.sendKeys
		 (String.valueOf(OTPvalue.charAt(2)));
	 }
	public void SetOtpField4(String OTPvalue) { OtpField4.sendKeys
		 (String.valueOf(OTPvalue.charAt(3)));
	 }
	public void SetOtpField5(String OTPvalue) { OtpField5.sendKeys
		 (String.valueOf(OTPvalue.charAt(4)));
	 }
	public void SetOtpField6(String OTPvalue) { OtpField6.sendKeys
		 (String.valueOf(OTPvalue.charAt(5)));
	 }
	  */
	 
	
		
	  
	public void SetOtpField1(String otp1) { OtpField1.sendKeys(otp1); }
	  
	  public void SetOtpField2(String otp2) { OtpField2.sendKeys(otp2); }
	  
	  public void SetOtpField3(String otp3) { OtpField3.sendKeys(otp3); }
	  
	  public void SetOtpField4(String otp4) { OtpField4.sendKeys(otp4); }
	  
	  public void SetOtpField5(String otp5) { OtpField5.sendKeys(otp5); }
	  
	  public void SetOtpField6(String otp6) { OtpField6.sendKeys(otp6); } 
	 
	 
	 

}
