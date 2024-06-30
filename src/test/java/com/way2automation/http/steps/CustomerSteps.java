package com.way2automation.http.steps;

import com.way2automation.http.pages.AccountPage;
import com.way2automation.http.pages.CustomerLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CustomerSteps {
    @Given("I am  on Customer Login tab")
    public void iAmOnCustomerLoginTab() {
    }

    @When("I click on customer login tab")
    public void iClickOnCustomerLoginTab() {
        new CustomerLoginPage().clickOnCustomerLogin();
    }

    @And("I search customer that i have created")
    public void iSearchCustomerThatIHaveCreated() {
        new CustomerLoginPage().searchCustomerField();
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @Then("I verify Logout tab is displayed")
    public void iVerifyLogoutTabIsDisplayed() {
        new CustomerLoginPage().verifyLogOut();
    }

    @And("I click on Logout")
    public void iClickOnLogout() {
        new CustomerLoginPage().clickOnLogOut();
    }

    @Then("I verify Your Name text displayed")
    public void iVerifyYourNameTextDisplayed() {
        new CustomerLoginPage().verifyName();
    }


    @And("I click on deposit Tab")
    public void iClickOnDepositTab() {
        new AccountPage().clickOnDepositeTab();
    }

    @And("I enter amount {int}")
    public void iEnterAmount(int arg0) {
        new AccountPage().enter100InAmountField();
    }

    @And("I click on deposit button")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositeButton();
    }

    @Then("I verify message Deposit Successful")
    public void iVerifyMessageDepositSuccessful() {
        new AccountPage().verifyDepositTransactionSuccessful();
    }

    @And("I click on Withdrawl Tab")
    public void iClickOnWithdrawlTab() {
        new AccountPage().ClickOnWithdrawTab();
    }

    @And("I enter  withdrawl Amount {int}")
    public void iEnterWithdrawlAmount(int arg0) {
        new AccountPage().enterAmountInWithdrawField();

    }


    @And("I click on Withdraw button")
    public void iClickOnWithdrawButton() {
        new AccountPage().clickOnWithdrawButton();
    }


    @Then("I verify withdrawl  message {string}")
    public void iVerifyWithdrawlMessage(String arg0) {
        new AccountPage().verifywithdrawlTransactionSuccessful();
    }
}