public class Curso extends OfertaAcademica{

    private Double horasMensuales;
    private Double duracionMeses;
    private Double precioPorHora;

    public Curso(String nombre, String descripcion, Double horasMensuales, Double duracionMeses, Double precioPorHora) {
        super(nombre, descripcion);
        this.horasMensuales = horasMensuales;
        this.duracionMeses = duracionMeses;
        this.precioPorHora = precioPorHora;
    }

    @Override
    public Double calcularPrecio() {
        return precioPorHora * horasMensuales * duracionMeses;
    }
}
