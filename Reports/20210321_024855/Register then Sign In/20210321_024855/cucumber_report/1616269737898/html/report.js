$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/mega.nugraha03/Katalon Studio/Assignment Test - Jakarta Web Solutions/Include/features/Sign Up.feature");
formatter.feature({
  "name": "Sign Up",
  "description": "  I want to register myself on the web using my email address",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "REGISTER ON WEB USING GIVEN NAME",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I want to open website URL",
  "keyword": "Given "
});
formatter.step({
  "name": "I fill my email address with my \u003cname\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "I click create an account button",
  "keyword": "And "
});
formatter.step({
  "name": "I fill first \u003cname\u003e and last name",
  "keyword": "And "
});
formatter.step({
  "name": "I want to verify my email is correct",
  "keyword": "And "
});
formatter.step({
  "name": "I want to set my password",
  "keyword": "And "
});
formatter.step({
  "name": "I want to set my birthdate",
  "keyword": "And "
});
formatter.step({
  "name": "I want to receive special offer from partner",
  "keyword": "And "
});
formatter.step({
  "name": "I want to set \u003cname\u003e as name in Address section",
  "keyword": "Then "
});
formatter.step({
  "name": "I want to fill address info",
  "keyword": "And "
});
formatter.step({
  "name": "I want to set my mobile",
  "keyword": "And "
});
formatter.step({
  "name": "I click on register",
  "keyword": "Then "
});
formatter.step({
  "name": "I want to verify my registration or login success",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name"
      ]
    },
    {
      "cells": [
        "Peter"
      ]
    }
  ]
});
formatter.scenario({
  "name": "REGISTER ON WEB USING GIVEN NAME",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I want to open website URL",
  "keyword": "Given "
});
formatter.match({
  "location": "AuthenticationPage.openWeb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill my email address with my Peter",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPage.email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click create an account button",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPage.createAcc()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill first Peter and last name",
  "keyword": "And "
});
formatter.match({
  "location": "accCreation.createPage_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify my email is correct",
  "keyword": "And "
});
formatter.match({
  "location": "accCreation.checkEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to set my password",
  "keyword": "And "
});
formatter.match({
  "location": "accCreation.setPwd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to set my birthdate",
  "keyword": "And "
});
formatter.match({
  "location": "accCreation.birth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to receive special offer from partner",
  "keyword": "And "
});
formatter.match({
  "location": "accCreation.checkOffer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to set Peter as name in Address section",
  "keyword": "Then "
});
formatter.match({
  "location": "accCreation.verifName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to fill address info",
  "keyword": "And "
});
formatter.match({
  "location": "accCreation.addressInfo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to set my mobile",
  "keyword": "And "
});
formatter.match({
  "location": "accCreation.mobilePhone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on register",
  "keyword": "Then "
});
formatter.match({
  "location": "accCreation.register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify my registration or login success",
  "keyword": "And "
});
formatter.match({
  "location": "accCreation.verifyRegister()"
});
formatter.result({
  "status": "passed"
});
});