package estados;

public class Hambriento implements TamagochiState{

    private Integer cantidadDeMimosRecibidos;

    public Hambriento() {
        cantidadDeMimosRecibidos = 0;
    }

    @Override
    public TamagochiState recibirComida() {
        return new Feliz();
    }

    @Override
    public TamagochiState recibirBebida() {
        return new Triste();
    }

    @Override
    public TamagochiState recibirMimos() {
        if(cantidadDeMimosRecibidos >= 3){
            return new Triste();
        }else {
            cantidadDeMimosRecibidos++;
            return this;
        }
    }
}
