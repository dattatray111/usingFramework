$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/FlipkartSmoke.feature");
formatter.feature({
  "line": 1,
  "name": "Flipkart Smoke Suite",
  "description": "Verify Important finctionality for flipkart",
  "id": "flipkart-smoke-suite",
  "keyword": "Feature"
});
formatter.before({
  "duration": 24323517100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login-Logout for Flipkart",
  "description": "",
  "id": "flipkart-smoke-suite;login-logout-for-flipkart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User navigate to Flipkart",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enter username",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enter password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeSuite.user_navigate_to_Flipkart()"
});
formatter.result({
  "duration": 18945372000,
  "status": "passed"
});
formatter.match({
  "location": "SmokeSuite.user_enter_username()"
});
formatter.result({
  "duration": 1316520100,
  "status": "passed"
});
formatter.match({
  "location": "SmokeSuite.user_enter_password()"
});
formatter.result({
  "duration": 616362800,
  "status": "passed"
});
formatter.match({
  "location": "SmokeSuite.click_on_sign_in_button()"
});
formatter.result({
  "duration": 379450000,
  "status": "passed"
});
formatter.match({
  "location": "SmokeSuite.user_should_be_logged_in()"
});
formatter.result({
  "duration": 9108900,
  "status": "passed"
});
formatter.after({
  "duration": 6504400600,
  "status": "passed"
});
formatter.after({
  "duration": 280787600,
  "status": "passed"
});
});