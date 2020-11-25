package com.starfireaviation.aerie;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class ReferenceMaterialSteps extends BaseSteps {

    /**
     * ReferenceMaterial service.
     */
    private String REFERENCE_MATERIAL = "referencematerials";

    @Given("^A reference material exists$")
    public void aReferenceMaterialExists() {
        throw new PendingException();
    }

    @Given("^More than (.*) reference materials exist$")
    public void moreThanXReferenceMaterialsExist() {
        throw new PendingException();
    }

    @When("^I request to create a reference material$")
    public void iRequestToCreateAReferenceMaterial() {
        final Response response =
                testContext.getRequest().when().post(getAerieBaseUrl() + REFERENCE_MATERIAL);
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request a reference material$")
    public void iRequestAReferenceMaterial() {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + REFERENCE_MATERIAL + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request all reference materials$")
    public void iRequestAllReferenceMaterials() {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + REFERENCE_MATERIAL);
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request to update a reference material$")
    public void iRequestToUpdateAReferenceMaterial() {
        final Response response =
                testContext.getRequest().when().put(getAerieBaseUrl() + REFERENCE_MATERIAL + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request to delete a reference material$")
    public void iRequestToDeleteAReferenceMaterial() {
        final Response response =
                testContext.getRequest().when().delete(getAerieBaseUrl() + REFERENCE_MATERIAL + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @Then("^A reference material is created$")
    public void aReferenceMaterialIsCreated() {
        throw new PendingException();
    }

    @Then("^I should receive the reference material details$")
    public void iShouldReceiveTheReferenceMaterialDetails() {
        throw new PendingException();
    }

    @Then("^I should receive a list of reference materials$")
    public void iShouldReceiveAListOfReferenceMaterials() {
        throw new PendingException();
    }

    @Then("^The reference material should be updated$")
    public void theReferenceMaterialShouldBeUpdated() {
        throw new PendingException();
    }

    @Then("^The reference material should be deleted")
    public void theReferenceMaterialShouldBeDeleted() {
        throw new PendingException();
    }

}
