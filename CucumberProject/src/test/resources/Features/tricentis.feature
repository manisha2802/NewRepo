
Feature: Register to DemoWebshop site
 
  @register
  Scenario: Register to DemoWebshop site
    Given I navigate to "https://demowebshop.tricentis.com/"
    When I click on Register Link
    And I select gender
    And I enter FirstName "Manisha"
    And I enter LastName "K"
    And I enter email "msk20@gmail.com"
    Then I enter password "Pass@123"
    And  I enter confirmPass "Pass@123"
    And I click on Register button
    Then validate the "Your registration completed" message
    


  