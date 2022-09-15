public class EmpleadoFactory {

    private static EmpleadoFactory instance;

    private EmpleadoFactory(){

    }

    public static EmpleadoFactory getInstance() {
        if(instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public Empleado crearEmpleado(String codigo) throws EmpleadoFactoryException{

        switch (codigo){
            case "EMP-RD":
                return new EmpleadoRelacionDependencia("Rocky","Balboa",123,1000.0);
            case "EMP-PH":
                return new EmpleadoContratado("Ceci", "Lia", 124);
        }
        throw new EmpleadoFactoryException("el codido ingresado es incorrecto");

    }






}
