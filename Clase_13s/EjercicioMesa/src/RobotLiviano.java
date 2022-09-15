public class RobotLiviano extends SistemaArmas implements Volador, Atacante, Defensor{


    public RobotLiviano(Integer energia) {
        super(energia);

    }

    @Override

    public void atacar(SistemaArmas o, Integer danio) {
        o.quitarEnergia(danio);
        System.out.println("Te saqué " + danio + " tu energía actual es: " + o.getEnergia());
    }

    @Override
    public void defender() {
        System.out.println("Defensa liviano");
    }

    @Override
    public void volar() {
        System.out.println("Volando alto");
    }

}
