public class Cuenta {

    private Integer nroCuenta;
    private Double saldo;

    public Cuenta(Integer nroCuenta, Double saldo){
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void mostrarCuentas(){
        System.out.println(getNroCuenta() + " " + getSaldo());
    }

}
