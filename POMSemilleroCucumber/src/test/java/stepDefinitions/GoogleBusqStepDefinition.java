package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pageObjects.GooglePages;
import steps.GoogleBusquedaStep;
import utils.Excel;

import java.awt.image.BufferStrategy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class GoogleBusqStepDefinition {

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();

    @Steps
    GoogleBusquedaStep busquedaStep = new GoogleBusquedaStep();

    @Given("^que me encuentro en el buscador de google$")
    public void queMeEncuentroEnElBuscadorDeGoogle() {
        SeleniumWebDriver.chromeDrive("https://www.google.com");

    }

    @When("^llamo datos de mi archivo excel$")
    public void llamoDatosDeMiArchivoExcel() {
        busquedaStep.buscar();
    }

    @Then("^hace la busqueda y me muestra resultados$")
    public void haceLaBusquedaYMeMuestraResultados() {
        //validar con texto quemado
        //busquedaStep.validar(GooglePages.getLblCopaAmerica(),"Semifinal");
        //validar texto con excel
        try {
            leerExcel = Excel.leerXlsx("GoogleSemilleroBusqueda.xlsx","Terminos Busq");
        }catch (IOException e){
            e.printStackTrace();
        }
        for (int i = 0; i < leerExcel.size(); i++){
            busquedaStep.validar(GooglePages.getLblCopaAmerica(),"Semifinal");
        }
    }
}
