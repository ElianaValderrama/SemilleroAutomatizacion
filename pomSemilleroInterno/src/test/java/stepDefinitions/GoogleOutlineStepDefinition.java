package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.GoogleOutlineStep;
import steps.GoogleStep;


public class GoogleOutlineStepDefinition {
    @Steps
    GoogleOutlineStep outlineStep = new GoogleOutlineStep();
    GoogleStep step = new GoogleStep();

    @When("^quiero buscar animales(.*) y enviarlos$")
    public void quieroBuscarAnimalesOsoPardoYEnviarlos(String busqueda) {
        outlineStep.buscConGoogle(busqueda);
    }
    @Then("^hago login y los busco(.*)$")
    public void hagoLoginYLosBuscoOsoPardo() {
        SeleniumWebDriver.driver.quit();
    }


}
