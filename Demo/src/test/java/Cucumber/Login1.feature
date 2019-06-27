
Feature: Login1
 @tags1
  Scenario: Login1_scenario
    Given User enter the username "Aishwarya"
    When User enter password "Password"
    And click on login
    Then Home page is displayed
    
 @tags2
  Scenario: ChangePassword
    Given User enter the username "Aishwarya"
    Given User enter old password "Password"
    When User enter new password "newPassword"
    And User confirm the new password "newpassword"
    Then Password changed
    
   @tags3  
  Scenario: Logout
    Given User click on logout button
    And Click again on dialog box displayed
    Then Home Page will be displayed
    
   
    
 



 
