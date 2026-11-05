import java.util.Scanner;

public class Ex16_OVotoESecreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número total de eleitores: ");
        int total = scanner.nextInt();

        System.out.print("Número de votos brancos: ");
        int brancos = scanner.nextInt();

        System.out.print("Número de votos válidos: ");
        int validos = scanner.nextInt();

        System.out.print("Número de votos nulos: ");
        int nulos = scanner.nextInt();

        if (brancos + validos + nulos > total) {
            System.out.println("Atenção: a soma dos votos é maior que o total de eleitores!");
        }

        double percBrancos = brancos * 100.0 / total;
        double percValidos = validos * 100.0 / total;
        double percNulos = nulos * 100.0 / total;

        System.out.printf("Brancos: %d votos (%.2f%% do total)%n", brancos, percBrancos);
        System.out.printf("Válidos: %d votos (%.2f%% do total)%n", validos, percValidos);
        System.out.printf("Nulos:   %d votos (%.2f%% do total)%n", nulos, percNulos);

        scanner.close();
    }
}
