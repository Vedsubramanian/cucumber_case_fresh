Feature: SignIn the application
Scenario Outline: Different users
Given User opens signIn page
When user enters username as "<username>"
And password as "<password>"
And click on signIn page
Then verify login sucess

Examples:
|username|password|
|lalitha|password123|