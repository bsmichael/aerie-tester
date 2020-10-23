package com.starfireaviation.aerie;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

/**
 * TestContext.
 */
public class TestContext {

    /**
     * TestContext instance.
     */
    private static TestContext instance = null;

    /**
     * RestAssured Response.
     */
    protected Response response = null;

    /**
     * RestAssured ValidatableResponse.
     */
    protected ValidatableResponse json = null;

    /**
     * RestAssured RequestSpecification.
     */
    protected RequestSpecification request = null;

    /**
     * Private constructor
     */
    private TestContext() {
        // private constructor
    }

    /**
     * Gets singleton instance.
     *
     * @return TestContext
     */
    public static TestContext getInstance() {
        if (instance == null) {
            instance = new TestContext();
        }
        return instance;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public ValidatableResponse getJson() {
        return json;
    }

    public void setJson(ValidatableResponse json) {
        this.json = json;
    }

    public RequestSpecification getRequest() {
        return request;
    }

    public void setRequest(RequestSpecification request) {
        this.request = request;
    }

    public void reset() {
        response = null;
        json = null;
        request = null;
    }

}
