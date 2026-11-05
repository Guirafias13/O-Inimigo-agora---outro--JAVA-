import java.util.Scanner;

public class Ex07_SomaDosDoisMaiores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double a = scanner.nextDouble();
        System.out.print("Informe o segundo valor: ");
        double b = scanner.nextDouble();
        System.out.print("Informe o terceiro valor: ");
        double c = scanner.nextDouble();

        // Soma dos dois maiores = soma de todos - o menor
        double menor = a;
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }

        double soma = a + b + c - menor;

        System.out.println("A soma dos dois maiores valores é: " + soma);

        scanner.close();
    }
}
