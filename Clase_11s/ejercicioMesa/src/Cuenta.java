public abstract class Cuenta {

    private Cliente cliente;
    private Double saldo;

    public Cuenta(Cliente cliente, Double saldo){
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void depositar(Double montoADepositar){
        saldo += montoADepositar;
    }


    public Double getSaldo() {
        return saldo;
    }


    public void retirar(Double montoARetirar){
        saldo -= montoARetirar;
    }


    public Cliente getCliente(){
        return cliente;
    }
}
