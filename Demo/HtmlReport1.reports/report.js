$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Cucumber/Login1.feature");
formatter.feature({
  "name": "Login1",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "ChangePassword",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tags2"
    }
  ]
});
formatter.step({
  "name": "User enter the username \"Aishwarya\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_enter_the_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter old password \"Password\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_enter_old_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter new password \"newPassword\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enter_new_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User confirm the new password \"newpassword\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_confirm_the_new_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Password changed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.password_changed()"
});
formatter.result({
  "status": "passed"
});
});