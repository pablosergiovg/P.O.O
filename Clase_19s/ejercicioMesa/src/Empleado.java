public abstract class Empleado {

    private String nombre;
    private String apellido;
    private Integer Legajo;

    public Empleado(String nombre, String apellido, Integer legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        Legajo = legajo;
    }


    public abstract double calcularSueldo(Integer dias);

}
