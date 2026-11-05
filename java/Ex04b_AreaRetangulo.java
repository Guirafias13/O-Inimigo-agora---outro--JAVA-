import java.util.Scanner;

// Área do retângulo = base * altura
public class Ex04b_AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Informe a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        System.out.printf("Área do retângulo: %.2f%n", area);

        scanner.close();
    }
}
