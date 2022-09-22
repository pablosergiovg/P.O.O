public class Producto implements Comprable{

    private String nombre;
    private Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Double calcularPrecio() {
        System.out.println("soy una " + nombre + " y mi precio es de " + precio);
        return precio;
    }
}
