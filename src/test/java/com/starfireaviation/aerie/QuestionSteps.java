package com.starfireaviation.aerie;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class QuestionSteps extends BaseSteps {

    /**
     * Question service.
     */
    private String QUESTION = "questions";

    @Given("^A question exists$")
    public void aQuestionExists() {
        throw new PendingException();
    }

    @Given("^More than (.*) questions exist$")
    public void moreThanXQuestionsExist() {
        throw new PendingException();
    }

    @When("^I request to create a question$")
    public void iRequestToCreateAQuestion() {
        final Response response =
                testContext.getRequest().when().post(getAerieBaseUrl() + QUESTION);
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request a question$")
    public void iRequestAQuestion() {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + QUESTION + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request all questions$")
    public void iRequestAllQuestions() {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + QUESTION);
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request to update a question$")
    public void iRequestToUpdateAQuestion() {
        final Response response =
                testContext.getRequest().when().put(getAerieBaseUrl() + QUESTION + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request to delete a question$")
    public void iRequestToDeleteAQuestion() {
        final Response response =
                testContext.getRequest().when().delete(getAerieBaseUrl() + QUESTION + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I answer a question$")
    public void iAnswerAQuestion() {
        throw new PendingException();
    }

    @When("^I skip a question$")
    public void iSkipAQuestion() {
        throw new PendingException();
    }

    @Then("^A question is created$")
    public void aQuestionIsCreated() {
        throw new PendingException();
    }

    @Then("^I should receive the question details$")
    public void iShouldReceiveTheQuestionDetails() {
        throw new PendingException();
    }

    @Then("^I should receive a list of questions$")
    public void iShouldReceiveAListOfQuestions() {
        throw new PendingException();
    }

    @Then("^The question should be updated$")
    public void theQuestionShouldBeUpdated() {
        throw new PendingException();
    }

    @Then("^The question should be deleted")
    public void theQuestionShouldBeDeleted() {
        throw new PendingException();
    }

}
