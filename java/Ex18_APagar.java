import java.util.Scanner;

public class Ex18_APagar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double SALARIO_FIXO = 5000.00;
        final double PERCENTUAL_SOBRE_VENDAS = 0.05;

        System.out.print("Número de carros vendidos: ");
        int carros = scanner.nextInt();

        System.out.print("Comissão fixa por carro vendido: R$ ");
        double comissaoFixa = scanner.nextDouble();

        double totalVendas = 0;
        double totalComissaoFixa = 0;
        double totalPercentual = 0;

        System.out.println();
        System.out.println("=== Detalhamento das vendas ===");
        for (int i = 1; i <= carros; i++) {
            System.out.print("Valor da venda " + i + ": R$ ");
            double valorVenda = scanner.nextDouble();

            double percentualDaVenda = valorVenda * PERCENTUAL_SOBRE_VENDAS;

            totalVendas += valorVenda;
            totalComissaoFixa += comissaoFixa;
            totalPercentual += percentualDaVenda;

            System.out.printf("  Venda %d: R$ %.2f | comissão fixa: R$ %.2f | 5%% da venda: R$ %.2f%n",
                    i, valorVenda, comissaoFixa, percentualDaVenda);
        }

        double salarioFinal = SALARIO_FIXO + totalComissaoFixa + totalPercentual;

        System.out.println();
        System.out.println("=== Resumo ===");
        System.out.printf("Salário fixo:               R$ %.2f%n", SALARIO_FIXO);
        System.out.printf("Total de vendas:            R$ %.2f%n", totalVendas);
        System.out.printf("Comissões fixas (%d carros): R$ %.2f%n", carros, totalComissaoFixa);
        System.out.printf("5%% sobre o total vendido:   R$ %.2f%n", totalPercentual);
        System.out.printf("SALÁRIO FINAL:              R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}
