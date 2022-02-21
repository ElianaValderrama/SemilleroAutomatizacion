package stepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import pageObjects.DafitiPages;
import steps.DafitiBusqBarraStep;
import utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class DafitiBusqStepDefinition {


    @Steps
    DafitiBusqBarraStep busqStep = new DafitiBusqBarraStep();

    @Dado("^que estoy en el buscador de dafiti$")
    public void queEstoyEnElBuscadorDeDafiti() {

        SeleniumWebDriver.chromeDrive("https://www.dafiti.com.co/");
    }


    @Cuando("^llamo datos de mi archivo excel$")
    public void llamoDatosDeMiArchivoExcel() {
        busqStep.buscarBarra();
        busqStep.darClick(DafitiPages.getImgVestido());
        busqStep.buscarMenu();
        busqStep.buscarHome();
    }

    @Entonces("^me hace la busqueda y me muestra resultados$")
    public void meHaceLaBusquedaYMeMuestraResultados() {
        busqStep.validar(DafitiPages.getLblProdValidar(),"Tenis Lifestyle Blanco-Gris-Naranja Nike Air MAX VG-R");
    }
}
