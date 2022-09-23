public class UnidadDeTrabajoFactory{

    public static final String CODIGO_MANTENIMIENTO = "Mantenimiento";
    public static final String CODIGO_LIMPIEZA = "Limpieza";
    public static final String CODIGO_SERVICIOS_GENERALES = "Servicios Generales";

    private static UnidadDeTrabajoFactory instance;

    private UnidadDeTrabajoFactory(){

    }

    public static UnidadDeTrabajoFactory getInstance() {
        if(instance == null){
            instance = new UnidadDeTrabajoFactory();
        }
        return instance;
    }

    /*public UnidadDeTrabajo crearUnidadDeTrabajo(String codigo){
        switch (codigo){

            case "MANTENIMIENTO":
                return new UnidadDeTrabajoSimple("Mantenimiento", "mantener lo mantenible", 120000.0, 4);
            case "LIMPIEZA":
                return new UnidadDeTrabajoSimple("Limpieza", "limpiar lo limpiable", 100000.0, 24);
            case "SERVICIOSGENERALES":
                UnidadDeTrabajoCombinada unidadDeTrabajoCombinada = new UnidadDeTrabajoCombinada("Servicios Generales", "mantenimiento y limpieza", 3.0);
                unidadDeTrabajoCombinada.agregarUnidadDeTrabajo(crearUnidadDeTrabajo("MANTENIMIENTO"));
                unidadDeTrabajoCombinada.agregarUnidadDeTrabajo(crearUnidadDeTrabajo("LIMPIEZA"));
                return unidadDeTrabajoCombinada;
        }
        return null;
    }*/

    public UnidadDeTrabajo crearUnidadDeTrabajo(String codigo) throws UnidadDeTrabajoFactoryException {
        switch (codigo){
            case CODIGO_LIMPIEZA:
                return new UnidadDeTrabajoSimple("Limpieza", "tarea de Limpieza", 100000.0, 24);
            case CODIGO_MANTENIMIENTO:
                return new UnidadDeTrabajoSimple("Mantenimiento", "tarea de Mantenimiento", 120000.0, 4);
            case CODIGO_SERVICIOS_GENERALES:
                UnidadDeTrabajoCombinada unidadDeTrabajoCombinada = new UnidadDeTrabajoCombinada("Servicios Generales", "Limpieza y Mantenimiento", 3.0);
                unidadDeTrabajoCombinada.agregarUnidadDeTrabajo(crearUnidadDeTrabajo(CODIGO_LIMPIEZA));
                unidadDeTrabajoCombinada.agregarUnidadDeTrabajo(crearUnidadDeTrabajo(CODIGO_MANTENIMIENTO));
                return unidadDeTrabajoCombinada;
        }
        throw new UnidadDeTrabajoFactoryException("El código " + codigo + " es incorrecto");
    }


}
