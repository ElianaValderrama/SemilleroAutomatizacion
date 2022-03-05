package io.swagger.petstore.steps;

import io.swagger.petstore.models.DataInyection;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PetstoreSteps {
    DataInyection dataInyection = new DataInyection();

    @Step
    public void crearOrden(){
        SerenityRest.given().baseUri(dataInyection.getUrlOrderPost()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyOrder()).post();
        System.out.println(SerenityRest.lastResponse().asString());
    }
    @Step
    public void consultarOrden(){
        SerenityRest.given().baseUri(dataInyection.getUrlOrderGet()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyUserGet()).get();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void eliminarOrden(){
        SerenityRest.given().baseUri(dataInyection.getUrlOrderGet()).contentType(dataInyection.getHeaders()).delete();
        System.out.println(SerenityRest.lastResponse().asString());
    }
}
