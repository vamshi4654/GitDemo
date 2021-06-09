Feature: Validation of place API

Scenario: Verify if place is being succesfully added using AddPlace APPI
Given Add Payload
When user calls AddPlaceAPI with post http request
Then the API call got success with status code
And "Status" in response body is "ok"
And "scope" in response body is "App"
