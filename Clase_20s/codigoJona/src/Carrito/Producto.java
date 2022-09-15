package Carrito;

public class Producto {

    private String descripcion;
    private Double precio;

    public Producto(String descripcion, Double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

}
