public class Cliente {
    public static void main(String[] args) {
    try {
        /* sacar comentario para ver error al intentar instanciar
        una clase que tiene su constructor privado*/
        /* GaseosaFactory fabrica = new GaseosaFactory();*/

        /*instanci de cada objeto, y ejecución de método abrir()*/
        Gaseosa gs1 = GaseosaFactory.construir("Coca");
        gs1.abrir();

        Gaseosa gs2 = GaseosaFactory.construir("Naranja");
        gs2.abrir();

        /*intento construir objeto que no posee ninguna
        clase concreta*/
        Gaseosa gs3 = GaseosaFactory.construir("Uva");
        gs3.abrir();

    }catch (Exception e){
        System.out.println("¡Exception encontrada!: " + e);
    }
    }
}
