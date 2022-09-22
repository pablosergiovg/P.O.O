public class UnidadDeTrabajoFactory{

    private static UnidadDeTrabajoFactory instance;

    private UnidadDeTrabajoFactory(){

    }

    public static UnidadDeTrabajoFactory getInstance() {
        if(instance == null){
            instance = new UnidadDeTrabajoFactory();
        }
        return instance;
    }

    public UnidadDeTrabajo crearUnidadDeTrabajo(String codigo){
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
    }

}
