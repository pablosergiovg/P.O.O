public class CuentaCorriente extends Cuenta{

    private Double montoAutorizado;



    public CuentaCorriente(Cliente titular, Double saldo, Double montoAutorizado) {
        super(titular, saldo);
        this.montoAutorizado = montoAutorizado;

    }


    @Override
    protected Boolean puedeRetirar(Double monto) {

        return getSaldo() + montoAutorizado >= monto;
    }




}
