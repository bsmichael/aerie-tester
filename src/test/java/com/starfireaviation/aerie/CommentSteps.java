package com.starfireaviation.aerie;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommentSteps extends BaseSteps {

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
        throw new PendingException();
    }

    @When("^I request a comment$")
    public void iRequestAComment() {
        throw new PendingException();
    }

    @When("^I request all comments$")
    public void iRequestAllComments() {
        throw new PendingException();
    }

    @When("^I request all comments for user (.*)$")
    public void iRequestAllCommentsForUser(String username) {
        throw new PendingException();
    }

    @When("^I request to update a comment$")
    public void iRequestToUpdateAComment() {
        throw new PendingException();
    }

    @When("^I request to delete a comment$")
    public void iRequestToDeleteAComment() {
        throw new PendingException();
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
