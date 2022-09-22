public class UnidadDeTrabajoSimple extends UnidadDeTrabajo{

    private Double montoPorPersona;
    private Integer cantidadDePersona;

    public UnidadDeTrabajoSimple(String nombre, String descripcion, Double montoPorPersona, Integer cantidadDePersona) {
        super(nombre, descripcion);
        this.montoPorPersona = montoPorPersona;
        this.cantidadDePersona = cantidadDePersona;
    }

    @Override
    public Double calcularMonto() {
        Double precio = 0.0;
        if(cantidadDePersona > 10){
            precio = ((cantidadDePersona * montoPorPersona) * 1.20);
            return precio;
        }
        precio = cantidadDePersona * montoPorPersona;
        return precio;
    }


}
