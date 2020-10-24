package com.starfireaviation.aerie;

import java.io.IOException;
import java.util.Properties;

/**
 * Base class for Cucumber test implementation classes.
 */
public class BaseSteps {

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
}
