
Feature: Gift Card

  @tag2
  Scenario: Gift Card
    Given I navigate to "https://demowebshop.tricentis.com/"
    When user click on login link
    And user enter email Id "msk201@gmail.com"
    And user enter password "Test@2023"
    And user click on login button
    Then user should be able to login successfully
    And User clicks on Gift cards
    And user click on physical Gift card
    And User enters recipients name "Manisha"
    And User enters message "Hello"
    Then User clicks on email a friend button
    And User enters Friend's email "msk123@gmail.com"
    Then User clicks on send email button
    Then user verifys success message

