import java.util.ArrayList;
import java.util.List;

public class Puerto{

    private List<Contenedor> listaContenedores;

    public Puerto() {
        listaContenedores = new ArrayList<>();
    }

    public void agregarContenedores(Contenedor contenedor){
        listaContenedores.add(contenedor);
    }

    public Integer contarContenedoresPeligrosos(){
        Integer contador = 0;
        for (Contenedor contenedor : listaContenedores) {
            if(contenedor.getMaterialesPeligrosos() && contenedor.getPaisDeProcedencia().equalsIgnoreCase("DESCONOCIDA")){
                contador++;
            }
        }
        return contador;
    }

    public void ordenarContenedores(){

        listaContenedores.sort(null);

        for (Contenedor contenedor : listaContenedores) {
            System.out.println(contenedor);
        }

    }

}
