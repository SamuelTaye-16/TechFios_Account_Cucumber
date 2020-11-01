@End2End
Feature: Techfios bank and cash New Account Functionality

Background:
Given User is on the Techfios Login Page    
  
 
@NewAccount 
Scenario Outline: User should be able to login with valid credentials    
and open a new account      
When User enters the "<userName>" and "<password>"                                        
Then User clicks on bank and cash                                
Then User clicks on new account              
Then User fill up the form entering "<accountTittle>" and "<description>" and "<initialBalance>" and "<accountNumber>" and "<contactPerson>" and  "<Phone>" and "<internetBankingURL>" and clicks on submit   
Then User should be able to see validate                                      
            
  
  
Examples:  
|userName|password|accountTittle|description|initialBalance|accountNumber|contactPerson|Phone|internetBankingURL|
|demo@techfios.com|abc123|Saving Account03|NEW Account|17000|098765111111|Samuel Taye|2118967360|https://www.chase.com|