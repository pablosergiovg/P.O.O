import java.util.Objects;

public class ObjetoGrafico {

    private int posx;
    private int posy;
    private char direccion;

    public ObjetoGrafico( int x, int y, char direccion){
        posx = x;
        posy = y;
        this.direccion = direccion;
    }

    public void irA( int x, int y, char direccion) {
        this.posx = x;
        this.posy = y;
        this.direccion = direccion;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjetoGrafico that)) return false;
        return posx == that.posx && posy == that.posy && direccion == that.direccion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(posx, posy, direccion);
    }
}
