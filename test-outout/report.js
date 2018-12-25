$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Karthikeyan/Automation/Projects/CucumberTraining/src/main/java/Feature/placeOrder.feature");
formatter.feature({
  "name": "Place Order in passion era",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "ordering green tea",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user present with welcome page",
  "keyword": "Given "
});
formatter.step({
  "name": "user on the menu page",
  "keyword": "When "
});
formatter.step({
  "name": "user click the check out option",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the customerinfo \"\u003cemail\u003e\" and \"\u003cname\u003e\" and \"\u003caddress\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the payment details \"\u003ccardtype\u003e\" and \"\u003ccardnumber\u003e\" and \"\u003cverificationcode\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user place the order and quit the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "name",
        "address",
        "cardtype",
        "cardnumber",
        "verificationcode"
      ]
    },
    {
      "cells": [
        "abc@gmail.com",
        "Karthik",
        "Chennai",
        "Visa",
        "12345678",
        "123"
      ]
    },
    {
      "cells": [
        "abd@gmail.com",
        "kirithi",
        "vennai",
        "Mastercard",
        "9897867",
        "321"
      ]
    }
  ]
});
formatter.scenario({
  "name": "ordering green tea",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user present with welcome page",
  "keyword": "Given "
});
formatter.match({
  "location": "TC_03OrderGreenTea.user_present_with_welcome_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user on the menu page",
  "keyword": "When "
});
formatter.match({
  "location": "TC_03OrderGreenTea.user_on_the_menu_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the check out option",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_03OrderGreenTea.user_click_the_check_out_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the customerinfo \"abc@gmail.com\" and \"Karthik\" and \"Chennai\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_03OrderGreenTea.user_enters_the_customerinfo_email_and_name_and_address(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the payment details \"Visa\" and \"12345678\" and \"123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_03OrderGreenTea.user_enters_the_payment_details_cardtype_and_cardnumber_and_verificationcode(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user place the order and quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_03OrderGreenTea.user_place_the_order_and_quit_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "ordering green tea",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user present with welcome page",
  "keyword": "Given "
});
formatter.match({
  "location": "TC_03OrderGreenTea.user_present_with_welcome_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user on the menu page",
  "keyword": "When "
});
formatter.match({
  "location": "TC_03OrderGreenTea.user_on_the_menu_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the check out option",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_03OrderGreenTea.user_click_the_check_out_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the customerinfo \"abd@gmail.com\" and \"kirithi\" and \"vennai\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_03OrderGreenTea.user_enters_the_customerinfo_email_and_name_and_address(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the payment details \"Mastercard\" and \"9897867\" and \"321\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_03OrderGreenTea.user_enters_the_payment_details_cardtype_and_cardnumber_and_verificationcode(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user place the order and quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_03OrderGreenTea.user_place_the_order_and_quit_the_browser()"
});
formatter.result({
  "status": "passed"
});
});