Feature: Retail Home Page

  Background: 
    Given User is on retail website

  Scenario: Verify shop by Department sidebar
    When User click on All section
    Then Below options are present in Shop Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  Scenario Outline: Verify department sidebar options
    When User click on All section
    And User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department    | optionOne                      | optionTwo                |
      | 'Electronics' | TV & Video                     | Video Games              |
      | 'Computers'   | Accessories                    | Networking               |
      | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
      | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
      | 'Automotive'  | Automative Parts & Accessories | MotorCycle & Powersports |

  Scenario: Verify User can add an item to cart
    When User click on Sign in option
    And User enter email 'Zia33@gmail.com' and password 'Afghanistan@158'
    And User click on login button
    Then User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    Then User click on item
    Then User select quantity '2'
    And Userclick add to Cart button
    Then the cart icon quantity should change to '2'

  
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'Zia33@gmail.com' and password 'Afghanistan@158'
    And User click on login button
    Then User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    Then User click on item
    Then User select quantity '2'
    And Userclick add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information in shipping Page
      | country       | fullName | phoneNumber | streetAddress | Apartment | city | state  | zipCode |
      | United States | Tek      |  2121232432 | burk          |        33 | Burk | Oregon |   23231 |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information in shiping section
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 0987654321234599 | TEK        |              12 |           2023 |          123 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed in Cartpage 'Order Placed Successfully'


@exam
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    When User click on Sign in option
    And User enter email 'Zia33@gmail.com' and password 'Afghanistan@158'
    And User click on login button
    Then User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    Then User click on item imag
    Then User select quantity '5'
    And Userclick add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed in Cartpage 'Order Placed Successfully'
