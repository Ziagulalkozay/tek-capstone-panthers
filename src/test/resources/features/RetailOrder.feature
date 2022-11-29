Feature: Retail Order Page

 @order
  Scenario: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Zia33@gmail.com' and password 'Afghanistan@158'
    And User click on login button
    Then User should be logged in into Account
    And User search for an item 'Bike Phone Holder'
   # Then User click on Search icon
   # Then Item should be present
   # Then User click on icon
   # And User click on Quantity and select '1'
   # Then User click on add to cart button
    #Then User click on Cart icon for avalibility of item in the Shoping Cart
    
    
