package com.starfireaviation.aerie;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
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
    public void iAskForTheMETAR(String icao) {
        testContext.setResponse(testContext.getRequest().when().get(AERIE_BASE_URL + WEATHER + "metars/" + icao));
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I request the (.*) TAF$")
    public void iAskForTheTAF(String icao) {
        testContext.setResponse(testContext.getRequest().when().get(AERIE_BASE_URL +WEATHER + "tafs/" + icao));
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I request the (.*) station$")
    public void iAskForTheStation(String icao) {
        testContext.setResponse(testContext.getRequest().when().get(AERIE_BASE_URL +WEATHER + "stations/" + icao));
        //System.out.println("response: " + response.prettyPrint());
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
