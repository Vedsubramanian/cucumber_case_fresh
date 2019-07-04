Feature: To register in the TestMe application
Scenario: To sign up using valid details
Given user opens the test me app
When user enters UserName as "Vedhapriya" 
And FirstName as "Vedha" 
And LastName as "Subramanian"
And Password as "Vedha123" 
And Confirmpassword as "Vedha123" 
And Gender as "Female" 
And Email as "vedha@rediffmail.com" 
And Mobilenumber as "9999999999" 
And DOB as "07/22/1997" 
And Address as "bbbcccdddddd"
And Securityquestion as "What is your Birth Place"
And answer as "Mysore"
And click Register button
Then verify registeration success
