

public class Impresora {

    private String modelo;
    private String tipoDeConexion;
    private String fechaDeFabricacion;
    private Integer cantidadDeHojas;

    public Impresora(String modelo, String tipoDeConexion, String fechaDeFabricacion) {
        this.modelo = modelo;
        this.tipoDeConexion = tipoDeConexion;
        this.fechaDeFabricacion = fechaDeFabricacion;
        cantidadDeHojas = 0;
    }

    private Boolean tienePapel(){
        return cantidadDeHojas > 0;
    }

    public void imprimir(String texto){
        if(tienePapel()){
            System.out.println("imprimiendo: " + texto);
            cantidadDeHojas--;
        }else {
            System.out.println("no tengo papel");
        }
    }

    public void imprimir(String texto,Integer cantidad){
        for (int i = 0; i < cantidad; i++) {
            imprimir(texto);
        }
    }

    public void agregarHojas(Integer hojasAgregadas){
        cantidadDeHojas += hojasAgregadas;
    }


}
