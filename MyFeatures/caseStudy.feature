Feature: Case Study Scenarios

  Background: website is launched and running on browser
    Given Browser is opened and TestMe Website is running

  @CaseStudy1
  Scenario Outline: Registraion on TestMe App
    Given user clicks on signup button on homepage
    Then user enters desired username "<usname>"
    And user enters his/her first name "<fname>"
    And last name "<lname>"
    Then user fills the required fields
    And user clicks on Register button

    Examples: 
      | usname | fname | lname   |
      | Alex12 | Alex  | firangi |

  #| Anagha12 | Anagha | Gunjal       |
  #| Niki12   | Nikita | Ichalkaranje |
  @CaseStudy2
  Scenario Outline: Signin on TestMe App
    Given user clicks on signin button on homepage
    Then user enters his/her username "<luname>"
    And user enters valid password "<lpass>"
    Then user clicks on Login button

    Examples: 
      | luname | lpass   |
      #| Anagha12 | rohan12 |
      #| Niki12   | rohan12 |
      | Alex12 | rohan12 |

  @CaseStudy3
  Scenario: Searching a item on TestMe App
    Given User has already logged in
    Then user searches for desired item on search bar

  @CaseStudy4
  Scenario: Trying to proceed to payment page without adding product to cart
    Given User has already logged in and has serached the desired product
    Then user tries to proceed to payment page without adding product to cart
