package com.starfireaviation.aerie;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class QuizSteps extends BaseSteps {

    /**
     * Quiz service.
     */
    private String QUIZ = "quizzes";

    @Given("^A quiz exists$")
    public void aQuizExists() {
        throw new PendingException();
    }

    @Given("^More than (.*) quizzes exist$")
    public void moreThanXQuizzesExist() {
        throw new PendingException();
    }

    @When("^I request to create a quiz$")
    public void iRequestToCreateAQuiz() {
        final Response response =
                testContext.getRequest().when().post(getAerieBaseUrl() + QUIZ);
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request a quiz$")
    public void iRequestAQuiz() {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + QUIZ + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request all quizzes$")
    public void iRequestAllQuizzes() {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + QUIZ);
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request to update a quiz$")
    public void iRequestToUpdateAQuiz() {
        final Response response =
                testContext.getRequest().when().put(getAerieBaseUrl() + QUIZ + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request to delete a quiz$")
    public void iRequestToDeleteAQuiz() {
        final Response response =
                testContext.getRequest().when().delete(getAerieBaseUrl() + QUIZ + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I start a quiz$")
    public void iStartAQuiz() {
        throw new PendingException();
    }

    @When("^I stop a quiz$")
    public void iStopAQuiz() {
        throw new PendingException();
    }

    @When("^I add a question to a quiz$")
    public void iAddAQuestionToAQuiz() {
        throw new PendingException();
    }

    @When("^I remove a question from a quiz$")
    public void iRemoveAQuestionFromAQuiz() {
        throw new PendingException();
    }

    @Then("^A quiz is created$")
    public void aQuizIsCreated() {
        throw new PendingException();
    }

    @Then("^I should receive the quiz details$")
    public void iShouldReceiveTheQuizDetails() {
        throw new PendingException();
    }

    @Then("^I should receive a list of quizzes$")
    public void iShouldReceiveAListOfQuizzes() {
        throw new PendingException();
    }

    @Then("^The quiz should be updated$")
    public void theQuizShouldBeUpdated() {
        throw new PendingException();
    }

    @Then("^The quiz should be deleted")
    public void theQuizShouldBeDeleted() {
        throw new PendingException();
    }

}
