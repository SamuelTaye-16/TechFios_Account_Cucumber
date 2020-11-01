@End2End
Feature: valiadte Techfios Login Page Functionality 

Background: 
Given User is on the Techfios Login Page 


@Scenario1
Scenario: User Should be able to Login with valid Credentials (Making Variables work as Placeholders)
When User enters the username as "demo@techfios.com" 
When User enters the password as "abc123"  
And User clicks on the Login Button   
Then User should be able to land on dashBoard page 




@Scenario2
Scenario: User Should be able to Login with invalid Credentials (Making Variables work as Placeholders)
When User enters the username as "demo@techfios.com" 
When User enters the password as "abc124" 
Then User should be able to land on dashBoard page 



@Scenario3
Scenario Outline: User should be able to login with valid credentials (Making Variables work as Placeholders)    
 When User enters the "<userName>" and "<password>"    
 Then User should be able to land on dashBoard page 
 Examples:
 |userName|password|
 |demo@techfios.com|abc123|
 |demo2@techfios.com|abc124|


