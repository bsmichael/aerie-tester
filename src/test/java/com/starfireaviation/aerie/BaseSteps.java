package com.starfireaviation.aerie;

/**
 * Base class for Cucumber test implementation classes.
 */
public class BaseSteps {

    /**
     * Aerie Base URL.
     */
    protected String AERIE_BASE_URL = "https://aerie.starfireaviation.com/";

    /**
     * TestContext.
     */
    protected TestContext testContext = TestContext.getInstance();

}
