public class ObjetoGrafico {

    private int posX;

    private int posY;

    private char direccion;

    public ObjetoGrafico(int posX, int posY, char direccion) {
        this.posX = posX;
        this.posY = posY;
        this.direccion = direccion;
    }


    public  void irA (int x, int y, char direccion){
        this.posX = x;
        this.posY = y;
        this.direccion = direccion;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }
}
