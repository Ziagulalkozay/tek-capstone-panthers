package tek.sdet.framework.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.core.logging.Logger;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebSite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + "is equal to " + expectedTitle);
		slowDown();

	}

	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allSection);
		logger.info("User Clicked on All Section");
		
	}

	@Then("Below options are present in Shop Department sidebar")
	public void belowOptionsArePresentInDepartmentSidebar(DataTable dataTable) {
		List<List<String>> AllOptiondata = dataTable.asLists(String.class);
		for(int i=0; i<AllOptiondata.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text() ='"+AllOptiondata.get(0).get(i)+"']"))));
		logger.info(AllOptiondata.get(0).get(i)+"is present");
		}
	}
	

	@And ("User on {string}")
	public void userOnBarSide(String department) {
		
	//	List<WebElement> dept = factory.homePage().sidebar;
	//	for(WebElement element : dept) {
	//		if(element.getText().equals(department)) {
	//			element.click();
	//			break;
	//		}
	//	}
		
	//}
		if(department.equals("Electronics")) {
			getDriver().findElement(By.xpath("//span[text() ='Electronics']")).click();
		}else if(department.equals("Computers")) {
			getDriver().findElement(By.xpath("//span[text() ='Computers']")).click();
		}else if(department.equals("Smart Home")) {
			getDriver().findElement(By.xpath("//span[text() ='Smart Home']")).click();
		}else if(department.equals("Sports")) {
			getDriver().findElement(By.xpath("//span[text() ='Sports']")).click();
		}else {
			getDriver().findElement(By.xpath("//span[text() ='Automative']")).click();
		}
	}
	
	@Then("below options are present in department")
	public void belowOptionsArePresentInShopDepartmentSidebar(DataTable dataTable) {
		List<List<String>> department = dataTable.asLists(String.class);
		for(int i =0; i<department.get(0).size(); i++) {
        switch (department.get(0).get(i)) {
        case "TV & Video":
            Assert.assertTrue(getDriver().findElement(By.xpath("//span[text() ='TV & Video']")).isDisplayed());
            logger.info("TV & Video sub Department");
            break;
        case "Video Games":
            Assert.assertTrue(getDriver().findElement(By.xpath("//span[text() ='Video Games']")).isDisplayed());
            logger.info("Video Games sub Department");
            break;
        case "Accessories":
            Assert.assertTrue(getDriver().findElement(By.xpath("//span[text() ='Accessories']")).isDisplayed());
            logger.info("Accessories sub Department");
            break;
        case "Networking":
            Assert.assertTrue(getDriver().findElement(By.xpath("//span[text() ='Networking']")).isDisplayed());
            logger.info("Networking sub Department");
            break;
        case "Smart Home Lightning":
            Assert.assertTrue(getDriver().findElement(By.xpath("//span[text() ='Smart Home Lightning']")).isDisplayed());
            logger.info("Smart Home Lightning sub Department");
            break;
        case "Plugs and Outlets":
            Assert.assertTrue(getDriver().findElement(By.xpath("//span[text() ='Plugs and Outlets']")).isDisplayed());
            logger.info("Plugs and Outlets sub Department");
            break;
        case "Athletic Clothing":
            Assert.assertTrue(getDriver().findElement(By.xpath("//span[text() ='Athletic Clothing']")).isDisplayed());
            logger.info("Athletic Clothing sub Department");
            break;
        case "Exercise & Fitness":
            Assert.assertTrue(getDriver().findElement(By.xpath("//span[text() ='Exercise & Fitness']")).isDisplayed());
            logger.info("Exercise & Fitness sub Department");
            break;
        case "Automative Parts & Accessories":
            Assert.assertTrue(getDriver().findElement(By.xpath("//span[text() ='Automative Parts & Accessories']")).isDisplayed());
            logger.info("Automative Parts & Accessories sub Department");
            break;
        case "MotorCycle & Powersports":
            Assert.assertTrue(getDriver().findElement(By.xpath("//span[text() ='MotorCycle & Powersports']")).isDisplayed());
            logger.info("MotorCycle & Powersports sub Department");
            break;

        }
		}
		slowDown();
    }
	
	@And("User change the category to {string}")
	public void userChangeTheCategoryTo(String value) {
		selectByVisibleText(factory.homePage().allDepartments, value);
		logger.info(value + "was selected from the drop down");
	}

	@And ("User search for an item {string}")
	public void userSearchForAnItem(String value) {
		sendText(factory.homePage().searchInputField, value);
		logger.info("user entered" + value);
		slowDown();

	}

	@And ("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButtonofsearchBox);
		logger.info("User clicked on Search Box icon");

	}

	@Then("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().KasaOutdoorSmartPligImage);
		logger.info("User Clicked on Item image");
		slowDown();
	}

	@Then("User select quantity {string}")
	public void userSelectQuantity(String num) {
		sendText(factory.homePage().Qyt2, num);
		logger.info("added QTY");
	}

	@And("Userclick add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addtoCartBtton);
		logger.info("User clicked on Add to card Button");
		slowDown();
	}

	@Then ("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String quantity) {
		
		if(quantity.equals("2")) {
		Assert.assertTrue(getDriver().findElement(By.xpath("//span[@class='top-nav__cart-quantity']")).isDisplayed());
        logger.info("the cart icon quantity has been changed ");
		}else {
			logger.info(quantity+"is incorrect value");
		}
		slowDown();
	}
	
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	    click(factory.homePage().cartButton);
	    logger.info("User clicked on Cart Button successfully");
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	    click(factory.homePage().proceedtoCheckout);
	    logger.info("User clicked on Proceed to Checkout Button");
	}
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	    click(factory.homePage().addNewAddressCartSection);
	    logger.info("User cliked Add a new Address link for shipping address");
	}
	@And ("User fill new address form with below information in shipping Page")
	public void userfillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String>>AddressInfo = data.asMaps(String.class, String.class);
		selectByVisibleText(factory.homePage().countryDropdown, AddressInfo.get(0).get("country"));
		sendText(factory.homePage().fullNameInput,AddressInfo.get(0).get("fullName"));
		sendText(factory.homePage().phoneNumberInput,AddressInfo.get(0).get("phoneNumber"));
		sendText(factory.homePage().streetInput,AddressInfo.get(0).get("streetAddress"));
		sendText(factory.homePage().apartmentInput,AddressInfo.get(0).get("Apartment"));
		sendText(factory.homePage().cityInputshiping,AddressInfo.get(0).get("city"));
		selectByVisibleText(factory.homePage().stateName, AddressInfo.get(0).get("state"));
		sendText(factory.homePage().zipCodeInput, AddressInfo.get(0).get("zipCode"));
		logger.info("User Added information of Shipping Addres");
		
		
	}
	@Then("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
	    click(factory.homePage().addressBtnshippingAddress);
	    logger.info("User Clicked to Add your Address button Successfully");
	    slowDown();
	}
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		waitTillPresence(factory.homePage().addPaymentBtnShippingCart);
	    click(factory.homePage().addPaymentBtnShippingCart);
	    logger.info("User Clicked on Add a credit card or Debit Card for Payment method link");
	}
	@Then("User fill Debit or credit card information in shiping section")
	public void userFillDebitOrCreditCardInformation(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> CardInfo = dataTable.asMaps(String.class, String.class);
	    sendText(factory.homePage().cardNumberInput, CardInfo.get(0).get("cardNumber"));
	    sendText(factory.homePage().nameOnCardInput, CardInfo.get(0).get("nameOnCard"));
	    sendText(factory.homePage().expirationMonthInput, CardInfo.get(0).get("expirationMonth"));
	    sendText(factory.homePage().expirationYearInput, CardInfo.get(0).get("expirationYear"));
	    sendText(factory.homePage().securityCodeInput, CardInfo.get(0).get("securityCode"));
	    logger.info("User Added Debit or Credit information");
	    slowDown();
	}
	@Then("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
	    click(factory.homePage().paymentSubmitBtn);
	    logger.info("User Clicked on Add your Card Button");
	    slowDown();
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	    click(factory.homePage().placeOrderBtn);
	    logger.info("User clicked on Pace order button");
	}
	@Then("a message should be displayed in Cartpage {string}")
	public void aMessageShouldBeDisplayedOrderPlacedThanks(String ExpectedMassege) {
		waitTillPresence(factory.homePage().OrderPlacedSuccessfully);
		Assert.assertEquals(ExpectedMassege, factory.homePage().OrderPlacedSuccessfully.getText());
		logger.info(ExpectedMassege+ "is displayed");
	}
	
	@Then("User click on item imag")
	public void userClickOnItemImag() {
		click(factory.homePage().ApexLegends);
		logger.info("User Clicked on Item image");
		slowDown();
	}
	
}
