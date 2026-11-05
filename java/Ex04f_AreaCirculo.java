import java.util.Scanner;

// Área do círculo = PI * raio²
public class Ex04f_AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * raio * raio;
        System.out.printf("Área do círculo: %.2f%n", area);

        scanner.close();
    }
}
