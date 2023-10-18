package stepDefinition1;

import PageObject.LoginPOM;
import io.cucumber.java.en.*;

public class LoginStepDef extends BaseTest {

	LoginPOM obj;

//	@Given("I navigate to {string}")
//	public void i_navigate_to(String url) {
//		openBrowser();
//		navigateUrl(url);
//	}

	@When("user click on login link")
	public void i_click_on_login_link() {

		obj=new LoginPOM(driver);
		obj.clkOnLoginBtn();
	}

	@And("user enter email Id {string}")
	public void i_enter_email_id(String email) {
		obj.enterEmail(email);
	}

	@And("user enter password {string}")
	public void i_enter_password(String pass) {
		obj.enterPass(pass);
	}

	@And("user click on login button")
	public void i_click_on_login_button() {
		obj.clkOnSubmit();
	}

	@Then("user should be able to login successfully")
	public void i_should_be_able_to_login_successfully() {

		obj.validateLogout();
		
	}

	@Then("click on electronics link")
	public void click_on_electronics_link() {
	    
		obj.clickOnElectronics();
	}
	
	@Then("click on cell phones")
	public void click_on_cell_phones() {
	   obj.clickOnCellPhones();
	}
	
	@Then("click on add to cart")
	public void click_on_add_to_cart() {
	   obj.clickOnAddToCart();
	}
	
	@Then("validate the success message")
	public void validate_the_success_message() {
	    
		obj.validateMsg();
		closeBrowser();
	}



}
