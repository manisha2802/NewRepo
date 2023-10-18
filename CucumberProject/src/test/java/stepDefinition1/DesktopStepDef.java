package stepDefinition1;

import PageObject.desktopPOM;
import io.cucumber.java.en.*;

public class DesktopStepDef extends BaseTest {

	desktopPOM deskObj;
	
	@When("user mouse over on computers")
	public void user_mouse_over_on_computers() {
		
		deskObj =new desktopPOM(driver);
		deskObj.overOnComputer();
	}
	
	@When("user clicks on Desktop")
	public void user_clicks_on_desktop() {
		deskObj.clickOnDesktop();
	}
	
	@When("User sorts the desktop by name A to Z")
	public void user_sorts_the_desktop_by_name_a_to_z() {
		deskObj.sortProduct();
	}
	
	@When("User clicks on expensive computer")
	public void user_clicks_on_expensive_computer() {
		
		deskObj.selectProduct();
	}
	
	@When("User clicks on add to compare list")
	public void user_clicks_on_add_to_compare_list() {
		deskObj.clkOnCompareList();
	}
	
	@Then("User clicks on logout button")
	public void user_clicks_on_logout_button() {
		deskObj.clkOnLogOut();
		closeBrowser();
	}


}
