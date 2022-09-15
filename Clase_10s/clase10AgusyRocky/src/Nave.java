public class Nave extends ObjetoGrafico{

    private double velocidad;

    private int vida;

    public Nave(int posX, int posY, char direccion, double velocidad) {
        super(posX, posY, direccion);
        this.velocidad = velocidad;
        vida = 5;
    }

    @Override
    public void irA(int x, int y, char direccion) {

        if(getDireccion() == direccion){
            super.irA(x, y, direccion);
        }else {
            girar(direccion);
            super.irA(x, y, direccion);
        }

    }



    public  void girar(char direccion){

        setDireccion(direccion);
    }

    public void restarVida(int valor){

        vida -= valor;
    }
}
