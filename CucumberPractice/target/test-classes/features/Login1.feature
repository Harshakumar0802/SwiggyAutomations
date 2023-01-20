Feature: Login with Different scenarios

Scenario Outline: Login with Valid and Invalid Credentials

Given User is on the Login Page
When User enters username as <userid> and password as <password>
Then user should be able to see the appropriate message <message>

Examples:
|userid  |password  |message|
|        |SuperSecretPassword!|Your username is invalid!|
|tomsmith|test |Your password is invalid!|
|        |         |Your username is invalid!|

Scenario: Login with Valid Credentials
Given User is on the Login Page
When User enters username as <userid> and password as <password>
Then User should be able to see valid message <message>

Examples:
|userid  |password  |message|
|tomsmith|SuperSecretPassword!|You logged into a secure area!|  



