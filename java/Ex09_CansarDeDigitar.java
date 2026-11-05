import java.util.Scanner;

public class Ex09_CansarDeDigitar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[10];
        double soma = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Informe o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
            soma += valores[i];
        }

        System.out.println("Números informados:");
        for (double valor : valores) {
            System.out.println(valor);
        }

        double media = soma / valores.length;
        System.out.printf("Média aritmética: %.2f%n", media);

        scanner.close();
    }
}
