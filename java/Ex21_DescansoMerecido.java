import java.time.Year;
import java.util.Scanner;

public class Ex21_DescansoMerecido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código do empregado: ");
        int codigo = scanner.nextInt();

        System.out.print("Ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Ano de ingresso na empresa: ");
        int anoIngresso = scanner.nextInt();

        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;

        System.out.println();
        System.out.println("Empregado: " + codigo);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

        // Basta satisfazer UM dos três requisitos
        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }

        scanner.close();
    }
}
