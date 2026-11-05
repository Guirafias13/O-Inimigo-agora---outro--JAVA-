import java.util.Scanner;

// Área do triângulo = (base * altura) / 2
public class Ex04c_AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Informe a altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        System.out.printf("Área do triângulo: %.2f%n", area);

        scanner.close();
    }
}
