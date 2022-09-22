public abstract class UnidadDeTrabajo{

    private String nombre;
    private String descripcion;

    public UnidadDeTrabajo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularMonto();

    @Override
    public String toString() {
        return "nombre: " + nombre + " precio: " + calcularMonto();
    }
}
