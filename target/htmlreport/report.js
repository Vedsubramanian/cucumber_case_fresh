$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/skeleton/signup.feature");
formatter.feature({
  "name": "To register in the TestMe application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To sign up using valid details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opens the test me app",
  "keyword": "Given "
});
formatter.match({
  "location": "Register.user_opens_the_test_me_app()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat skeleton.Register.user_opens_the_test_me_app(Register.java:17)\r\n\tat ✽.user opens the test me app(src/test/resources/skeleton/signup.feature:3)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enters UserName as \"Vedhapriya\"",
  "keyword": "When "
});
formatter.match({
  "location": "Register.user_enters_UserName_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "FirstName as \"Vedha\"",
  "keyword": "And "
});
formatter.match({
  "location": "Register.firstname_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "LastName as \"Subramanian\"",
  "keyword": "And "
});
formatter.match({
  "location": "Register.lastname_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Password as \"Vedha123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Register.password_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Confirmpassword as \"Vedha123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Register.confirmpassword_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Gender as \"Female\"",
  "keyword": "And "
});
formatter.match({
  "location": "Register.gender_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Email as \"vedha@rediffmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Register.email_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Mobilenumber as \"9999999999\"",
  "keyword": "And "
});
formatter.match({
  "location": "Register.mobilenumber_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "DOB as \"07/22/1997\"",
  "keyword": "And "
});
formatter.match({
  "location": "Register.dob_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Address as \"bbbcccdddddd\"",
  "keyword": "And "
});
formatter.match({
  "location": "Register.address_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Securityquestion as \"What is your Birth Place\"",
  "keyword": "And "
});
formatter.match({
  "location": "Register.securityquestion_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "answer as \"Mysore\"",
  "keyword": "And "
});
formatter.match({
  "location": "Register.answer_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click Register button",
  "keyword": "And "
});
formatter.match({
  "location": "Register.click_Register_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify registeration success",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.verify_registeration_success()"
});
formatter.result({
  "status": "skipped"
});
});