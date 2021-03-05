$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/TOSHIBA/eclipse-workspace/vishalcucumber/src/main/java/com/org/feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of page is free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters userName And password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on homePage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 12173724295,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_of_page_is_free_CRM()"
});
formatter.result({
  "duration": 77189730,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_enters_userName_And_password()"
});
formatter.result({
  "duration": 67660,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 55911,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_homePage()"
});
formatter.result({
  "duration": 78600,
  "status": "passed"
});
});