package stepDefinition1;

import PageObject.LoginPOM;
import io.cucumber.java.en.*;

public class LoginStepDef extends BaseTest {

	LoginPOM obj;

	@Given("I navigate to {string}")
	public void i_navigate_to(String url) {
		openBrowser();
		navigateUrl(url);
	}

	@When("I click on login link")
	public void i_click_on_login_link() {

		obj=new LoginPOM(driver);
		obj.clkOnLoginBtn();
	}

	@And("I enter email Id {string}")
	public void i_enter_email_id(String email) {
		obj.enterEmail(email);
	}

	@And("I enter password {string}")
	public void i_enter_password(String pass) {
		obj.enterPass(pass);
	}

	@And("I click on login button")
	public void i_click_on_login_button() {
		obj.clkOnSubmit();
	}

	@Then("I should be able to login successfully")
	public void i_should_be_able_to_login_successfully() {

		obj.validateLogout();
		
	}

}
