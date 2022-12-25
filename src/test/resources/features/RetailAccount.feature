Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Zia2@gmail.com' and password 'Tek@1589'
    And User click on login button
    Then User should be logged in into Account
    Then User click on Account button

  Scenario: Verify user profile into account Website
    And User update Name 'zia' and Phone '799-282-2222'
    And User click on update button
    Then User information should be updated

  Scenario: Verify User can update Password
    And User Entered below information
      | Previous Password | New Password | Confirm Password |
      | Tek@158158888     | Tek@1589     | Tek@1589         |
    Then User click on the change Password button
    Then a Massage Should be Displayed 'Password Updated Successfully'

  Scenario: Verify User can Add a payment method
    When User click on Add a payment method link
    And User fill Debit or credit card informtion
      | Card Number      | Name on Card | Expiration Date Month | Expiration Date Year | Security Code |
      | 1237567890123459 | Zia          |                    01 |                 2022 |           123 |
    And User click on the Add your Card button
    Then a message should be displayedd 'Payment Method added sucessfully'

  Scenario: Verify User can edit Debit or Credit card
    When User select card with ending '3488'
    And User click on Edit option of card selection
    And User edit information with below data
      | updatcardNumber  | updatnameOnCard | updateexpirationMonth | updateexpirationYear | UpdatesecurityCode |
      | 5522233344556677 | saba            |                    12 |                 2023 |                232 |
    And User click on Update Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  Scenario: Verify User can Remove Debit or Credit card
    When User select card with ending '5432'
    And User click on remove option of selected card
    Then The Payment details should be removed
    
    @state
  Scenario: Verify User can add an Address
    And User click on Add address option
    And User fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city       | state    | zipCode |
      | United States | Zia      |  1231231234 | reynolds      | 121 | Alexandria | Virginia |   22304 |
    And User click Add your Address button
    Then a message should be sidplayed 'Address Added Successfully'

  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
