Feature: Login

@loginwithvalid
  Scenario Outline: Loggedin with Valid credentials
    Given  user launche goes to login page 
    When user enters "<name>" and "<password>" , clicks on submit button
    Then user redirects to dashboard page

 Examples:
 |name|password|
 |admin@yourstore.com|admin|
 |admin@yourstore.com|admin|       
 |admin@yourstore.com|admin|

@loginwithinvalid
Scenario: Login with invalid credentials
Given user goes to login page
When user enters invalid username and invalid username, clicks on submit button
Then user gets is unable to go to dashboard page

@loginwithinvalid1
Scenario: Login with vali username and invalid password
Given user goes to login page
When user enters valid user name and invalid password
Then user is unable to go dashboard page