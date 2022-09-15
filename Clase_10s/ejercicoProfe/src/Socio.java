import java.util.Objects;

public class Socio{

    private String numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;



    public Socio(String numeroSocio, String nombre, Double cuotaMensual, String actividad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public Double calcularCostoMensual(){
        System.out.println("esto cobrando la cuota a " + nombre);
        return cuotaMensual ;
    }

    @Override
    public String toString() {
        return "numero de socio " + numeroSocio + " se llama " + nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(numeroSocio, socio.numeroSocio) && Objects.equals(nombre, socio.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroSocio, nombre);
    }
}
