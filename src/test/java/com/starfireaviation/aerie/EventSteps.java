package com.starfireaviation.aerie;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class EventSteps extends BaseSteps {

    /**
     * Event service.
     */
    private String EVENT = "events";

    @Given("^An event exists$")
    public void anEventExists() {
        throw new PendingException();
    }

    @Given("^More than (.*) events exist$")
    public void moreThanXEventsExist() {
        throw new PendingException();
    }

    @When("^I request to create an event$")
    public void iRequestToCreateAnEvent() {
        final Response response =
                testContext.getRequest().when().post(getAerieBaseUrl() + EVENT);
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I request an event$")
    public void iRequestAnEvent() {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + EVENT + "/1");
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I request all events$")
    public void iRequestAllEvents() {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + EVENT);
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I request to update an event$")
    public void iRequestToUpdateAnEvent() {
        final Response response =
                testContext.getRequest().when().put(getAerieBaseUrl() + EVENT + "/1");
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I request to delete an event$")
    public void iRequestToDeleteAnEvent() {
        final Response response =
                testContext.getRequest().when().delete(getAerieBaseUrl() + EVENT + "/1");
        testContext.setResponse(response);
        //System.out.println("response: " + response.prettyPrint());
    }

    @Then("^An event is created$")
    public void anEventIsCreated() {
        throw new PendingException();
    }

    @Then("^I should receive the event details$")
    public void iShouldReceiveTheEventDetails() {
        throw new PendingException();
    }

    @Then("^I should receive a list of events$")
    public void iShouldReceiveAListOfEvents() {
        throw new PendingException();
    }

    @Then("^The event should be updated$")
    public void theEventShouldBeUpdated() {
        throw new PendingException();
    }

    @Then("^The event should be deleted")
    public void theEventShouldBeDeleted() {
        throw new PendingException();
    }

}
