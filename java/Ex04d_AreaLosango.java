import java.util.Scanner;

// Área do losango = (diagonal maior * diagonal menor) / 2
public class Ex04d_AreaLosango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();

        System.out.print("Informe a diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();

        double area = (diagonalMaior * diagonalMenor) / 2;
        System.out.printf("Área do losango: %.2f%n", area);

        scanner.close();
    }
}
