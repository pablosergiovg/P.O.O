public class CuentaCajaDeAhorro extends Cuenta{

    private Double tasaDeInteres;

    public CuentaCajaDeAhorro(Cliente titular, Double saldo, Double tasaDeInteres) {
        super(titular, saldo);
        this.tasaDeInteres = tasaDeInteres;
    }

    public void cobrarInteres(){

        depositar(getSaldo() * tasaDeInteres);
    }

}
