package steps;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import pageObjects.GooglePages;
import utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GoogleBusquedaStep {

    GoogleLoginStep loginStep = new GoogleLoginStep();//crea una instancia que permite usar metodos de la clase llamada

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();

    @Step
    public void buscar(){
        try {
            leerExcel = Excel.leerXlsx("GoogleSemilleroBusqueda.xlsx","Terminos Busq");
        }catch (IOException e){
            e.printStackTrace();
        }
        for (int i = 0; i < leerExcel.size(); i++){
            loginStep.escribirMasEnter(GooglePages.getTxtBarraBusqueda(),leerExcel.get(i).get("Busquedas"));
            loginStep.limpiarTxt(GooglePages.getTxtBarraBusqueda());
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    //validacion de texto
    private String obtenerTexto(By elemento){
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }

    public void validar(By elemento, String texto){
        assertEquals(obtenerTexto(elemento),texto);
    }

}
