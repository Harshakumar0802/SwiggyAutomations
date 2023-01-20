Feature: Search functionality

  Background: Given User is on Search Page

  @Search 
  Scenario: Check if User is able to get suggestions for Restaurant names in Search field
    Given User is on Search Page
    When User enters Restaurant name
    Then User should get appropriate suggestions

  @Search 
  Scenario: Check if User is able to click on suggestions by Restaurant name
    Given User is on Search Page
    When User enters Valid restaurant name
    And User is able to click on suggestions displayed
    Then User should be redirected to appropriate Restaurant result page


    
    