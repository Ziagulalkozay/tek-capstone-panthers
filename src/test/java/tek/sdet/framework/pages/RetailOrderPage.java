package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends  BaseSetup{
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy (id = "orderLink")
	public WebElement orderLink;
	
	@FindBy(xpath ="//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement FirstOrderItem;
	
	@FindBy (id = "cancelBtn")
	public WebElement cancelBtn;
	
	@FindBy (id = "reasonInput")
	public WebElement reasonInput;
	
	@FindBy (id = "orderSubmitBtn")
	public WebElement caneclorderSubmitBtn;
	
	@FindBy(xpath ="//p[text()='Your Order Has Been Cancelled']")
	public WebElement CancelledOrderMassege;
	
	
	@FindBy (id = "dropOffInput")
	public WebElement dropOffInput;
	
	@FindBy(id = "returnBtn")
	public WebElement returnBtn;
	
	
	@FindBy(xpath ="//p[text()='Return was successfull']")
	public WebElement returnWasSuccessfull;
	
	@FindBy (id = "orderSubmitBtn")
	public WebElement ReturnOrderSubmitBtn;
	
	@FindBy(id = "reviewBtn")
	public WebElement reviewBtn;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineInput;
	
	@FindBy(id = "descriptionInput")
	public WebElement descriptionInput;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitBtn;
	
	@FindBy(xpath ="//div[text()='Your review was added successfully']")
	public WebElement yourReviewWasAddedSuccessfully;
	

}
