package com.way2automation.http.steps;

import com.way2automation.http.pages.AddCustomerPage;
import com.way2automation.http.pages.BankManagerLoginPage;
import com.way2automation.http.pages.OpenAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankManagerSteps {
    @Given("I am  on Bank Manager Login tab")
    public void iAmOnBankManagerLoginTab() {
        new BankManagerLoginPage().clickManagerLogin();
    }

    @When("I click on {string} Tab")
    public void iClickOnTab(String arg0) {
        new AddCustomerPage().clickOnAddCustomer();

    }

    @And("I enter FirstName")
    public void iEnterFirstName() {
        new AddCustomerPage().addFirstName("anjan");
    }

    @And("I enter Last Name")
    public void iEnterLastName() {
        new AddCustomerPage().setAddLastName("patel");
    }

    @And("I enter Postcode")
    public void iEnterPostcode() {
        new AddCustomerPage().enterPostCode("Tw1 3qd");
    }

    @And("I click on {string} Button")
    public void iClickOnButton(String arg0) {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @And("popup display")
    public void popupDisplay() {
        new AddCustomerPage().popupDisplay();
    }

    @Then("I verify message {string}")
    public void iVerifyMessage(String arg0) {
        new AddCustomerPage().verifyMessageInPopupWindow();
    }

    @And("I click on ok button on popup.")
    public void iClickOnOkButtonOnPopup() {
        new AddCustomerPage().clickOnOkButtInPopup();
    }

    @When("I click on Open Account Tab")
    public void iClickOnOpenAccountTab() {
        new OpenAccountPage().clickOnOpenAccountTab();
    }

    @And("I search customer that created in first test")
    public void iSearchCustomerThatCreatedInFirstTest() {
        new OpenAccountPage().selectCustomerCreatedFromDropDownList();
    }

    @And("I search currency {string}")
    public void iSearchCurrency(String arg0) {
        new OpenAccountPage().selectCurrencyFromDropDownList();
    }

    @And("I click on process button")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }


}
