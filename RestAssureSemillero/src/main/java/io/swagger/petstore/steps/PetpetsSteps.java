package io.swagger.petstore.steps;

import io.swagger.petstore.models.DataInyection;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.omg.CORBA.PUBLIC_MEMBER;

public class PetpetsSteps {
    DataInyection dataInyection = new DataInyection();

    @Step
    public void crearPet(){
        SerenityRest.given().baseUri(dataInyection.getUrlPetPost()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyPetPost()).post();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void leerPet(){
        SerenityRest.given().baseUri(dataInyection.getUrlPetGetDel()).contentType(dataInyection.getHeaders()).body(dataInyection.getBodyPetGetDel()).get();
        System.out.println(SerenityRest.lastResponse().asString());
    }

    @Step
    public void eliminarPet(){
        SerenityRest.given().baseUri(dataInyection.getUrlOrderGet()).contentType(dataInyection.getHeaders()).delete();
        System.out.println(SerenityRest.lastResponse().asString());
    }
}
