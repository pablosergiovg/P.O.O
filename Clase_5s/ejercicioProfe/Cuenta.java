public class Cuenta {

    //ATRIBUTOS

    private Integer numeroDeCuento;
    private String titular;
    private Double saldo;

    //CONSTRUCTOR


    public Cuenta(Integer numeroDeCuento, String titular) {
        this.numeroDeCuento = numeroDeCuento;
        this.titular = titular;
        saldo = 0.0;
    }
    //SOBRECARGAR UN CONSTRUCTOR


    public Cuenta(Integer numeroDeCuento, String titular, Double saldo) {
        this.numeroDeCuento = numeroDeCuento;
        this.titular = titular;
        this.saldo = saldo;
    }

    //METODOS
    public void depositar(Double monto){
        System.out.println(titular +" tu saldo era de " + saldo);
        System.out.println("se depositaron " + monto);
        this.saldo += monto;
        System.out.println(titular +" tu nuevo saldo es de " + saldo);
    }

    public void retirar(Double monto){
        if(monto <= saldo){
            System.out.println(titular +" tu saldo era de " + saldo);
            System.out.println("se retiraron " + monto);
            this.saldo -= monto;
            System.out.println(titular +" tu nuevo saldo es de " + saldo);
        }else{
            System.out.println("no te da el saldo");
        }
    }
    //GETTERS Y SETTERS

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


}
