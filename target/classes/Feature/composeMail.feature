Feature: E2E_Compose a new mail

Scenario: Login to Gmail Application
Given user in the gmail login page
When user enter the username and password


Scenario: Select the Gmail App
When user select the gmail app
Then verify user in the inbox page

Scenario: composing new mail
Given user in the inbox page
When user click the compose mail button
Then new window open
Then sending a mail

