Feature: Login to application
Scenario: Login to Herok App
When User enters valid Herok UserID and Herok Password
|Userid                    |Password                         |
|test@test.com  |SuperSecretPassword!|
|test1@test.com    |Testing@123                |
Then The user has logged in to HeroK App successfully


