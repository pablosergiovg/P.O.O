public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        empresa.agregarUnidadDeTrabajo(UnidadDeTrabajoFactory.CODIGO_LIMPIEZA);
        empresa.agregarUnidadDeTrabajo(UnidadDeTrabajoFactory.CODIGO_MANTENIMIENTO);
        empresa.agregarUnidadDeTrabajo(UnidadDeTrabajoFactory.CODIGO_SERVICIOS_GENERALES);

        empresa.mostrarUnidades();

    }


}