package stepDefinition1;

import PageObject.GiftPOM;
import io.cucumber.java.en.*;

public class GiftCard extends BaseTest{

	GiftPOM gObject;

	@Then("User clicks on Gift cards")
	public void user_clicks_on_gift_cards() {
		
		gObject=new GiftPOM(driver); 
		gObject.ClickOnGiftCardLink();
	}
	
	@Then("user click on physical Gift card")
	public void user_click_on_physical_gift_card() {
	   gObject.clickOnForthCard();
	}
	
	@Then("User enters recipients name {string}")
	public void user_enters_recipients_name(String name) {
		
		gObject.enterName(name);
	}
	
	@Then("User enters message {string}")
	public void user_enters_message(String msg) {
		gObject.enterMessage(msg);
	}
	
	@Then("User clicks on email a friend button")
	public void user_clicks_on_email_a_friend_button() {
		gObject.clickFrndEmailBtn();
	}
	
	@Then("User enters Friend's email {string}")
	public void user_enters_friend_s_email(String fEmail) {
	    
		gObject.enterEmailFrnd(fEmail);
	}
	
	@Then("User clicks on send email button")
	public void user_clicks_on_send_email_button() {
	    
		gObject.clickOnSendBtn();
	}
	
	@Then("user verifys success message")
	public void user_verifys_success_message() {
		gObject.Vmsg();
	}



}
