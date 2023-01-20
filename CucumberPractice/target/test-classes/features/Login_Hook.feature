Feature: Login To Application
Scenario: Check if the User is able to login to the application
Given The user is on login page of Test App
When The user enters the cred  "Test" and "Test"
When Clicks on login button
Then Check if the user is able to login sucessfully

Scenario: Check if the page title is correct for Login page
Given The user is on login page
Then Check if the page title is "The Internet"


