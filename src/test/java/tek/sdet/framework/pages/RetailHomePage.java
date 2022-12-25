package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath= "//a[@class='top-nav__logo active']")
	public WebElement logo;
	
	@FindBy(id="signinLink")
	public WebElement signIn;
	
	@FindBy(id ="accountLink")
	public WebElement account;
	
	@FindBy(xpath ="//span[text() ='Electronics']")
	public WebElement electronics1;
	
	@FindBy(xpath ="//span[text() ='Computers']")
	public WebElement computers1;
	
	
	@FindBy(xpath ="//span[text() ='Sports']")
	public WebElement sports1;
	
	@FindBy(xpath ="//span[text() ='Automative']")
	public WebElement Automative1;	
	
	@FindBy (xpath ="//span[text() ='All']")
	public WebElement allSection;
	
	@FindBy(id = "search")
	public WebElement allDepartments;
	
	@FindBy (xpath ="//select[contains(@id,'search')][1]/option[4]")
	public WebElement smartHome4;
	
	@FindBy (id="searchInput")
	public WebElement searchInputField;
	
	@FindBy(id = "searchBtn")
	public WebElement searchButtonofsearchBox;
	
	@FindBy (xpath= "//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement KasaOutdoorSmartPligImage;
	
	@FindBy (xpath="//select[@class ='product__select']")
	public WebElement Qyt2;
	
	@FindBy (id="addToCartBtn")
	public WebElement addtoCartBtton;
	
	@FindBy(id ="cartQuantity")
	public WebElement cartQuantity;
	
	@FindBy(id ="contentHeader")
	public WebElement ShopbydepartmentList;
	
	@FindBy(xpath="//div[@class='modal__content h-screen w-80 ']")
	public WebElement SubPageofShopingList;
	
	
	@FindBy (xpath="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sidebar;
	
	
	@FindBy (id ="cartBtn")
	public WebElement cartButton;
	
	@FindBy (id ="proceedBtn")
	public WebElement proceedtoCheckout;
	
	@FindBy (id = "addAddressBtn")
	public WebElement addNewAddressCartSection;
	
	@FindBy (id="countryDropdown")
	public WebElement countryDropdown;
	
	@FindBy (id="fullNameInput")
	public WebElement fullNameInput;
	
	@FindBy (id="phoneNumberInput")
	public WebElement phoneNumberInput;
	
	@FindBy (id="streetInput")
	public WebElement streetInput;
	
	@FindBy (id="apartmentInput")
	public WebElement apartmentInput;
	
	@FindBy (id="cityInput")
	public WebElement cityInputshiping;
	
	@FindBy (xpath="//select[@name='state']")
	public WebElement stateName;
	
	@FindBy (id="zipCodeInput")
	public WebElement zipCodeInput;
	
	@FindBy (id="addressBtn")
	public WebElement addressBtnshippingAddress;
	
	@FindBy(id ="addPaymentBtn")
	public WebElement addPaymentBtnShippingCart;
	
	@FindBy (id ="cardNumberInput")
	public WebElement cardNumberInput;
	
	@FindBy (id ="nameOnCardInput")
	public WebElement nameOnCardInput;
	
	@FindBy (id ="expirationMonthInput")
	public WebElement expirationMonthInput;
	
	@FindBy (id ="expirationYearInput")
	public WebElement expirationYearInput;
	
	@FindBy (id ="securityCodeInput")
	public WebElement securityCodeInput;
	
	@FindBy (id ="paymentSubmitBtn")
	public WebElement paymentSubmitBtn;
	
	@FindBy (id ="placeOrderBtn")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath ="//div[text()='Order Placed Successfully']")
	public WebElement OrderPlacedSuccessfully ;
	
	@FindBy (xpath= "//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement ApexLegends;
	

}
