package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory ();
	
	@When ("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signIn);
		logger.info("User Clicked on Sign In Option");
		
	}
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField,email);
		sendText(factory.signInPage().passwordField,password );
		logger.info("The email entered" + email + "and the Password also enterd"+ password);
		
	}
	@And("User click on login button")
	public void userClickONLoginButton() {
		click(factory.signInPage().loginBttn);
		logger.info("User Clicked on the login Button");
		
	}
	
	@Then ("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().account));
		logger.info("The User logged in t Account ");
		slowDown();
	}
	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().newAccountBttn);
		logger.info("The User clicked on the Create New Account Button");
		
	}
	@And ("User fill the signUp information with below data")
	public void userFillTheSignUPInformationWithBelowData(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameInput,signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailInput,signUpData.get(0).get("email"));
		sendText(factory.signInPage().passwordInput, signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmPasswordInput,signUpData.get(0).get("confirmPassword"));
		logger.info("User Enetered the required information into sign up form");
	}
	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signupBtn2);
		logger.info("user clicked on sign up button");
		
	}
	@Then("User should be logged into account page")
		public void userShoulcBeLoggedIntoAccountPage() {
			isElementDisplayed(factory.signInPage().profileImage1);
			slowDown();
		}
	}


