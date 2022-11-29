package tek.sdet.framework.steps;


import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory ();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebSite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle+ "is equal to "+expectedTitle );

	}
	}
	
	


