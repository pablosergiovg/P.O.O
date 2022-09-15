import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Jugador> jugadorList;


    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadorList = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        jugadorList.add(jugador);

    }


    public Integer cantidadTitularesLesionados(){

        Integer cantidadLesionados = 0;

        for (Jugador jugador : jugadorList) {
            if(jugador.getEsTitular() && jugador.getEstaLesionado()){
                cantidadLesionados++;
            }
        }

        return cantidadLesionados;
    }

    public void mostrarJugadoresTitulares(){

//        jugadorList.sort(new Comparator<Jugador>() {
//            @Override
//            public int compare(Jugador jugador, Jugador otroJugador) {
//                return jugador.getNombre().compareTo(otroJugador.getNombre());
//            }
//        });

        jugadorList.sort(null);

        for (Jugador jugador : jugadorList) {
            if(jugador.getEsTitular()){
                System.out.println(jugador);
            }
        }
    }
}
