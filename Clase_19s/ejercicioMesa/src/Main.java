public class Main {
    public static void main(String[] args) {

        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

        Empresa empresa = new Empresa("asdf1234");

        try{
            empresa.agregarEmpleado(empleadoFactory.crearEmpleado("EMP-RD"));
            empresa.agregarEmpleado(empleadoFactory.crearEmpleado("EMP-PH"));
        }catch (EmpleadoFactoryException e){
            e.printStackTrace();
        }

        System.out.println(empresa.calcularSueldosTotal(30));


    }
}