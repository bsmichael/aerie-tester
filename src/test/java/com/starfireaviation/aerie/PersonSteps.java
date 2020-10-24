package com.starfireaviation.aerie;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonSteps extends BaseSteps {

    @Given("^I want my username to be (.*)$")
    public void iWantMyUsernameToBe(String username) {
        throw new PendingException();
    }

    @When("^I request to create a user$")
    public void iRequestToCreateAUser() {
        throw new PendingException();
    }

    @When("^I request information for the (.*) user$")
    public void iRequestInformationForAUser(String username) {
        throw new PendingException();
    }

    @When("^I request to update the user information for (.*)$")
    public void iRequestToUpdateUserInformation(String username) {
        throw new PendingException();
    }

    @When("^I request to delete the user information for (.*)$")
    public void iRequestToDeleteUserInformation(String username) {
        throw new PendingException();
    }

    @Then("^A user is created$")
    public void aUserIsCreated() {
        throw new PendingException();
    }

    @Then("^I should receive my user data$")
    public void iShouldReceiveMyUserData() {
        throw new PendingException();
    }

    @Then("^The user information for (.*) should be updated$")
    public void theUserInformationShouldBeUpdated(String username) {
        throw new PendingException();
    }

    @Then("^The user information for (.*) should be deleted$")
    public void theUserInformationShouldBeDeleted(String username) {
        throw new PendingException();
    }

}
