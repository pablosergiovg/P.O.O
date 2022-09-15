public class Astreroide extends  ObjetoGrafico{

    private int lesion;

    public Astreroide(int posX, int posY, char direccion, int lesion) {
        super(posX, posY, direccion);
        this.lesion = lesion;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        super.irA(x, y, direccion);
    }
}
