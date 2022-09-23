import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<UnidadDeTrabajo> listaUnidadDeTrabajo;

    public Empresa(){
        listaUnidadDeTrabajo = new ArrayList<>();
    }

    public void agregarUnidadDeTrabajo(String codigo){
        try {
            listaUnidadDeTrabajo.add(UnidadDeTrabajoFactory.getInstance().crearUnidadDeTrabajo(codigo));
        }catch (UnidadDeTrabajoFactoryException e){
            e.printStackTrace();
        }
    }

    public void mostrarUnidades(){
        for (UnidadDeTrabajo unidadDeTrabajo : listaUnidadDeTrabajo) {
            System.out.println(unidadDeTrabajo);
        }
    }

}