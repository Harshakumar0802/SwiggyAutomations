Feature: Login,Register and Search For Product
Background:
    Given The user is on Home Page
Scenario: Verify Login is functional
When User Enters TestUserID and TestPassword
|Test@test.com|Testing@123|
Then Check if the user has logged in successfully
Scenario: Search For a Product
When The user is on Search Page
Then Gives the Search Term as "Shrits"
And Clicks on Search Icon

