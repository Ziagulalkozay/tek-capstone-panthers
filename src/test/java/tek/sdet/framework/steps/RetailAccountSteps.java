package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory ();
	
	
	@Then("User click on Account button")
	public void userClickedOnAccountButton() {
		click(factory.accountPage().accountLink);
		logger.info("User Clicked on The Account Button");
		slowDown();
	}
	
	@And ("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().nameInput);
		sendText(factory.accountPage().nameInput,nameValue);
		clearTextUsingSendKeys(factory.accountPage().personalPhoneInput);
		sendText(factory.accountPage().personalPhoneInput,phoneValue);
		logger.info("User updated name and Phone");
		slowDown();
	}
	
	@And ("User click on update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().personalUpdateBtn);
		logger.info("User Clicked on update button");
		
	}

	@Then("User information should be updated")
	public void userInformationShoudBeUpdated() {
		waitTillPresence(factory.accountPage().personalInformationupdatedsuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInformationupdatedsuccessfully));
		String actualMessage = factory.accountPage().personalInformationupdatedsuccessfully.getText();
		String expectedMessage = "Personal Information Updated Successfully";
		Assert.assertEquals(actualMessage, expectedMessage);
		logger.info("User profile information is updated");
		slowDown();
	}
	
	
	@And ("User Entered below information")
	public void userEnteredBelowIformation(DataTable data1) {
		
		List<Map<String, String>>changePass = data1.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPasswordInput,changePass.get(0).get("Previous Password"));
		sendText(factory.accountPage().newPasswordInput, changePass.get(0).get("New Password"));
		sendText(factory.accountPage().confirmPasswordInput, changePass.get(0).get("Confirm Password"));
		logger.info("User changed password Information");
		
	}
	@Then ("User click on the change Password button")
	public void userClickOnTheChangePasswordButton() {
		click(factory.accountPage().changePassword);
		logger.info("User Clicked on the Change Passowrd Button");
	}
	@Then("a Massage Should be Displayed {string}")
	public void aMassageShouldBeDisplayed(String ExpectedMassage) {
		waitTillPresence(factory.accountPage().passwordUpdateMassage);
		Assert.assertEquals(ExpectedMassage, factory.accountPage().passwordUpdateMassage.getText());
		logger.info(ExpectedMassage+ "is displayed");
	}
	
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addpaymentmethod);
		logger.info("User Clicked on Add a Payment Method link");
		
	}
	
	
	@And("User fill Debit or credit card informtion")
	public void userEnterCardInformation(DataTable dataa) {
	List<Map<String, String>>cardInfo = dataa.asMaps(String.class, String.class);
	sendText(factory.accountPage().cardNumberInput,cardInfo.get(0).get("Card Number"));
	sendText(factory.accountPage().nameOnCardInput,cardInfo.get(0).get("Name on Card"));
	sendText(factory.accountPage().expirationMonthInput,cardInfo.get(0).get("Expiration Date Month"));
	sendText(factory.accountPage().expirationYearInput,cardInfo.get(0).get("Expiration Date Year"));
	sendText(factory.accountPage().securityCodeInput,cardInfo.get(0).get("Security Code"));
	slowDown();
		
	}
	
	@And ("User click on the Add your Card button")
	public void userClickOnTheAddYourCardButtn() {
		click(factory.accountPage().addYourCardButton);
		logger.info("User Clicked on The Add your Buttton ");
		
	}
	
	@Then("a message should be displayedd {string}")
	public void aMassageShouldBeDisplayedd(String ExpectedMassage) {
		waitTillPresence(factory.accountPage().PaymentMethodaddedsucessfullyMessage);
		Assert.assertEquals(ExpectedMassage, factory.accountPage().PaymentMethodaddedsucessfullyMessage.getText());
		logger.info(ExpectedMassage+ "is displayed");

	}
	
	@When("User select card with ending {string}")
	public void userClickOnTheCard(String cardEndingNumber) {
		
		List<WebElement> cards = factory.accountPage().cardEndingNumber;
		for (WebElement card: cards) {
			if(card.getText().equals(cardEndingNumber))
				System.out.println(card.getText()+ "============");
				click(card);
			logger.info(cardEndingNumber + "is selected");
			break;
		}
	}
	
	@Then("User click on Edit option of card selection")
	public void userClickOnEditOptionOfCardSelection() {
	    click(factory.accountPage().cardEditButton);
	    logger.info("User clicked on the Edit Option");
	}
	
	@Then("User edit information with below data")
	public void userEditInformationWithBelowData(DataTable data ) {
		List<Map<String, String>>cardupdatInfo = data.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().updateCardNumberInput);
		sendText(factory.accountPage().updateCardNumberInput,cardupdatInfo.get(0).get("updatcardNumber"));
		clearTextUsingSendKeys(factory.accountPage().updatenameOnCardInput);
		sendText(factory.accountPage().updatenameOnCardInput,cardupdatInfo.get(0).get("updatnameOnCard"));
		clearTextUsingSendKeys(factory.accountPage().updateexpirationMonthInput);
		sendText(factory.accountPage().updateexpirationMonthInput,cardupdatInfo.get(0).get("updateexpirationMonth"));
		clearTextUsingSendKeys(factory.accountPage().updateexpirationYearInput);
		sendText(factory.accountPage().updateexpirationYearInput,cardupdatInfo.get(0).get("updateexpirationYear"));
		clearTextUsingSendKeys(factory.accountPage().updatesecurityCodeInput);
		sendText(factory.accountPage().updatesecurityCodeInput,cardupdatInfo.get(0).get("UpdatesecurityCode"));
		logger.info("User Updated information of Debit or Credit Card");
		slowDown();
	    
	}
	@Then("User click on Update Card button")
	public void userClickOnUpdateCardButton() {
		click(factory.accountPage().updatepaymentSubmitBtn);
		logger.info("User Clicked on update Button");
	    
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectMessage) {
		waitTillPresence(factory.accountPage().updatePaymentMethodsucessfullyMessage);
		Assert.assertEquals(expectMessage, factory.accountPage().updatePaymentMethodsucessfullyMessage.getText());
		logger.info(expectMessage+ "is displayed");
	   
	}
	
	@When("User click on remove option of selected card")
	public void userClickOnRemoveOptionOfSelectedCard() {
	    click(factory.accountPage().removeButton);
	    logger.info("The Selected card Removed");
	}
	
	@Then("The Payment details should be removed")
	public void thePaymentDetailsShouldBeRemoved() {
		try {
		Assert.assertFalse(isElementDisplayed(factory.accountPage().Cardavailablity));
		logger.info("payment details removed from account");
	}catch (AssertionError e) {
		logger.info(e.getMessage());
	}
	}
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
	    click(factory.accountPage().addAddressLink);
	    logger.info("User Clicked pm the Add address link");
	}
	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>>AddressInfo = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().countryName, AddressInfo.get(0).get("country"));
		sendText(factory.accountPage().fullNameinAddressSection,AddressInfo.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumberInAddressSection,AddressInfo.get(0).get("phoneNumber"));
		sendText(factory.accountPage().Streetaddress,AddressInfo.get(0).get("streetAddress"));
		sendText(factory.accountPage().apartmentnumber,AddressInfo.get(0).get("apt"));
		sendText(factory.accountPage().Cityname,AddressInfo.get(0).get("city"));
		selectByVisibleText(factory.accountPage().state, AddressInfo.get(0).get("state"));
		sendText(factory.accountPage().zipCode, AddressInfo.get(0).get("zipCode"));
		logger.info("User Added information of Addres");
		slowDown();
	}

	@When("User click Add your Address button")
	public void userClickAddYourAddressButton() {
	   click(factory.accountPage().addressbuttonForaddingAddres);
	   logger.info("User Clicked Address Button");
	}
	@Then("a message should be sidplayed {string}")
	public void aMessageShouldBeSidplayed(String expect) {
		waitTillPresence(factory.accountPage().addressAddedSyccessfullyMessage);
		Assert.assertEquals(expect, factory.accountPage().addressAddedSyccessfullyMessage.getText());
		logger.info(expect+ "is displayed");
	}

     @Then("User click on remove option of Address section")
     public void userClickOnRemoveOptionOfAddressSection() {
      click(factory.accountPage().RemoveAddressLink);
      logger.info("User Clicked on the remove link of Address Section");
  }
     @Then("Address details should be removed")
    public void addressDetailsShouldBeRemoved() {
    		try {
    			Assert.assertFalse(isElementDisplayed(factory.accountPage().Addresspresent));
    			logger.info("Address details removed from Account");
    		}catch (AssertionError e) {
    			logger.info(e.getMessage());
    		}
   
  }
  

}
