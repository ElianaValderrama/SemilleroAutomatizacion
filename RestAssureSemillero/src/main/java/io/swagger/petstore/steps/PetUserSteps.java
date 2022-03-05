package io.swagger.petstore.steps;

import io.swagger.petstore.models.DataInyection;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PetUserSteps {
    DataInyection dataInyection = new DataInyection();

    @Step
    public void crearUser(){
        SerenityRest.given().baseUri(dataInyection.getUrlUserPost()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyUserPost()).post();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void leerUser(){
        SerenityRest.given().baseUri(dataInyection.getUrlUserGetDel()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyUserGet()).get();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void eliminarUser(){
        SerenityRest.given().baseUri(dataInyection.getUrlUserGetDel()).contentType(dataInyection.getHeaders()).delete();
        System.out.println(SerenityRest.lastResponse().asString());
    }
}
