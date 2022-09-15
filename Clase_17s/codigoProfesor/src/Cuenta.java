public class Cuenta {

    private String nombre;
    private Double saldo;

    public Cuenta(String nombre) {
        this.nombre = nombre;
        saldo = 0.0;
    }

    public Cuenta(String nombre, Double saldo) throws CuentaException{
        if(saldo < 0){
            throw new CuentaException("no podes crear cuentas con saldo negativo");
        }
        this.nombre = nombre;
        this.saldo = saldo;

    }

    public void depositar(Double monto){
        saldo += monto;
    }

    public void retirar(Double monto) throws CuentaException {
        if(monto < 0){
            throw new CuentaException("no podes retirar numeros negativos");
        }
        if(monto > saldo){
            //noo se puede
            // rompa
            throw new CuentaException("saldo insuficiente: tu saldo es de " + saldo + " y queres retirar " + monto);
        }
        saldo -= monto;

    }

    public void mostrarSaldo(){
        System.out.println("saldo: " + saldo);
    }

}
