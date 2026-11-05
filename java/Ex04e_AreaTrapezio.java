import java.util.Scanner;

// Área do trapézio = ((base maior + base menor) * altura) / 2
public class Ex04e_AreaTrapezio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();

        System.out.print("Informe a base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Informe a altura do trapézio: ");
        double altura = scanner.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.printf("Área do trapézio: %.2f%n", area);

        scanner.close();
    }
}
