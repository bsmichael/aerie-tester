package com.starfireaviation.aerie;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LessonSteps extends BaseSteps {

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
        throw new PendingException();
    }

    @When("^I request a lesson$")
    public void iRequestALesson() {
        throw new PendingException();
    }

    @When("^I request all lessons$")
    public void iRequestAllLessons() {
        throw new PendingException();
    }

    @When("^I request all attended lessons for user (.*)$")
    public void iRequestAllAttendedLessonsForUser(String username) {
        throw new PendingException();
    }

    @When("^I request to update a lesson$")
    public void iRequestToUpdateALesson() {
        throw new PendingException();
    }

    @When("^I request to delete a lesson$")
    public void iRequestToDeleteALesson() {
        throw new PendingException();
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
