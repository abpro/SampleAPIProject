package stepdefinitionsfornp;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.fasterxml.jackson.core.JsonProcessingException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.GeneratePayload;
import resources.APIResources;
import resources.Utils;

public class StepDefinitions extends Utils {

	 GeneratePayload generatePayload =  new GeneratePayload();
	 RequestSpecification req;
	 ResponseSpecification responseSpecification;
	 Response response;
	
	@Given("Add Place Payload")
	public void add_Place_Payload() throws IOException {
		
		 responseSpecification = new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200).build();
		 req = RestAssured.given().spec(requestSpecification()).body(generatePayload.getPayload());
	}

	@When("User calls {string} with POST http request")
	public void user_calls_with_POST_http_request(String resource) {

	//consturctor will be called with value of resource passed here
	APIResources apiResources = APIResources.valueOf(resource);
	System.out.println(apiResources.getResource());
		
	 response = req.when().post("/maps/api/place/add/json").then().spec(responseSpecification).extract().response();
		
	}

	@Then("API call is success with status code {int}")
	public void api_call_is_success_with_status_code(int int1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Asser here");
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Assert here as well");
	}
	
	@Then("print this {string}")
	public void print_this(String name) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(name);
	    System.out.println("String asserted");
	}
	
	@When("User asks to print {string}")
	public void user_asks_to_print(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("From delete");
		
	}

	@Then("say wow")
	public void say_wow() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("From delete - say wow");
		
	}

	
}
