package tek.sdet.framework.pages;

import java.util.List;

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
	
	@FindBy(xpath="//div[text()='Password Updated Successfully']")
		public WebElement passwordUpdateMassage;
	
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
	public WebElement addYourCardButton;
	
	@FindBy (xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInformationupdatedsuccessfully;
	
	@FindBy (xpath="//p[text()='Add a payment method']")
	public WebElement addpaymentmethod;
	
	@FindBy (xpath="//div[text()='Payment Method added sucessfully']")
	public WebElement PaymentMethodaddedsucessfullyMessage;
	
	@FindBy (xpath ="//div[@class='account__payment-sub']/p")
	public List<WebElement> cardEndingNumber;
	
	@FindBy (xpath = "//button[text()='Edit']")
	public WebElement cardEditButton;
	
	@FindBy (id ="cardNumberInput")
	public WebElement updateCardNumberInput;
	
	@FindBy (id ="nameOnCardInput")
	public WebElement updatenameOnCardInput;
	
	@FindBy (id = "expirationMonthInput")
	public WebElement updateexpirationMonthInput;
	
	@FindBy (id="expirationYearInput")
	public WebElement updateexpirationYearInput;
	
	@FindBy (id = "securityCodeInput")
	public WebElement updatesecurityCodeInput;
	
	@FindBy (id = "paymentSubmitBtn")
	public WebElement updatepaymentSubmitBtn;
	
	@FindBy (xpath="//div[text()='Payment Method updated Successfully']")
	public WebElement updatePaymentMethodsucessfullyMessage;

	@FindBy (xpath = "//button[text()='remove']")
	public WebElement removeButton;
	
	@FindBy (xpath = "//div[@class='account__payment-sub']")
	public WebElement Cardavailablity;
	
	@FindBy (xpath ="//div[@class='account__address-new']")
	public WebElement addAddressLink;
	
	@FindBy (id ="countryDropdown")
	public WebElement countryName;
	
	@FindBy (id ="fullNameInput")
	public WebElement fullNameinAddressSection;
	
	@FindBy (id= "phoneNumberInput")
	public WebElement phoneNumberInAddressSection;
	
	@FindBy (id ="streetInput")
	public WebElement Streetaddress;
	
	@FindBy (id ="apartmentInput")
	public WebElement apartmentnumber;
	
	@FindBy (id ="cityInput")
	public WebElement Cityname;
	
	@FindBy (xpath="//select[@name='state']")
	public WebElement state;
	
	@FindBy (id ="zipCodeInput")
	public WebElement zipCode;
	
	@FindBy (id ="addressBtn")
	public WebElement addressbuttonForaddingAddres;
	
	@FindBy (xpath ="//div[text() ='Address Added Successfully']")
	public WebElement addressAddedSyccessfullyMessage;
	
	@FindBy (xpath = "//button[text()='Remove']")
	public WebElement RemoveAddressLink;
	
	@FindBy (xpath="//div[@class='account__address-btn-wrapper']")
	public WebElement Addresspresent;
			
	
}

