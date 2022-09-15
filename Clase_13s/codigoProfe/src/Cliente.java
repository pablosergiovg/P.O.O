public class Cliente implements Comparable{

    private Integer numeroCliente;
    private String nombre;

    public Cliente(Integer numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


//    @Override
//    public int compareTo(Object object) {
//
//        Cliente otroCliente = (Cliente) object;
//
//        return this.nombre.compareTo(otroCliente.nombre);
//    }


    @Override
    public int compareTo(Object o) {

        Cliente otroCliente = (Cliente) o;
        if(this.numeroCliente > otroCliente.numeroCliente){
            return 1;
        }
        if(this.numeroCliente < otroCliente.numeroCliente){
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
