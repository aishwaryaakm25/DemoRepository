
Feature: Create Account

  @demo1
  Scenario: Create Account
    Given User enter the name1
    When User enter the password 
    When I enter my data
     | User_Name  | Password | status  |
     | name1      |     5    | success |
     | name2      |     7    | Fail    |
     
   Then Verify the account
    
     
