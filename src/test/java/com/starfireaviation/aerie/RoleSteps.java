package com.starfireaviation.aerie;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RoleSteps extends BaseSteps {

    @When("^I request to assign the role (.*) to user (.*)$")
    public void iRequestToAssignRoleToUser(String role, String username) {
        throw new PendingException();
    }

    @When("^I request to unassign the role (.*) from user (.*)$")
    public void iRequestToUnassignRoleFromUser(String role, String username) {
        throw new PendingException();
    }

    @Then("^The role (.*) should be assigned to user (.*)$")
    public void theRoleShouldBeAssignedToUser(String role, String username) {
        throw new PendingException();
    }

    @Then("^The role (.*) should not be assigned to user (.*)$")
    public void theRoleShouldNotBeAssignedToUser(String role, String username) {
        throw new PendingException();
    }
}
