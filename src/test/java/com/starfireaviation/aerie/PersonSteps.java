package com.starfireaviation.aerie;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class PersonSteps extends BaseSteps {

    /**
     * Person service.
     */
    private String PERSON = "person";

    @Given("^I want my username to be (.*)$")
    public void iWantMyUsernameToBe(String username) {
        throw new PendingException();
    }

    @When("^I request to create a user$")
    public void iRequestToCreateAUser() {
        final Response response =
                testContext.getRequest().when().post(getAerieBaseUrl() + PERSON);
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request information for the (.*) user$")
    public void iRequestInformationForAUser(String username) {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + PERSON + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request to update the user information for (.*)$")
    public void iRequestToUpdateUserInformation(String username) {
        final Response response =
                testContext.getRequest().when().put(getAerieBaseUrl() + PERSON + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request to delete the user information for (.*)$")
    public void iRequestToDeleteUserInformation(String username) {
        final Response response =
                testContext.getRequest().when().delete(getAerieBaseUrl() + PERSON + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
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
