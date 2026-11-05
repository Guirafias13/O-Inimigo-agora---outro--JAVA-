import java.util.Scanner;

public class Ex20_CpfNaNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PERCENTUAL_IMPOSTO = 0.20;

        System.out.print("Nome do produto: ");
        String produto = scanner.nextLine();

        System.out.print("Quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Preço unitário: R$ ");
        double precoUnitario = scanner.nextDouble();

        double valorVenda = quantidade * precoUnitario;

        // Faixas de desconto
        double percentualDesconto;
        if (quantidade <= 5) {
            percentualDesconto = 0.02;
        } else if (quantidade <= 10) {
            percentualDesconto = 0.03;
        } else {
            percentualDesconto = 0.05;
        }

        double desconto = valorVenda * percentualDesconto;
        double imposto = valorVenda * PERCENTUAL_IMPOSTO;
        double totalAPagar = valorVenda - desconto; // conforme o enunciado

        System.out.println();
        System.out.println("========== NOTA FISCAL ==========");
        System.out.println("Produto:         " + produto);
        System.out.println("Quantidade:      " + quantidade);
        System.out.printf("Preço unitário:  R$ %.2f%n", precoUnitario);
        System.out.println("---------------------------------");
        System.out.printf("Valor da venda:  R$ %.2f%n", valorVenda);
        System.out.printf("Desconto (%.0f%%): R$ %.2f%n", percentualDesconto * 100, desconto);
        System.out.printf("Imposto (20%%):   R$ %.2f%n", imposto);
        System.out.println("---------------------------------");
        System.out.printf("TOTAL A PAGAR:   R$ %.2f%n", totalAPagar);
        System.out.println("=================================");

        scanner.close();
    }
}
