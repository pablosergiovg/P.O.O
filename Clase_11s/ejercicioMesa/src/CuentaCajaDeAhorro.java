public class CuentaCajaDeAhorro extends Cuenta{

    private Double tazaDeInteres;


    public CuentaCajaDeAhorro(Cliente cliente, Double saldo, Double tazaDeInteres){
        super(cliente, saldo);
        this.tazaDeInteres = tazaDeInteres;
    }

    @Override
    public void depositar(Double montoADepositar) {
        super.depositar(montoADepositar);
    }

    @Override
    public Double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void retirar(Double montoARetirar) {
        if(montoARetirar > getSaldo()){
            System.out.println("saldo insuficiente");
        }else{
            Double resta = getSaldo() - montoARetirar;
            System.out.println("Su nuevo saldo es: " + resta);
        }
    }

    public void cobrarIntereses(){
        Double intereses;
        intereses = getSaldo() * 0.02;
        Double saldoActual;
        saldoActual = getSaldo() + intereses;
        System.out.println("Usted ha cobrado: " + intereses + " en intereses, su saldo actual ahora es de: " + saldoActual);
    }



}
