Feature: Place Order in passion era

Scenario Outline: ordering green tea

Given user present with welcome page
When user on the menu page
Then user click the check out option
Then user enters the customerinfo "<email>" and "<name>" and "<address>"
Then user enters the payment details "<cardtype>" and "<cardnumber>" and "<verificationcode>"
Then user place the order and quit the browser

Examples:

| email			| name   		| address		| cardtype 	| cardnumber 	| verificationcode	|
| abc@gmail.com	| Karthik  		| Chennai		| Visa 		| 12345678 		| 123				|
| abd@gmail.com	| kirithi 		| vennai		| Mastercard 		| 9897867 		| 321				|