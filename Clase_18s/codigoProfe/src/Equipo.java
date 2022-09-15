import java.util.ArrayList;
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

    public List<Jugador> obtenerReservas(){

        List<Jugador> reservas = new ArrayList<>();

        for (int i = 17; i < jugadorList.size(); i++) {
            reservas.add(jugadorList.get(i));
        }
        return reservas;
    }

    public Integer cantidadJugadores(String posicion) throws EquipoException {


        if(!getPosicionesValidas().contains(posicion)){
           throw new EquipoException(posicion + " no es una posicion valida");
        }

        Integer jugadoresEnPosicion = 0;

        for (Jugador jugador : jugadorList) {
            if(jugador.getPosicion().equals(posicion)){
                jugadoresEnPosicion++;
            }
        }

        return jugadoresEnPosicion;
    }

    private List<String> getPosicionesValidas(){
        List<String> posicionesValidas = new ArrayList<>();
        posicionesValidas.add("ARQUERO");
        posicionesValidas.add("DEFENSOR");
        posicionesValidas.add("MEDIO");
        posicionesValidas.add("DELANTERO");
        posicionesValidas.add("AGUATERO");
        return posicionesValidas;
    }
}
