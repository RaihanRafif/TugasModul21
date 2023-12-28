package api.stepDef;

import io.cucumber.java.en.*;

public class api {
    @Given("the user API endpoint is available")
    public void theUserAPIEndpointIsAvailable() {
        System.out.println("1111");
    }

    @When("I send a GET request to {string}")
    public void iSendAGETRequestTo(String arg0) {
        System.out.println("22222");
    }

    @Then("the response status should be {int}")
    public void theResponseStatusShouldBe(int arg0) {
    }

    @And("the response should contain a list of users")
    public void theResponseShouldContainAListOfUsers() {
    }

    @And("I have a user with name {string} and job {string}")
    public void iHaveAUserWithNameAndJob(String arg0, String arg1) {
    }

    @When("I send a POST request to {string} with the user's details")
    public void iSendAPOSTRequestToWithTheUserSDetails(String arg0) {
    }

    @And("the response should contain a user with name {string}")
    public void theResponseShouldContainAUserWithName(String arg0) {
    }

    @But("no name is provided for the new user")
    public void noNameIsProvidedForTheNewUser() {
    }

    @When("I send a POST request to {string} with the incomplete user details")
    public void iSendAPOSTRequestToWithTheIncompleteUserDetails(String arg0) {
    }

    @Then("the response should indicate an error due to missing name")
    public void theResponseShouldIndicateAnErrorDueToMissingName() {
    }

    @And("I have a user with the maximum allowed length for the name")
    public void iHaveAUserWithTheMaximumAllowedLengthForTheName() {
    }

    @Then("the response should indicate if the user was successfully created or not")
    public void theResponseShouldIndicateIfTheUserWasSuccessfullyCreatedOrNot() {
    }

    @And("I have an existing user with id {int}")
    public void iHaveAnExistingUserWithId(int arg0) {
    }

    @When("I send a PUT request to {string} with the new name {string}")
    public void iSendAPUTRequestToWithTheNewName(String arg0, String arg1) {
    }

    @And("the response should reflect the name {string}")
    public void theResponseShouldReflectTheName(String arg0) {
    }

    @But("the user ID is invalid")
    public void theUserIDIsInvalid() {
    }

    @When("I send a PUT request to {string} to update the user")
    public void iSendAPUTRequestToToUpdateTheUser(String arg0) {
    }

    @Then("the response should indicate an error due to the invalid ID")
    public void theResponseShouldIndicateAnErrorDueToTheInvalidID() {
    }

    @And("I have a user with the maximum allowed length for the new name")
    public void iHaveAUserWithTheMaximumAllowedLengthForTheNewName() {
    }

    @When("I send a PUT request to {string} with the user's new details")
    public void iSendAPUTRequestToWithTheUserSNewDetails(String arg0) {
    }

    @Then("the response should indicate if the user was successfully updated or not")
    public void theResponseShouldIndicateIfTheUserWasSuccessfullyUpdatedOrNot() {
    }
}
