package io.swagger.petstore.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.petstore.steps.PetUserSteps;
import net.thucydides.core.annotations.Steps;

public class UserStepDefinition {
    @Steps
    PetUserSteps petUserSteps = new PetUserSteps();

    @When("^creo y consulto un User$")
    public void creoYConsultoUnUser() {
        petUserSteps.crearUser();
        petUserSteps.leerUser();
        petUserSteps.eliminarUser();
    }

    @Then("^luego la elimino el User$")
    public void luegoLaEliminoElUser() {

    }
}
