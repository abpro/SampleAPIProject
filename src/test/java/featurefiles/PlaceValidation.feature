Feature: Validating Place API

@AddPlace
Scenario Outline: Verify that Add place functionality is working

Given Add Place Payload
When User calls "AddPlaceAPI" with POST http request
Then API call is success with status code 200
And "status" in response body is "OK"
And "scope" in response body is "APP"
And print this "<name>"

Examples: 
    |name|
	|Falana|
	#|Dhimaka|

@DeletePlace
Scenario: Verify the delete place API
When User asks to print "This"
Then say wow
And "scope" in response body is "APP"
And print this "accha"
