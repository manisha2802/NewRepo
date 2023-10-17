
Feature: Login to Demo WebShop Application

  @login
  Scenario: Login to Demo WebShop Application
    Given I navigate to "https://demowebshop.tricentis.com/"
    When I click on login link
    And I enter email Id "msk201@gmail.com"
    And I enter password "Test@2023"
    And I click on login button
    Then I should be able to login successfully
    

 
