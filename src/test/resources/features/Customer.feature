Feature: Customer  option working successfully
  As a user i should able to add customer and open account successfully

  Background:
    Given I am  on Customer Login tab

  @author_jagruti@smoke
  Scenario: Customer should Login And Logout Successfully
    When I click on customer login tab
    And I search customer that i have created
    And I click on login button
    Then I verify Logout tab is displayed
    And I click on Logout
    Then I verify Your Name text displayed

  @author_jagruti@sanity
  Scenario: Customer Should Deposit Money Successfully
    When I click on customer login tab
    And I search customer that i have created
    And I click on login button
    And I click on deposit Tab
    And I enter amount 100
    And I click on deposit button
    Then I verify message Deposit Successful

  @author_jagruti@regression
  Scenario: Customer Should withdraw Money SuccessfullyWhen I click on customer login tab
    And I search customer that i have created
    And I click on login button
    And I click on Withdrawl Tab
    And I enter  withdrawl Amount 50
    And I click on Withdraw button
    Then I verify withdrawl  message "Transaction Successful"