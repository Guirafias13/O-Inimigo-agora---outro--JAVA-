import java.util.Scanner;

public class Ex24_JornadaDeTrabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int HORAS_SEMANA = 40;
        final int SEMANAS_NO_MES = 4;
        final int HORAS_REGULARES_MES = HORAS_SEMANA * SEMANAS_NO_MES; // 160 horas
        final double ACRESCIMO_HORA_EXTRA = 1.5; // hora regular + 50%

        System.out.print("Horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Salário por hora: R$ ");
        double valorHora = scanner.nextDouble();

        double horasRegulares = Math.min(horasTrabalhadas, HORAS_REGULARES_MES);
        double horasExtras = Math.max(0, horasTrabalhadas - HORAS_REGULARES_MES);

        double salarioRegular = horasRegulares * valorHora;
        double salarioExtras = horasExtras * valorHora * ACRESCIMO_HORA_EXTRA;
        double salarioTotal = salarioRegular + salarioExtras;

        System.out.printf("Horas regulares: %.1f (R$ %.2f)%n", horasRegulares, salarioRegular);
        System.out.printf("Horas extras:    %.1f (R$ %.2f)%n", horasExtras, salarioExtras);
        System.out.printf("Salário total:   R$ %.2f%n", salarioTotal);

        scanner.close();
    }
}
