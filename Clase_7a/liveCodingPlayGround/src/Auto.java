public class Auto {
    private String patente;
    private String marca;
    private String modelo;
    private Motor motor;


    public Auto(String patente, String marca, String modelo){
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        motor = new Motor(); //de esta forma se evita el error de null point.
    }//PREGUNTAR AL PROFE SOBRE ESTO.


    public String getPatente(){
        return patente;
    }

}
