public class Contenedor implements Comparable<Contenedor>{

    private Integer numero;
    private String paisDeProcedencia;
    private Boolean materialesPeligrosos;

    public Contenedor(Integer numero, String paisDeProcedencia, Boolean materialesPeligrosos) {
        this.numero = numero;
        this.paisDeProcedencia = paisDeProcedencia;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    public Boolean getMaterialesPeligrosos() {
        return materialesPeligrosos;
    }

    public String getPaisDeProcedencia() {
        return paisDeProcedencia;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Contenedor otroContenedor) {
        return this.numero.compareTo(otroContenedor.numero);
    }

    @Override
    public String toString() {
        return numero + " viene de " + paisDeProcedencia;
    }

}
