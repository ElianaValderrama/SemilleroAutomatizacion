package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.GooglePages;
import utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

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
}
