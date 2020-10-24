package com.starfireaviation.aerie;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class LessonSteps extends BaseSteps {

    /**
     * Lesson service.
     */
    private String LESSON = "lessons";

    @Given("^A lesson exists$")
    public void aLessonExists() {
        throw new PendingException();
    }

    @Given("^More than (.*) lessons exist$")
    public void moreThanXLessonsExist() {
        throw new PendingException();
    }

    @When("^I request to create a lesson$")
    public void iRequestToCreateALesson() {
        final Response response =
                testContext.getRequest().when().post(getAerieBaseUrl() + LESSON);
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I request a lesson$")
    public void iRequestALesson() {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + LESSON + "/1");
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I request all lessons$")
    public void iRequestAllLessons() {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + LESSON);
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I request all attended lessons for user (.*)$")
    public void iRequestAllAttendedLessonsForUser(String username) {
        throw new PendingException();
    }

    @When("^I request to update a lesson$")
    public void iRequestToUpdateALesson() {
        final Response response =
                testContext.getRequest().when().put(getAerieBaseUrl() + LESSON + "/1");
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I request to delete a lesson$")
    public void iRequestToDeleteALesson() {
        final Response response =
                testContext.getRequest().when().delete(getAerieBaseUrl() + LESSON + "/1");
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @Then("^A lesson is created$")
    public void aLessonIsCreated() {
        throw new PendingException();
    }

    @Then("^I should receive the lesson details$")
    public void iShouldReceiveTheLessonDetails() {
        throw new PendingException();
    }

    @Then("^I should receive a list of lessons$")
    public void iShouldReceiveAListOfLessons() {
        throw new PendingException();
    }

    @Then("^The lesson should be updated$")
    public void theLessonShouldBeUpdated() {
        throw new PendingException();
    }

    @Then("^The lesson should be deleted")
    public void theLessonShouldBeDeleted() {
        throw new PendingException();
    }

}
