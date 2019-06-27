$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Cucumber/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enter the username",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_enter_the_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter password",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Login.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.home_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});