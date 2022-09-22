import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<UnidadDeTrabajo> listaUnidadDeTrabajo;

    public Empresa(){
        listaUnidadDeTrabajo = new ArrayList<>();
    }

    public void agregarUnidadDeTrabajo(UnidadDeTrabajo unidadDeTrabajo){
        listaUnidadDeTrabajo.add(unidadDeTrabajo);
    }

    public void mostrarUnidades(){
        for (UnidadDeTrabajo unidadDeTrabajo : listaUnidadDeTrabajo) {
            System.out.println(unidadDeTrabajo);
        }
    }

}