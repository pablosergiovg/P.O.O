public class Jugador implements Comparable<Jugador>{

    private Integer numeroDeCamiseta;
    private String nombre;
    private Boolean esTitular;
    private Boolean estaLesionado;

    public Jugador(Integer numeroDeCamiseta, String nombre, Boolean esTitular, Boolean estaLesionado) {
        this.numeroDeCamiseta = numeroDeCamiseta;
        this.nombre = nombre;
        this.esTitular = esTitular;
        this.estaLesionado = estaLesionado;
    }

    @Override
    public int compareTo(Jugador otroJugador) {


        return this.numeroDeCamiseta.compareTo(otroJugador.numeroDeCamiseta);
    }

    public Boolean getEsTitular() {
        return esTitular;
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    @Override
    public String toString() {
        return "numero: " + numeroDeCamiseta + " nombre: " + nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
