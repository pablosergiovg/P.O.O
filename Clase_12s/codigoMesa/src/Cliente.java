public class Cliente {

    private Integer numeroCliente;
    private String nombre;

    public Cliente(Integer numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
