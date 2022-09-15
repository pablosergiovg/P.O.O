/*Clase que fabrica cada producto concreto*/
public class GaseosaFactory {

    /*atributo que almacena la única instancia que será creada*/
    private static GaseosaFactory instancia;

    /*constructor privado, para que no se pueda instanciar desde fuera*/
    private GaseosaFactory()
    {
    }

    /*SINGLETON*/
    /*getInstance() retorna la unica instancia que puede ser creada */
    public static GaseosaFactory getInstance()
    {
        if(instancia == null)
            instancia = new GaseosaFactory();

        return instancia;
    }

    /*método construir, recibe un string
    que determina el objeto concreto a instanciar */
    public static Gaseosa construir(String tipo)
    {

        /*indetificar el parámetro recibido con un switch*/
        switch (tipo){
            case "Coca":
                return new GaseosaCola();
            case "Naranja":
                return new GaseosaNaranja();
            default:
                System.out.println("Ups, no encontramos este objeto para construir");
                return null;

        }
    }
}
