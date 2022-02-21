package pageObjects;

import org.openqa.selenium.By;

public class DafitiPages {

    private static By txtBusqueda = By.xpath("//input[@id='searchInput']");
    private static By imgVestido = By.xpath("//a[@title=\"Vestido Corto Para Mujer Verde Botella Rutta Rutta\" and @href=\"https://www.dafiti.com.co/Vestido-Corto-Para-Mujer-Verde-Botella-Rutta-1812950.html\"]");
    private static By btnMenuMujer = By.xpath("//a[@href='https://www.dafiti.com.co/femenino/' and @class='segment nav-superior']");
    //private static By btnRopaNina = By.xpath("//a[@href='https://www.dafiti.com.co/femenino/' and @class='segment nav-superior']");
    //private static By btnRopaNina = By.xpath("//h3[text()='VESTUARIO PARA NIÑAS']");
    private static By btnProductoMenu = By.xpath("//img[@class='img_ga_view' and @data-name='7414--COF4D_sandaliasdesde$49,900.00']");
    private static By btnSubProducto = By.xpath("//*[contains(@id,':PR349SH06GCBCO')]");
    private static By btnIniDafiti = By.xpath("//img[@class='logoDft sel-dafiti-logo']");
    private static By btnHome = By.xpath("//div[@class='MHIs-text Sneakers']");
    private static By btnMarca = By.xpath("//h3[text()='NIKE']");
    private static By gtnProductoHome = By.xpath("//*[contains(@id,':NI010SH39WUICO')]");
    private static By lblProdValidar = By.xpath("//h3[contains(text(),'Tenis Lifestyle Blanco')]");
    //h3[text()="Tenis Lifestyle Blanco-Gris-Naranja Nike Air MAX VG-R"]

    public static By getTxtBusqueda() {

        return txtBusqueda;
    }

    public static By getImgVestido() {
        return imgVestido;
    }

    public static By getBtnMenuMujer() {
        return btnMenuMujer;
    }

    /*public static By getBtnRopaNina() {
        return btnRopaNina;
    }*/

    public static By getBtnProductoMenu() {
        return btnProductoMenu;
    }

    public static By getBtnSubProducto() {
        return btnSubProducto;
    }

    public static By getBtnHome() {
        return btnHome;
    }

    public static By getBtnIniDafiti() {
        return btnIniDafiti;
    }

    public static By getBtnMarca() {
        return btnMarca;
    }

    public static By getGtnProductoHome() {
        return gtnProductoHome;
    }

    public static By getLblProdValidar() {
        return lblProdValidar;
    }
}
