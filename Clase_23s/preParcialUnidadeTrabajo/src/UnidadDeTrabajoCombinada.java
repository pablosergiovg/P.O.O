import java.util.ArrayList;
import java.util.List;

public class UnidadDeTrabajoCombinada extends UnidadDeTrabajo{

    private List<UnidadDeTrabajo> listaUnidadDeTrabajo;
    private Double coeficienteGlobal;

    public UnidadDeTrabajoCombinada(String nombre, String descripcion, Double coeficienteGlobal) {
        super(nombre, descripcion);
        this.coeficienteGlobal = coeficienteGlobal;
        listaUnidadDeTrabajo = new ArrayList<>();
    }

    public void agregarUnidadDeTrabajo(UnidadDeTrabajo unidadDeTrabajo){
        listaUnidadDeTrabajo.add(unidadDeTrabajo);
    }

    @Override
    public Double calcularMonto() {
        Double precio = 0.0;
        for (UnidadDeTrabajo unidadDeTrabajo : listaUnidadDeTrabajo) {
            precio += unidadDeTrabajo.calcularMonto();
        }
        return precio * coeficienteGlobal;
    }


}
