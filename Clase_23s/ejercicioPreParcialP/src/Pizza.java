public abstract class Pizza {

    private String nombre;
    private String descripcion;

    public Pizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    @Override
    public String toString() {
        return "Nombre: " + nombre + " - $" + calcularPrecio();
    }
}
