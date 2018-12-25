Feature: Gmail login page
Scenario: login to application

#Without Examples keyword - Data driven approach
Given user already in login page
When title of login page is freeCRM
When user enter "gokarthik25@gmail.com" and "XeroX!2025"
Then user click the login button

