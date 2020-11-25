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

    /**
     * Retrieves previous step response.
     *
     * @return Response
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets step response.
     *
     * @param response Response
     */
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * Retrieves step json.
     *
     * @return ValidatableResponse
     */
    public ValidatableResponse getJson() {
        return json;
    }

    /**
     * Sets step json.
     *
     * @param json ValidatableResponse
     */
    public void setJson(ValidatableResponse json) {
        this.json = json;
    }

    /**
     * Retrieves request.
     *
     * @return RequestSpecification
     */
    public RequestSpecification getRequest() {
        return request;
    }

    /**
     * Sets request.
     *
     * @param request RequestSpecification
     */
    public void setRequest(RequestSpecification request) {
        this.request = request;
    }

    /**
     * Resets TestContext variables.
     */
    public void reset() {
        response = null;
        json = null;
        request = null;
    }

}
