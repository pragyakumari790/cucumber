Feature: Login

Scenario: Successful Login with Valid Credentials
Given User Launch Chrome browser
When user opens url= "https://admin-demo.nopcommerce.com/login" 
And User enters Email as "admin@yourstore.com" and Password  as "admin"
And Click on Login
Then Page Title should be"Dashboard/ nopCommerce adminstrartion"
When User click on Logout link
Then Page Title Should be "Your store. Login"
And close browser