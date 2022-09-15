public class Cliente {

    private Integer numeroDeCliente;
    private String apellido;
    private Integer dni;
    private Integer cuit;

    public Cliente(Integer numeroDeCliente, String apellido, Integer dni, Integer cuit){
        this.numeroDeCliente = numeroDeCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    public String getApellido() {
        return apellido;
    }


}
