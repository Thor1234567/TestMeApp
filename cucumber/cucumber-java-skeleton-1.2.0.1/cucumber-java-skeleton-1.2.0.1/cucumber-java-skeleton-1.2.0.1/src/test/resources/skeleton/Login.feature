Feature: Login feature
Scenario: Valid user
Given open the brower and enter the url of testme application
When user enters Lalitha as username
And user enters Password123 as password
And clicks on Login button
Then login should be successful