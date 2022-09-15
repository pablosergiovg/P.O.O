import java.util.Objects;

public class ObjetoGrafico {

    private Integer posx;
    private Integer posy;
    private String direccion;

    ObjetoGrafico(Integer posx, Integer posy, String direccion){
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void irA(Integer posx, Integer posy, String direccion){
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public Integer getPosx(Integer posx){
        return posx;
    }

    public Integer getPosy(Integer posy){
        return posy;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String toString() {
        return "posición X: " + posx + ", posición Y: " + posy + ", direccion: " + direccion;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjetoGrafico that)) return false;
        return posx.equals(that.posx) && posy.equals(that.posy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posx, posy);
    }


}
