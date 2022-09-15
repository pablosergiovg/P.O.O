public class Tanque extends SistemaArmas implements Atacante, Defensor{

    public Tanque(Integer energia) {
        super(energia);
    }


    @Override
    public void atacar(SistemaArmas o, Integer danio) {
        o.quitarEnergia(danio);
        System.out.println("Te saqué " + danio + " tu energía actual es: " + o.getEnergia());
    }

    @Override
    public void defender() {
        System.out.println("Defendiendo como un tanque");
    }
}
