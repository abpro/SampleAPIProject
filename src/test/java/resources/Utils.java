package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class Utils {

	 RequestSpecification requestSpecification;
		Properties prop;

	 
	public RequestSpecification requestSpecification() throws IOException{
		
		 PrintStream log = new PrintStream(new FileOutputStream("logg.txt"));

		
		requestSpecification = new RequestSpecBuilder().setBaseUri(getGobalValue())
				.addHeader("Content-Type","application/json")
				.addQueryParam("key", "qaclick123")
				.addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log))
				.build();
		
		return requestSpecification;
	}
	
	public String getGobalValue() throws IOException{
		prop = new Properties();

		FileInputStream fileInputStream= new FileInputStream("global.properties");
		prop.load(fileInputStream);
		return prop.getProperty("baseUrl");
	}
	
}
