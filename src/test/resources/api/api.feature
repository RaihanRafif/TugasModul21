Feature: User API interactions

  Scenario: Retrieve a list of users
    Given the user API endpoint is available
    When I send a GET request to "/api/users?page=2"
    Then the response status should be 200
    And the response should contain a list of users

  Scenario: Successfully create a new user
    Given the user API endpoint is available
    And I have a user with name "raihan" and job "QA"
    When I send a POST request to "/api/users" with the user's details
    Then the response status should be 201
    And the response should contain a user with name "raihan"

  Scenario: Attempt to create a user with missing name
    Given the user API endpoint is available
    But no name is provided for the new user
    When I send a POST request to "/api/users" with the incomplete user details
    Then the response should indicate an error due to missing name

  Scenario: Attempt to create a user with max length name
    Given the user API endpoint is available
    And I have a user with the maximum allowed length for the name
    When I send a POST request to "/api/users" with the user's details
    Then the response should indicate if the user was successfully created or not

  Scenario: Successfully update an existing user
    Given the user API endpoint is available
    And I have an existing user with id 2
    When I send a PUT request to "/api/users/2" with the new name "updatedUser"
    Then the response status should be 200
    And the response should reflect the name "updatedUser"

  Scenario: Attempt to update a user with an invalid ID
    Given the user API endpoint is available
    But the user ID is invalid
    When I send a PUT request to "/api/users/{invalidId}" to update the user
    Then the response should indicate an error due to the invalid ID

  Scenario: Attempt to update a user with max length name
    Given the user API endpoint is available
    And I have a user with the maximum allowed length for the new name
    When I send a PUT request to "/api/users/2" with the user's new details
    Then the response should indicate if the user was successfully updated or not
