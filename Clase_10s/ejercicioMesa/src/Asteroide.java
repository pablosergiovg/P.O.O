public class Asteroide extends ObjetoGrafico{

    private Integer lesion;

    Asteroide(Integer posx, Integer posy, String direccion, Integer lesion){
        super(posx, posy, direccion);
        lesion = 5;
    }

    @Override
    public void irA(Integer posx, Integer posy, String direccion) {
        super.irA(posx, posy, direccion);
    }

    public Integer getLesion() {
        return lesion;
    }

    @Override
    public String getDireccion() {
        return super.getDireccion();
    }
}
