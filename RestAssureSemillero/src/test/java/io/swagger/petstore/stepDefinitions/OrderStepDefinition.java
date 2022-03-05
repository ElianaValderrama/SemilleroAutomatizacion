package io.swagger.petstore.stepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.swagger.petstore.steps.PetstoreSteps;
import net.thucydides.core.annotations.Steps;

public class OrderStepDefinition {
    @Steps
    PetstoreSteps petstoreSteps = new PetstoreSteps();
    /*
    no es necesario el given porque servicios no requiere levantar navegador
     */

    @When("^creo y consulto una orden$")
    public void creoYConsultoUnaOrden() {
        /*petstoreSteps.crearOrden();
        petstoreSteps.consultarOrden();
        petstoreSteps.eliminarOrden();*/
        petstoreSteps.crearOrden();
        petstoreSteps.consultarOrden();
       /* petstoreSteps.crearOrden();
        petstoreSteps.consultarOrden();
        petstoreSteps.eliminarOrden();
        petstoreSteps.consultarOrden();*/
    }

    @Then("^luego la elimino$")
    public void luegoLaElimino() {

    }

}
