$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/mega.nugraha03/Katalon Studio/Assignment Test - Jakarta Web Solutions/Include/features/LogIn.feature");
formatter.feature({
  "name": "LOG IN",
  "description": "  I want to log in on the web using my registered email address",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "LOG IN with registered email address after registration success",
  "description": "",
  "keyword": "Scenario"
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
  "name": "I fill my email address",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPage.emailLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill my password",
  "keyword": "And "
});
formatter.match({
  "location": "AuthenticationPage.fillPwd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to click sign in",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationPage.signIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to verify my registration or login success",
  "keyword": "Then "
});
formatter.match({
  "location": "accCreation.verifyRegister()"
});
formatter.result({
  "status": "passed"
});
});