public class Main {
    public static void main(String[] args) {

        UnidadDeTrabajoFactory unidadDeTrabajoFactory = UnidadDeTrabajoFactory.getInstance();
        Empresa empresa = new Empresa();

        empresa.agregarUnidadDeTrabajo(unidadDeTrabajoFactory.crearUnidadDeTrabajo("MANTENIMIENTO"));
        empresa.agregarUnidadDeTrabajo(unidadDeTrabajoFactory.crearUnidadDeTrabajo("LIMPIEZA"));
        empresa.agregarUnidadDeTrabajo(unidadDeTrabajoFactory.crearUnidadDeTrabajo("SERVICIOSGENERALES"));

        empresa.mostrarUnidades();

    }
}