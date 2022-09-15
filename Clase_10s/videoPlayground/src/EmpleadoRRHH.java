public class EmpleadoRRHH extends Empleado{

    private Integer altasLogradas;



    public EmpleadoRRHH(String nombre, String apellido, String dni, Integer altasLogradas){
        super(nombre, apellido, dni);
        this.altasLogradas = altasLogradas;
    }



    @Override
    public void trabajar(){
        System.out.println("Empleado de RRHH " + getNombre() + " trabajando.");
    }


    @Override
    public void descanso(){
        System.out.println("Empleado de RRHH " + getNombre() + " descansando.");
    }

}
