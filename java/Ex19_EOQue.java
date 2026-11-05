import java.util.Scanner;

public class Ex19_EOQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o lado A: ");
        double a = scanner.nextDouble();
        System.out.print("Informe o lado B: ");
        double b = scanner.nextDouble();
        System.out.print("Informe o lado C: ");
        double c = scanner.nextDouble();

        // Cada lado precisa ser menor que a soma dos outros dois
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }

        scanner.close();
    }
}
