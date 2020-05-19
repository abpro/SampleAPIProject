package pojo;

import com.fasterxml.jackson.core.JsonProcessingException;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RunnerC {
	
	
	 public static void main(String[] args) throws JsonProcessingException {
		
		 GeneratePayload generatePayload =  new GeneratePayload();
		 
		RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Content-Type","application/json").setBody(generatePayload.getPayload())
				.addQueryParam("key", "qaclick123").build();
		
		ResponseSpecification responseSpecification = new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200).build();
		
		String output = RestAssured.given(requestSpecification, responseSpecification).post("/maps/api/place/add/json").thenReturn().asString();
		

		
		System.out.println(output);
		
		
	}
	
	
		
	}


