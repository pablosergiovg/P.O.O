public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta(123,500.0);
        Cuenta cuenta2 = new Cuenta(124,200.0);
        Cuenta cuenta3 = new Cuenta(125,300.0);

        Persona persona = new Persona("Pablo","Viera", 32);

        persona.agregarCuenta(cuenta1);
        persona.agregarCuenta(cuenta2);
        persona.agregarCuenta(cuenta3);


        System.out.println(persona.getSaldoTotal());
        persona.mostrarCuentas();



    }
}