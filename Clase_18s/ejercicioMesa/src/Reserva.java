public class Reserva {

    private Integer codigo;
    private Recorrido recorrido;
    private Integer cantidadDePersonas;
    private Double precioBaseReserva;

    public Reserva(Integer codigo, Recorrido recorrido, Integer cantidadDePersonas){
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantidadDePersonas = cantidadDePersonas;
        precioBaseReserva = 50.0;
    }

    public Double precioReserva(){
        if((recorrido.getEstacionPartida().contains(recorrido.getEstacion().getEstaciones().get(0)) && recorrido.getEstacionDestino().contains(recorrido.getEstacion().getEstaciones().get(recorrido.getEstacion().getEstaciones().size() - 1)) || recorrido.getEstacionPartida().contains(recorrido.getEstacion().getEstaciones().get(recorrido.getEstacion().getEstaciones().size() - 1)) && recorrido.getEstacionDestino().contains(recorrido.getEstacion().getEstaciones().get(0)))){
            return (precioBaseReserva * cantidadDePersonas) * 0.8;
        }
        return cantidadDePersonas * precioBaseReserva;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public Integer getCantidadDePersonas() {
        return cantidadDePersonas;
    }
}
