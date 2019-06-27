
Feature: outline_Demo

  @OutlineScenario  
  Scenario Outline: Demo
    Given Enter user name "<UserName>"
    When Enter user password "<Password>" 
    Then Page will be displayed

    Examples: 
   |UserName |Password |
   |ab       |pass123  |
   |abc      |pass345  |
    
