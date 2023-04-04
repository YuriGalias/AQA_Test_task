package starter.steps.definitions;

import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class SearchStepsDefinitions {

    @When("he calls endpoint {string}")
    public void heCallsEndpoint(String endpoint) {
        SerenityRest.given()
                .get(endpoint);
    }
}