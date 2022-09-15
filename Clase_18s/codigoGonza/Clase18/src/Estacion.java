import java.util.LinkedList;
import java.util.List;

public class Estacion {

    private List<String> estaciones;

    public Estacion() {
        estaciones = new LinkedList<>();
        estaciones.add("Buenos Aires");
        estaciones.add("Luján");
        estaciones.add("Mercedes");
        estaciones.add("Suipacha");
        estaciones.add("Chivilcoy");
        estaciones.add("Alberti");
        estaciones.add("Bragado");
    }

    public List<String> getEstaciones() {
        return estaciones;
    }

    public void agregarEstacion(String estacion, Integer posicion){
        estaciones.add(posicion, estacion);
    }


}