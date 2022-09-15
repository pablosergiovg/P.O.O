public class Asteroide extends ObjetoGrafico{

    private int lesion;

    public Asteroide(int x, int y, char direccion, int lesion){
        super(x, y, direccion);
        this.lesion = lesion;
    }

    public void irA(int x, int y, char direccion){
        super.irA(x, y, direccion);
    }
}
