public class EmpleadoProduccion extends Empleado {

    private Integer tiempoDeExperiencia;


    public EmpleadoProduccion(String nombre, String apellido, String dni, Integer tiempoDeExperiencia) {
        super(nombre, apellido, dni);
        this.tiempoDeExperiencia = tiempoDeExperiencia;
    }


    @Override
    public void trabajar(){
        System.out.println("Empleado de Produccion " + getNombre() + " trabajando.");

    }

}