
Feature: Login to Demo WebShop Application

  @login
  Scenario: Login to Demo WebShop Application
    Given I navigate to "https://demowebshop.tricentis.com/"
    When user click on login link
    And user enter email Id "msk201@gmail.com"
    And user enter password "Test@2023"
    And user click on login button
    Then user should be able to login successfully
    And click on electronics link
    And click on cell phones
    And click on add to cart
    Then validate the success message
    

 
