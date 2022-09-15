import estados.Feliz;
import estados.TamagochiState;

public class Tamagochi {

    private TamagochiState estadoActual;

    public Tamagochi() {
        estadoActual = new Feliz();
    }

    public void darDeComer(){
        estadoActual = estadoActual.recibirComida();
    }

    public void darDeBeber(){
        estadoActual = estadoActual.recibirBebida();
    }

    public void darMimos(){
        estadoActual = estadoActual.recibirMimos();
    }

}
