package com.starfireaviation.aerie;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

/**
 * Weather tests.
 */
public class WeatherSteps extends BaseSteps {

    /**
     * Weather service.
     */
    private String WEATHER = "weather/";

    @And("^I want (.*) information$")
    public void iOnlyWantSpecificInformation(String field) {
        testContext.setRequest(testContext.getRequest().param("data", field));
    }

    @When("^I request the (.*) METAR$")
    public void iRequestTheMETAR(String icao) {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + WEATHER + "metars/" + icao);
        testContext.setResponse(response);
    }

    @When("^I request the (.*) TAF$")
    public void iRequestTheTAF(String icao) {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + WEATHER + "tafs/" + icao);
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @When("^I request the (.*) station$")
    public void iRequestTheStation(String icao) {
        final Response response =
                testContext.getRequest().when().get(getAerieBaseUrl() + WEATHER + "stations/" + icao);
        testContext.setResponse(response);
        super.printResponse(response);
    }

    @And("^I should receive the (.*) data$")
    public void iShouldReceiveSpecificData(String field) {
        testContext.getJson().body(field, Matchers.notNullValue());
    }

    @And("^I should receive data for multiple stations$")
    public void iShouldReceiveDataForMultipleStations() {
        testContext.getJson().body("size()", Matchers.greaterThan(1));
    }
}
