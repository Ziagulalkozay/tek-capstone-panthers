package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@FindBy (id = "nameInput")
	public WebElement nameInput;
	
	@FindBy(id= "personalPhoneInput")
	public WebElement personalPhoneInput;
	
	
	@FindBy(id="emailInput")
	public WebElement emailInput;
	
	@FindBy (id = "personalUpdateBtn")
	public WebElement personalUpdateBtn;
	
	@FindBy(id ="previousPasswordInput")
	public WebElement previousPasswordInput;
	
	@FindBy(id="newPasswordInput")
	public WebElement newPasswordInput;
	
	
	@FindBy (id="confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement changePassword;

	@FindBy(id="accountLink")
	public WebElement accountLink;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCardInput;
	
	@FindBy (id = "expirationMonthInput")
	public WebElement expirationMonthInput;
	
	
	@FindBy (id ="expirationYearInput")
	public WebElement expirationYearInput;
	
	@FindBy (id = "securityCodeInput")
	public WebElement securityCodeInput;
	
	@FindBy (id = "paymentSubmitBtn")
	public WebElement paymentSubmitBtn;
	
}
