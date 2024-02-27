package example.model;

public class Producto {

    private String nombre;
    private String precio;
    public Producto(String nombre, String precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getPrecio(){
        return this.precio;
    }
}
