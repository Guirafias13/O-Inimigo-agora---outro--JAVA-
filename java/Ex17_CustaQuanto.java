import java.util.Scanner;

public class Ex17_CustaQuanto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PERCENTUAL_DISTRIBUIDOR = 0.28;
        final double PERCENTUAL_IMPOSTOS = 0.45;

        System.out.print("Informe o custo de fábrica do carro: R$ ");
        double custoFabrica = scanner.nextDouble();

        // Distribuidor e impostos incidem sobre o custo de fábrica
        double distribuidor = custoFabrica * PERCENTUAL_DISTRIBUIDOR;
        double impostos = custoFabrica * PERCENTUAL_IMPOSTOS;
        double custoFinal = custoFabrica + distribuidor + impostos;

        System.out.printf("Custo de fábrica:          R$ %.2f%n", custoFabrica);
        System.out.printf("Distribuidor (28%%):        R$ %.2f%n", distribuidor);
        System.out.printf("Impostos (45%%):            R$ %.2f%n", impostos);
        System.out.printf("Custo final ao consumidor: R$ %.2f%n", custoFinal);

        scanner.close();
    }
}
