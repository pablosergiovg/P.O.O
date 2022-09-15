public class Chofer {

    private String nombre;
    private String apellido;
    private Auto auto;

    public Chofer(String nombre, String apellido, Auto auto){
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }

    public String verPatente(){
        return auto.getPatente();
    }

    public String verChoferConPatente(){//                                    accedo a getPatente mediante auto(el atributo de Chofer)
        return nombre + " " + apellido + " la patente de su auto es " + auto.getPatente();
    }

    public String verNombreApellidoDelChofer(){
        return nombre + " " + apellido;
    }


}
