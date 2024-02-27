package example.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompraProducto extends PageObject {

    public static final Target CARRITO_COMPRA =Target.the("Carrito de compra").locatedBy(".shopping_cart_link");


}
