import java.util.Scanner;

// Área do quadrado = lado * lado
public class Ex04a_AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;
        System.out.printf("Área do quadrado: %.2f%n", area);

        scanner.close();
    }
}
