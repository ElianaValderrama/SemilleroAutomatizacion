package io.swagger.petstore.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.petstore.steps.PetpetsSteps;
import net.thucydides.core.annotations.Steps;

public class PetStepDefinition {

    @Steps
    PetpetsSteps petpetsSteps = new PetpetsSteps();

    @When("^creo y consulto un Pet$")
    public void creoYConsultoUnPet() {
        petpetsSteps.crearPet();
        petpetsSteps.leerPet();
        petpetsSteps.eliminarPet();
    }

    @Then("^luego la elimino el Pet$")
    public void luegoLaEliminoElPet() {

    }
}
