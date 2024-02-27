package example.questions.carrito;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Collection;

public class ProductosCarrito {

    public static Question<Collection<String>> MostradosEnPantalla(){
        return Text.ofEach(".inventory_item_name");
    }

    public static Question<Collection<String>> PrecioEnPantalla(){
        return Text.ofEach(".item_pricebar");
    }
}
