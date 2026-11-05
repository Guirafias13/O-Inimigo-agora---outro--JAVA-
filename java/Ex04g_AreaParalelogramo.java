import java.util.Scanner;

// Área do paralelogramo = base * altura
public class Ex04g_AreaParalelogramo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base do paralelogramo: ");
        double base = scanner.nextDouble();

        System.out.print("Informe a altura do paralelogramo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        System.out.printf("Área do paralelogramo: %.2f%n", area);

        scanner.close();
    }
}
