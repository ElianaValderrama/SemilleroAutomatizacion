package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import pageObjects.GooglePages;
import steps.GoogleStep;
import utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class GoogleBusqStepDefinitions {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();

    @Steps
    GoogleStep googleStep = new GoogleStep();

    @Given("^que me encuentro en el buscador de google$") //before
    public void queMeEncuentroEnElBuscadorDeGoogle() {
        SeleniumWebDriver.chromeDrive("https://www.google.com/");
    }

    @When("^llamo datos de mi archivo xlsx$") //Test
    public void llamoDatosDeMiArchivoXlsx() {
        googleStep.buscarConExcel();
    }

    @Then("^hace la busqueda y me muestra resultados$") //After
    public void haceLaBusquedaYMeMuestraResultados() {
        try {
            leerExcel = Excel.leerXlsx("GoogleSemilleroInterno.xlsx", "Hoja1");
        } catch (IOException e){
            e.printStackTrace();
        }
        for (int i = 0; i<leerExcel.size(); i++){
            googleStep.validar(GooglePages.getLblCopaAmerica(),leerExcel.get(i).get("Validar"));
        }
    }

}