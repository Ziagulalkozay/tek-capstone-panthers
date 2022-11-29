Feature: Retail Account Page

  @ProfileInfo
  Scenario: Verify user profile into account Website
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Zia2@gmail.com' and password 'Afghanistan@5437'
    And User click on login button
    Then User should be logged in into Account
    Then User click on Account button
    And User fill the account profile information with the below data
      | name | Phone Number |email|
      | Zia  | 799-222-2222 |Zia2@gmail.com|
    And User click on update button
    And User change Password and input below information
      | Previous Password | New Password     | Confirm Password |
      | Afghanistan@158   | Afghanistan@5437 | Afghanistan@5437 |
    Then User click on the changePassword button
    Then User Eneter Card information
    |Card Number|Name on Card|Expiration Date Month|Expiration Date Year|Security Code|
    |1234567890|Zia|11|2022|123|
    #Then User click on the Add your Card Buttn
