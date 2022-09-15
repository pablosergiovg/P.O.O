import java.util.Objects;

public class Nave extends ObjetoGrafico{

    private double velocidad;
    private int vida;

    public Nave(int x, int y, char direccion, double velocidad){
        super(x, y, direccion);
        this.velocidad = velocidad;
        vida = 3;
    }

    @Override
    public void irA(int x, int y, char direccion){
        if (super.getDireccion() != direccion){
            girar(direccion);
        }
        super.irA(x, y, direccion);
    }

    public void girar(char direccion){
        super.setDireccion(direccion);
    }

    public void restaVida(int valor){
    this.vida -= valor;
    }

}
