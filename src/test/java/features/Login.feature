Feature: To verify the login scenario

Scenario: Verify user is able to login leaftaps
Given Launch the browser
And load the url http://leaftaps.com/opentaps/control/main
And Maximize the browser
And set the implicit wait
And Enter the username as DemoSalesManager
And Enter the password as crmsfa
When Click on login
Then I should be able to login successfully

@many
Scenario Outline: Verify user is able to login leaftaps
Given Launch the browser
And load the url http://leaftaps.com/opentaps/control/main
And Maximize the browser
And set the implicit wait
And Enter the username as <uname>
And Enter the password as <pwd>
When Click on login
Then I should be able to login successfully
Examples:
|uname |pwd|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|