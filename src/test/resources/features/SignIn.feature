Feature: Sign In Feature

@signIn
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Zia33@gmail.com' and password 'Afghanistan@158'
    And User click on login button
    Then User should be logged in into Account

    @SignUpTest
     Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email                   | password  | confirmPassword |
      | pantherszia | panthersxy158@tekschool.us | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page	
    
    
     