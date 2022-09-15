public class Caja extends Producto{

    private Double alto;
    private Double ancho;
    private Double longitud;

    public Caja(Double peso, Double alto, Double ancho, Double longitud) {
        super(peso);
        this.alto = alto;
        this.ancho = ancho;
        this.longitud = longitud;
    }

    @Override
    public Double calcularEspacio() {
        return alto * ancho * longitud;
    }
}
