Feature: Location Functionality

  @Location 
  Scenario: Validate the url of Swiggy Page
    Given User is on Swiggy Page
    When User enters url of Swiggy
    Then User should be navigated to Swiggy page

 @Location 
  Scenario Outline: Check if the Delivery Location field is giving suggestions for valid city names
    Given User is on Swiggy Page
    When User enters Valid "<City names>" and get the list of suggestions
    Then User should be able to get suggestions for valid city names

    Examples: 
      | City names |
      | Pune       |
      | Bangalore  |

