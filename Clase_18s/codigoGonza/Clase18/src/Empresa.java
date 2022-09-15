import java.util.List;

public class Empresa {

    private List<Reserva> reservaList;

    public Empresa(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }
    
    public Double recaudacionTotal(){
        Double total = 0.0;
        for (Reserva reserva : reservaList) {
            total += reserva.calcularPrecio();
        }
        return total;
    }

    public Integer cantVecesRecorrida(String estacion){
        Integer total = 0;

        for (Reserva reserva : reservaList) {
            if(reserva.getRecorrido().getEstacion().getEstaciones().contains(estacion)){
                total += reserva.getCantPersonas();
            }
        }
        return total;
    }
}
