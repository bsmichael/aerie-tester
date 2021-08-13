package com.starfireaviation.aerie;

import java.io.IOException;
import java.util.Properties;
import io.restassured.response.Response;

/**
 * Base class for Cucumber test implementation classes.
 */
public class BaseSteps {

    private static final boolean PRINT = false;

    private static Properties properties = new Properties();

    /**
     * TestContext.
     */
    protected TestContext testContext = TestContext.getInstance();

    public BaseSteps() {
        try {
            properties.load(getClass().getResourceAsStream("/application.properties"));
        } catch (IOException ioe) {
            System.out.println("ERROR loading properties: " + ioe.getMessage());
        }
    }

    protected String getAerieBaseUrl() {
        return (String) properties.get("aerie.base-url");
    }

    protected void printResponse(Response response) {
        if (PRINT) {
            System.out.println("response: " + response.prettyPrint());
        }
    }
}
