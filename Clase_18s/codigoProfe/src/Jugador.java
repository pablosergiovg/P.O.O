public class Jugador {

    private String apellido;
    private Integer numeroCamiseta;
    private String posicion;

    public Jugador(String apellido, Integer numeroCamiseta, String posicion) {
        this.apellido = apellido;
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }
}
