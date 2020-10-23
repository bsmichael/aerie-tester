package com.starfireaviation.aerie;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.given;

/**
 * Common cucumber test steps.
 */
public class CommonSteps extends BaseSteps {

    @Given("^I am an unauthenticated user$")
    public void user() {
        testContext.setRequest(given());
    }

    @Then("^The request should be successful$")
    public void requestSuccessful() {
        testContext.setJson(testContext.getResponse().then().statusCode(HttpStatus.SC_OK));
    }

}
