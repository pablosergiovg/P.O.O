import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Reserva> listaReserva;

    public Empresa(){
        listaReserva = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva){
        listaReserva.add(reserva);
    }

    public Double recaudacionTotal(){

        Double acumulador = 0.0;

        for (Reserva reserva : listaReserva) {
            acumulador += reserva.precioReserva();
        }
        return acumulador;

    }

    public Integer cantVecesRecorrida(String estacion) throws EmpresaException{

        Integer acumulador = 0;

        for (int i = 0; i < listaReserva.size(); i++) {
            if(listaReserva.get(i).getRecorrido().getEstacionPartida().equalsIgnoreCase(estacion) || listaReserva.get(i).getRecorrido().getEstacionDestino().equalsIgnoreCase(estacion)){
                acumulador += listaReserva.get(i).getCantidadDePersonas();
            }
        }

        if (acumulador == 0) {
            throw new EmpresaException("No se han subido ni bajado personas en esta estación");
        }
        return acumulador;

    }


}
