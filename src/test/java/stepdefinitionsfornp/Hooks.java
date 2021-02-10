package stepdefinitionsfornp;

import io.cucumber.java.Before;

//used for before and after testscenario run
public class Hooks {
	
	@Before("@AddPlace")
	public void beforeScenario(){

		StepDefinitions sp = new StepDefinitions();
		sp.print_this("Before Delete");
	
	}

}
