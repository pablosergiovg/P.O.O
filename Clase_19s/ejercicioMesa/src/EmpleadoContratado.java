public class EmpleadoContratado extends Empleado {

    private Double importePorHora;
    private Double retencionImpuesto;

    public EmpleadoContratado(String nombre, String apellido, Integer legajo) {
        super(nombre, apellido, legajo);
        this.importePorHora = 7.0;
        this.retencionImpuesto = 0.14;
    }

    @Override
    public double calcularSueldo(Integer dias) {
        return (dias * (importePorHora * 8.0)) - (dias * (importePorHora * 8.0)) * retencionImpuesto;
    }
}
