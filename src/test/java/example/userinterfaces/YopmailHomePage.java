package example.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YopmailHomePage extends PageObject {

    public static final Target INPUT_CORREO = Target.the("Ingreso de correo electronico").located(By.id("login"));
    public static final Target BUTTON_CORREO = Target.the("Boton de buscar correo").located(By.id("refreshbut"));
    public static final Target BUTTON_ACTIVAR_CUENTA = Target.the("Boton activar cuenta").locatedBy("//a[contains(text(),'Activar mi cuenta')]").inIFrame(By.xpath("//iframe[@id='ifmail']"));
    public static final Target BUTTON_VER_IMAGENES = Target.the("Boton ver imagenes").locatedBy("//span[contains(text(),'Ver las imágenes')]").inIFrame(By.xpath("//iframe[@id='ifmail']"));

}
