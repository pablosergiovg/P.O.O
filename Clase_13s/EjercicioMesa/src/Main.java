public class Main {
    public static void main(String[] args) {

        RobotPesado robot1 = new RobotPesado(1000);
        robot1.volar();
        robot1.defender();

        RobotPesado robot2 = new RobotPesado(2000);
        robot2.atacar(robot1, 100);

        Tanque tanque1 = new Tanque( 2000);
        tanque1.atacar(robot2, 500);

        Seniuelo seniuelo1 = new Seniuelo(100);
        seniuelo1.mostrar();
    }
}