package starter.steps.assets;

import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import org.hamcrest.Matchers;
import starter.dto.ProductsDTO;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchStepsAssets {

    @Then("he sees status code that equals '{int}'")
    public void heSeesStatusCodeEquals(int code) {
        restAssuredThat(response -> response.statusCode(code));
    }

    @Then("verifies that result is not empty")
    public void heVerifiesThatResultIsNotEmpty() {
        List<ProductsDTO> expectedAnswer = Arrays.asList(SerenityRest.lastResponse().as(ProductsDTO[].class));
        assertThat(expectedAnswer,
                Matchers.<Collection<ProductsDTO>>allOf(iterableWithSize(greaterThan(0))));
    }

    @Then("verifies that title contains text {string}")
    public void heVerifiesThatResponseContainsText(String expectedText) {
        ProductsDTO[] expectedAnswer = SerenityRest.lastResponse().as(ProductsDTO[].class);
        List<String> titles = Arrays.stream(expectedAnswer).map(ProductsDTO::getTitle).collect(Collectors.toList());
        boolean result = titles.stream()
                .map(String::toLowerCase)
                .anyMatch( el -> el.contains(expectedText));
        assertThat(result, is((true)));
    }

    @Then("he verifies that response contains error section")
    public void heVerifiesThatResponseContainsError() {
        assertThat(SerenityRest.lastResponse()
                .body()
                .path("detail"), hasKey("error"));
    }
}
