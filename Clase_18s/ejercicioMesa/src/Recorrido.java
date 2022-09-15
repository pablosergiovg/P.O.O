import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Recorrido {

    private String estacionDestino;
    private String estacionPartida;
    private Estacion estacion;
    public Recorrido(String estacionDestino, String estacionPartida, Estacion estacion) throws RecorridoException {

        this.estacion = estacion;

        if(!estacion.getEstaciones().contains(estacionPartida) || !estacion.getEstaciones().contains(estacionDestino)){
            throw new RecorridoException("Estación no encontrada");
        }
        this.estacionDestino = estacionDestino;
        this.estacionPartida = estacionPartida;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }

    public String getEstacionPartida() {
        return estacionPartida;
    }

    public Estacion getEstacion() {
        return estacion;
    }
}
