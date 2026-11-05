import java.util.Scanner;

public class Ex07_1_SomaDosDoisMaiores5Valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maior1 = Double.NEGATIVE_INFINITY; // o maior de todos
        double maior2 = Double.NEGATIVE_INFINITY; // o segundo maior

        for (int i = 1; i <= 5; i++) {
            System.out.print("Informe o valor " + i + ": ");
            double valor = scanner.nextDouble();

            if (valor > maior1) {
                maior2 = maior1;
                maior1 = valor;
            } else if (valor > maior2) {
                maior2 = valor;
            }
        }

        System.out.println("Os dois maiores são " + maior1 + " e " + maior2);
        System.out.println("A soma dos dois maiores valores é: " + (maior1 + maior2));

        scanner.close();
    }
}
