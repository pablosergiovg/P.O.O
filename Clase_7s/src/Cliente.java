public class Cliente {

    private String nombre;
    private String telefono;
    private String domicilio;

    public Cliente(String nombre, String telefono, String domicilio){
        this.nombre = nombre;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public void mostrarCliente(){
        System.out.println("Cliente: " + nombre);
    }


}
