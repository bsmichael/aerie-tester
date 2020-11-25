package com.starfireaviation.aerie;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class LessonPlanSteps extends BaseSteps {

    /**
     * LessonPlan service.
     */
    private String LESSON_PLAN = "lessonplans";

    @Given("^A lessonplan exists$")
    public void aLessonPlanExists() {
        throw new PendingException();
    }

    @Given("^More than (.*) lessonplans exist$")
    public void moreThanXLessonPlansExist() {
        throw new PendingException();
    }

    @When("^I request to create a lessonplan$")
    public void iRequestToCreateALessonPlan() {
        final Response response =
                testContext.getRequest().when().post(getAerieBaseUrl() + LESSON_PLAN);
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request a lessonplan$")
    public void iRequestALessonPlan() {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + LESSON_PLAN + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request all lessonplans$")
    public void iRequestAllLessonPlans() {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + LESSON_PLAN);
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request to update a lessonplan$")
    public void iRequestToUpdateALessonPlan() {
        final Response response =
                testContext.getRequest().when().put(getAerieBaseUrl() + LESSON_PLAN + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request to delete a lessonplan$")
    public void iRequestToDeleteALessonPlan() {
        final Response response =
                testContext.getRequest().when().delete(getAerieBaseUrl() + LESSON_PLAN + "/1");
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @Then("^A lessonplan is created$")
    public void aLessonPlanIsCreated() {
        throw new PendingException();
    }

    @Then("^I should receive the lessonplan details$")
    public void iShouldReceiveTheLessonPlanDetails() {
        throw new PendingException();
    }

    @Then("^I should receive a list of lessonplans$")
    public void iShouldReceiveAListOfLessonPlans() {
        throw new PendingException();
    }

    @Then("^The lessonplan should be updated$")
    public void theLessonPlanShouldBeUpdated() {
        throw new PendingException();
    }

    @Then("^The lessonplan should be deleted")
    public void theLessonPlanShouldBeDeleted() {
        throw new PendingException();
    }

}
