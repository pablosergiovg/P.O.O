import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {


        Equipo equipo = new Equipo("Peñarol");

        equipo.agregarJugador(new Jugador("Manu Ginobeli",7,"MEDIO"));
        equipo.agregarJugador(new Jugador("Pablo Viera",2,"DEFENSOR"));
        equipo.agregarJugador(new Jugador("Agustin Ferres",10,"DELANTERO"));
        equipo.agregarJugador(new Jugador("Anita Mentora",5,"MEDIO"));
        equipo.agregarJugador(new Jugador("Martina Noguez",9,"DELANTERO"));

        try {
            equipo.cantidadJugadores("MEDIO");
        } catch (EquipoException e) {
            throw new RuntimeException(e);
        }
        
    }
}