package com.starfireaviation.aerie;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;
//import static org.junit.Assert.assertEquals;

public class WeatherSteps {

    private String AERIE_BASE_URL = "https://aerie.starfireaviation.com/weather/";
    private Response response;
    private ValidatableResponse json;
    private RequestSpecification request;

    @Given("^I am an unauthenticated user$")
    public void user() {
        request = given();
    }

    @And("^I want (.*) information$")
    public void iOnlyWantSpecificInformation(String field) {
        request = request.param("data", field);
    }

    @When("^I ask for the (.*) METAR$")
    public void iAskForTheMETAR(String icao) {
        response = request.when().get(AERIE_BASE_URL + "metars/" + icao);
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I ask for the (.*) TAF$")
    public void iAskForTheTAF(String icao) {
        response = request.when().get(AERIE_BASE_URL + "tafs/" + icao);
        //System.out.println("response: " + response.prettyPrint());
    }

    @When("^I ask for the (.*) station$")
    public void iAskForTheStation(String icao) {
        response = request.when().get(AERIE_BASE_URL + "stations/" + icao);
        //System.out.println("response: " + response.prettyPrint());
    }

    @Then("^The request should be successful$")
    public void requestSuccessful() {
        json = response.then().statusCode(HttpStatus.SC_OK);
    }

    @And("^I should receive the (.*) data$")
    public void iShouldReceiveSpecificData(String field) {
        json.body(field, Matchers.notNullValue());
    }

    @And("^I should receive data for multiple stations$")
    public void iShouldReceiveDataForMultipleStations() {
        json.body("size()", Matchers.greaterThan(1));
    }
}
