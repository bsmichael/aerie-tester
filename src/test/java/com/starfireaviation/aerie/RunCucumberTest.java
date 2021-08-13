package com.starfireaviation.aerie;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "not @disabled", plugin = {"pretty"})
public class RunCucumberTest {

}
