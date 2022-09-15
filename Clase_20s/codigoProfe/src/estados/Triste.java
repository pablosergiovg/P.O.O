package estados;

public class Triste implements TamagochiState{
    @Override
    public TamagochiState recibirComida() {
        return this;
    }

    @Override
    public TamagochiState recibirBebida() {
        return this;
    }

    @Override
    public TamagochiState recibirMimos() {
        return new Feliz();
    }
}
