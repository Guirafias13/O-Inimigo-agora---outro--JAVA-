import java.util.Scanner;

public class Ex13_DeQuantoAteQuanto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número (o menor): ");
        int primeiro = scanner.nextInt();

        System.out.print("Informe o segundo número (o maior): ");
        int segundo = scanner.nextInt();

        int soma = 0;
        int quantidade = 0;

        // Percorre do primeiro ao segundo, incluindo os dois
        for (int numero = primeiro; numero <= segundo; numero++) {
            soma += numero;
            quantidade++;
        }

        double media = (double) soma / quantidade;
        System.out.printf("Média de %d até %d: %.2f%n", primeiro, segundo, media);

        scanner.close();
    }
}
