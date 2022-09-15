import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private Integer edad;

    public Persona(String nombre, String apellido, Integer edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    private List<Cuenta> cuentas = new ArrayList<>();

    public void agregarCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public Boolean esMayorEdad(){
        if(edad > 59){
            return true;
        }
        return false;
    }

    public Double getSaldoTotal(){
        Double saldo = 0.0;
        for(Cuenta cuenta : cuentas){
             saldo += cuenta.getSaldo();
        }
        return saldo;
    }

    public void mostrarCuentas(){
        Integer i = 0;
        for(Cuenta cuenta : cuentas){
            cuenta.mostrarCuentas();
        }
    }


}
