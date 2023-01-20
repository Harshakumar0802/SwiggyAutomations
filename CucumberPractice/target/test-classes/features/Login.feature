#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login to Application
Scenario: Check if the User is able to login to the Application
Given The User is in Login Page
When The user enters credentials <username> and <password>
And Clicks on login
Then Check if the home page is Displayed 

Examples:
|username| password|
|tomsmith|SuperSecretPassword!|
|Kishore|Testing@123|



Scenario: Succesful Logout
When The user clicks on Logout
Then Login screenshould be display
