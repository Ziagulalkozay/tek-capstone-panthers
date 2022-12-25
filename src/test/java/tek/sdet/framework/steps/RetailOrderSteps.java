package tek.sdet.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@Then("User click on Orders section")
	public void userClickOnOrdersSection() {
	    click(factory.OrderPage().orderLink);
	    logger.info("User Clicked on the Orders Section");
	}
	@Then("User click on first order in list")
	public void userClickOnFirstOrderInList() {
	   click(factory.OrderPage().FirstOrderItem);
	   logger.info("Usre clicked on first Orders Section");
	 slowDown();
	}
	@Then("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	    click(factory.OrderPage().cancelBtn);
	    logger.info("User Clicked on Cancel Order Button"	);
	    slowDown();
	}
	@Then("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReasonBoughtWrongItem(String reason) {
		selectByVisibleText(factory.OrderPage().reasonInput, reason);
		logger.info("User Selcted The cancelation Reason ");
	}
	@Then("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	    click(factory.OrderPage().caneclorderSubmitBtn);
	    logger.info("User Clecked on Cancel Order Button");
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled(String Massege) {
		Assert.assertEquals(Massege, factory.OrderPage().CancelledOrderMassege.getText());
		logger.info(Massege+ "is displayed");
	}
	
	@And( "User click on Return Items button")
	public void userClickOnReturnItemsbutton() {
		click(factory.OrderPage().returnBtn);
		logger.info("User clicked on the Retirn ItemsButton");
	
	     }
	     @Then("User select the Return Reason {string}")
	     public void userSelectTheReturnReasonItemDamaged(String returnReason) {
	    	 selectByVisibleText(factory.OrderPage().reasonInput, returnReason);
	    	 logger.info("User Selected the Return Reason");
			
		}
		@Then("User select the drop off service {string}")
	     public void userSelectTheDropOffServiceFedEx(String DropOff) {
			selectByVisibleText(factory.OrderPage().dropOffInput, DropOff);
			logger.info("User selected the The drop of Service");
			
	         
	     }
		@And ("User click on Return Order button")
		public void userClickOnReturnOrderbutton() {
			click(factory.OrderPage().ReturnOrderSubmitBtn);
			logger.info("User Clicked on Return Order Button");
		}
		
		@Then("a cancelation message should be displayedd {string}")
		public void aCancelationMessageShouldBeDisplayedd(String returnText) {
	         Assert.assertEquals(returnText, factory.OrderPage().returnWasSuccessfull.getText());
	         logger.info(returnText + "is Displayed ");
		
	     }
		@Then("User click on Review button")
		public void userClickOnReviewButton() {
		   click(factory.OrderPage().reviewBtn);
		   logger.info("User clicked on Revuew Button");
		}
		@Then("User write Review headline  {string} and {string}")
		public void userWriteReviewHeadlineHeadlineValueAndReviewText(String AddHeadline, String WriteText) {
			sendText(factory.OrderPage().headlineInput,AddHeadline);
			sendText(factory.OrderPage().descriptionInput,WriteText);
			logger.info(AddHeadline +"and"+WriteText+" has been Completed."); 
		    slowDown();
		}
		@Then("User click Add your Review button")
		public void userClickAddYourReviewButton() {
		    click(factory.OrderPage().reviewSubmitBtn);
		    logger.info("User clicked Revyew Button to submite review Text");
		}
		@Then("a review message should be displayed {string}")
		public void aReviewMessageShouldBeDisplayed(String expectMassege) {
			waitTillPresence(factory.OrderPage().yourReviewWasAddedSuccessfully);
			Assert.assertEquals(expectMassege, factory.OrderPage().yourReviewWasAddedSuccessfully.getText());
	         logger.info(expectMassege + "is Displayed ");
		    
		}


	
}
