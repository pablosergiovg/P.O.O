public class CuentaComitente extends Cuenta{

    private String claveDeValidacion;

    public CuentaComitente(Cliente cliente, Double saldo, String claveDeValidacion){
        super(cliente, saldo);
        this.claveDeValidacion = claveDeValidacion;
    }

    @Override
    public void depositar(Double monto) {
        super.depositar(monto * 0.99);
    }

    /*
    public Double restarComision(Double monto){
        Double montoMenosComision;
        montoMenosComision = monto - (monto * 0.1);
        return montoMenosComision;
    }
    */

    @Override
    public void retirar(Double monto) {
        super.retirar(monto);
    }




}
