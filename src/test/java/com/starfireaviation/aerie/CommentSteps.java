package com.starfireaviation.aerie;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class CommentSteps extends BaseSteps {

    /**
     * Comment service.
     */
    private String COMMENT = "comments";

    @Given("^A comment exists$")
    public void aCommentExists() {
        throw new PendingException();
    }

    @Given("^More than (.*) comments exist$")
    public void moreThanXCommentsExist() {
        throw new PendingException();
    }

    @Given("^A comment I created exists$")
    public void aCommentICreatedExists() {
        throw new PendingException();
    }

    @When("^I request to create a comment$")
    public void iRequestToCreateAComment() {
        final Response response =
                testContext.getRequest().when().post(getAerieBaseUrl() + COMMENT);
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I request a comment$")
    public void iRequestAComment() {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + COMMENT + "/1");
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I request all comments$")
    public void iRequestAllComments() {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + COMMENT);
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I request all comments for user (.*)$")
    public void iRequestAllCommentsForUser(String username) {
        throw new PendingException();
    }

    @When("^I request to update a comment$")
    public void iRequestToUpdateAComment() {
        final Response response =
                testContext.getRequest().when().put(getAerieBaseUrl() + COMMENT + "/1");
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I request to delete a comment$")
    public void iRequestToDeleteAComment() {
        final Response response =
                testContext.getRequest().when().delete(getAerieBaseUrl() + COMMENT + "/1");
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @Then("^A comment is created$")
    public void aCommentIsCreated() {
        throw new PendingException();
    }

    @Then("^I should receive the comment details$")
    public void iShouldReceiveTheCommentDetails() {
        throw new PendingException();
    }

    @Then("^I should receive a list of comments$")
    public void iShouldReceiveAListOfComments() {
        throw new PendingException();
    }

    @Then("^The comment should be updated$")
    public void theCommentShouldBeUpdated() {
        throw new PendingException();
    }

    @Then("^The comment should be deleted")
    public void theCommentShouldBeDeleted() {
        throw new PendingException();
    }

}
