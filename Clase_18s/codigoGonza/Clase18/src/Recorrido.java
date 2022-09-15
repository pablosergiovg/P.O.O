import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Recorrido {
    private Estacion estacion;
    private String estacionDePartida;
    private String estacionDestino;

    public Recorrido(String estacionDePartida, String estacionDestino, Estacion estacion) throws RecorridoException {
        this.estacion = estacion;
        if(!estacion.getEstaciones().contains(estacionDePartida) || !estacion.getEstaciones().contains(estacionDestino)){
            throw new RecorridoException("La estacion no se encuentra en el sistema");
        }
        this.estacionDePartida = estacionDePartida;
        this.estacionDestino = estacionDestino;
    }

    public String getEstacionDePartida() {
        return estacionDePartida;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }

    public Estacion getEstacion() {
        return estacion;
    }
}
