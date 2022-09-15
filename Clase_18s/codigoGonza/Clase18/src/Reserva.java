public class Reserva {

    private String codigo;
    private Recorrido recorrido;
    private Integer cantPersonas;
    private Double precioBase;

    public Reserva(String codigo, Recorrido recorrido, Integer cantPersonas) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantPersonas = cantPersonas;
        precioBase = 50.0;
    }

    public Double calcularPrecio(){
        if((recorrido.getEstacionDePartida().contains(recorrido.getEstacion().getEstaciones().get(0)) && recorrido.getEstacionDestino().contains(recorrido.getEstacion().getEstaciones().get(recorrido.getEstacion().getEstaciones().size() - 1)) || recorrido.getEstacionDePartida().contains(recorrido.getEstacion().getEstaciones().get(recorrido.getEstacion().getEstaciones().size() - 1)) && recorrido.getEstacionDestino().contains(recorrido.getEstacion().getEstaciones().get(0)))){
            return (precioBase * cantPersonas) * 0.8;
        }
        return cantPersonas * precioBase;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public Integer getCantPersonas() {
        return cantPersonas;
    }
}
