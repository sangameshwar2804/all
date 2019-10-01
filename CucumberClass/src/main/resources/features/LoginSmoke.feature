Feature: login
@smoke
Scenario: login with valid credentials

Given : when user goes to login page
When :user enters username and password, clicks on submit button
Then :user sshould redirect to login page
