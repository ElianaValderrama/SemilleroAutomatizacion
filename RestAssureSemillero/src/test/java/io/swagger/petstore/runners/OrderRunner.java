package io.swagger.petstore.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
      features = "src/test/resources/features/order.feature",
        glue =  "io.swagger.petstore.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)

public class OrderRunner {
}
