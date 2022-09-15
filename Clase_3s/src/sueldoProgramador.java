import java.util.Scanner;

public class sueldoProgramador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer horasTrabajadas;

        do{

            System.out.println("Ingrese la cantidad de horas que trabajo esta semana:");
            String inputUsuario = scanner.nextLine();
            horasTrabajadas = parseInt(inputUsuario);

            if (horasTrabajadas == null){
                continue;
            }
            calculadora(horasTrabajadas);

        }while(horasTrabajadas == null);
    }

    public static Integer parseInt(String inputUsuario){

        try {
            return Integer.parseInt(inputUsuario);
        } catch(NumberFormatException error) {
            return null;
        }
    }

    public static void calculadora(Integer horasTrabajadas){

        Double valorHora = 875.0;
        Double valorHoraExtra = (valorHora * 0.50) + valorHora;
        Integer horasLegalesSemanal = 40;

        if (horasTrabajadas <= 40) {
            System.out.println("usted gano " + (horasTrabajadas * valorHora) + " pesos, no trabajo horas extras.");
        } else {
            Integer horasExtras = horasTrabajadas - 40;
            Double gananciaHorasLegales = horasLegalesSemanal * valorHora;
            Double gananciaHorasExtras = horasExtras * valorHoraExtra;
            System.out.println("usted gano " + (gananciaHorasLegales + gananciaHorasExtras) + " pesos, trabajo " + horasExtras + " horas extra.");
        }
    }
}