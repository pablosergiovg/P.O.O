import java.util.Date;

public class Perro {
    private Boolean esPosibleAdoptarlo;

    private String raza;

    private Integer anioAproxNacimiento;

    private Double peso;

    private Boolean tieneChip;

    private Boolean estaLastimado;

    private String nombreDePila;

    public Perro(String raza, Integer anioAproxNacimiento, Double peso, Boolean tieneChip, Boolean estaLastimado, String nombreDePila) {
        this.raza = raza;
        this.anioAproxNacimiento = anioAproxNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombreDePila = nombreDePila;
    }
    public void getEdad(){
        Date hoy = new Date();

        System.out.println((hoy.getYear() + 1900) - anioAproxNacimiento);
    }
    public void puedePerderse(){
        if(!tieneChip){
            System.out.println(this.nombreDePila + " no tiene chip, asi que puede perderse. OJO!");
        } else {
            System.out.println(this.nombreDePila + " tiene chip, asi que es probable que no se piedra. VIVA!");
        }
    }
    public void puedeSerAdoptado(){
        if(peso > 5.0 && estaLastimado == false){
            esPosibleAdoptarlo = true;
            System.out.println(this.nombreDePila + " se ve saludable, puede ser dado en adopcion!");
        } else {
            esPosibleAdoptarlo = false;
            System.out.println(this.nombreDePila + " esta malito, espera un rato que se ponga mejor y lo adoptas :)");
        }
    }
}
