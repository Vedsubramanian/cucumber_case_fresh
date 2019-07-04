Feature: search a product 
Description: User searches product in the find field and selects a product
Scenario: User enters valid credentials and logs in to find prouct
Given user logs in test me app
When user enters username as "lalitha" And password as "password123" And click on login button
And user searches product as "Head" and selects headphone from suggestions And clicks Find button
Then verify search page is displayed
