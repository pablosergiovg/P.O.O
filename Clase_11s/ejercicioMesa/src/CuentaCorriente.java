public class CuentaCorriente extends Cuenta{

    private Double montoAutorizado;

    public CuentaCorriente(Cliente cliente, Double saldo){
        super
        this.montoAutorizado = 5000.0;
    }

    @Override
    public void depositar(Double montoADepositar) {
        super.depositar(montoADepositar);
    }

    @Override
    public Double getSaldo() {
        return super.getSaldo();
    }

    public void retirar(Double montoARetirar) {
        if(montoARetirar > getSaldo() && montoARetirar - getSaldo() > -5000.0){
            Double resta = montoARetirar - getSaldo();
            montoAutorizado = montoARetirar - getSaldo() - 5000.0;
            System.out.println("Su nuevo saldo es: " + resta + " le queda solo " + montoAutorizado + " de monto autorizado.");
        }else if(montoARetirar > getSaldo() && montoARetirar - getSaldo() > -5000){
            System.out.println("Saldo insuficiente y su monto autorizado es superado.");
        }else{
            Double resta = getSaldo() - montoARetirar;
            System.out.println("Su nuevo saldo es: " + resta);
        }
    }





}
