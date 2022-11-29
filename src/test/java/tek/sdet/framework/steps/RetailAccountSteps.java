package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory ();
	
	@And ("User fill the account profile information with the below data")
	public void userFillTheAccountProfileInformation(DataTable data) {
		List<Map<String, String>> profilInfo= data.asMaps(String.class, String.class);
		sendText(factory.accountPage().nameInput,profilInfo.get(0).get("name"));
		sendText(factory.accountPage().personalPhoneInput, profilInfo.get(0).get("Phone Number"));
		sendText(factory.accountPage().emailInput, profilInfo.get(0).get("email"));
		
		logger.info("User Filled the account profile information");
		slowDown();
	}
	@And ("User click on update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().personalUpdateBtn);
		logger.info("User Clicked on update button");
		slowDown();
	}
	@Then("User click on Account button")
	public void userClickedOnAccountButton() {
		click(factory.accountPage().accountLink);
		logger.info("User Clicked on The Account Button");
		slowDown();
	}
	@And ("User change Password and input below information")
	public void userChangePasswordAndInputBelowInformation(DataTable data1) {
		List<Map<String, String>>changePass = data1.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPasswordInput,changePass.get(0).get("Previous Password"));
		sendText(factory.accountPage().newPasswordInput, changePass.get(0).get("New Password"));
		sendText(factory.accountPage().confirmPasswordInput, changePass.get(0).get("Confirm Password"));
		logger.info("User changed password with the new Information");
		slowDown();
		
	}
	@Then ("User click on the changePassword button")
	public void userClickOnTheChangePasswordButton() {
		click(factory.accountPage().changePassword);
		logger.info("User Clicked on the ChangePassowrd Button");
	}
	@Then("User Eneter Card information")
	public void userEnterCardInformation(DataTable dataa) {
	List<Map<String, String>>cardInfo = dataa.asMaps(String.class, String.class);
	sendText(factory.accountPage().cardNumberInput,cardInfo.get(0).get("Card Number"));
	sendText(factory.accountPage().nameOnCardInput,cardInfo.get(0).get("Name on Card"));
	sendText(factory.accountPage().expirationMonthInput,cardInfo.get(0).get("Expiration Date Month"));
	sendText(factory.accountPage().expirationYearInput,cardInfo.get(0).get("Expiration Date Year"));
	sendText(factory.accountPage().securityCodeInput,cardInfo.get(0).get("Security Code"));
	slowDown();
		
	}
	
	@Then ("User click on the Add your Card Buttn")
	public void userClickOnTheAddYourCardButtn() {
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("User Clicked on The Add your Buttton ");
	}

}
