import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String razonSocial;

    private List<Empleado> listaEmpleado;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        listaEmpleado = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        listaEmpleado.add(empleado);
    }



    public Double calcularSueldosTotal(Integer dia){
        Double sumaTotal = 0.0;

        for (Empleado empleado : listaEmpleado) {

            sumaTotal += empleado.calcularSueldo(dia);

        }
        return sumaTotal;
    }
}
