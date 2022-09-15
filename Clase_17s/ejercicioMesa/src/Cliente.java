public class Cliente {

    private String nombre;
    private String apellido;
    private String DNI;
    private Double deuda;
    private Double limite;

    public Cliente (String nombre, String apellido, String DNI, Double limite){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.limite = limite;
        deuda = 0.0;
    }
    public void comprar (Double importe){
        try {
            if ((deuda + importe)< limite){
                deuda += importe;
            }
            else {
                throw new ClienteException("Superaste tu limite");
            }
        }
        catch (ClienteException e) {
            e.printStackTrace();
        }
    }
    public void saldarDeuda (Double importe) throws ClienteException {
        if (deuda == 0.0){
            throw new ClienteException("No tienes deuda para saldar");
        } else {
            deuda -= importe;
        }
    }
}
