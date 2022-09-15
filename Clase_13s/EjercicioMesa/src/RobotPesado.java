public class RobotPesado extends SistemaArmas implements Volador, Atacante, Defensor{

    private Boolean estoyDefendiendo;
    public RobotPesado(Integer energia) {
        super(energia);
        estoyDefendiendo = false;
    }

    @Override
    public void atacar(SistemaArmas o, Integer danio) {
        if(estoyDefendiendo){
            o.quitarEnergia(danio/2);
            System.out.println("Te saqué " + danio/2 + " tu energía actual es: " + o.getEnergia());
            estoyDefendiendo = false;
        } else {
            o.quitarEnergia(danio);
            System.out.println("Te saqué " + danio + " tu energía actual es: " + o.getEnergia());
        }

    }

    @Override
    public void defender() {
        estoyDefendiendo = true;
        System.out.println("Defensa pesada");
    }

    @Override
    public void volar() {
        System.out.println("Volando bajito");
    }
}
