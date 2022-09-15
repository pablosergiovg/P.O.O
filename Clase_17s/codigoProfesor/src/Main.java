import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta("Martina");

        try {
            Cuenta otraCuenta = new Cuenta("Florencia",-5000.0);
        } catch (CuentaException e) {
            e.printStackTrace();
        }

        try{
            cuenta.depositar(1000.0);
        }catch(Exception e){
            e.printStackTrace();
        }


        try {
            cuenta.retirar(-600.0);
            cuenta.retirar(5000.0);
        } catch (CuentaException e) {
            e.printStackTrace();
        }



        cuenta.mostrarSaldo();

        System.out.println("LLEGO HASTA ACA");
    }
}