import java.util.Scanner;

public class Ex25_InvertendoTudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elementos = new String[12];

        System.out.println("Informe 12 elementos (letras ou números), separados por espaço ou Enter:");
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = scanner.next();
        }

        // Saída 1: inverte a posição de todos (primeiro com último, segundo com penúltimo...)
        StringBuilder saida1 = new StringBuilder();
        for (int i = elementos.length - 1; i >= 0; i--) {
            saida1.append(elementos[i]);
            if (i > 0) {
                saida1.append(", ");
            }
        }

        // Saída 2: separa por tipo, cada grupo invertido (números primeiro, depois letras)
        StringBuilder numeros = new StringBuilder();
        StringBuilder letras = new StringBuilder();
        for (int i = elementos.length - 1; i >= 0; i--) {
            StringBuilder destino = elementos[i].matches("-?\\d+") ? numeros : letras;
            if (destino.length() > 0) {
                destino.append(", ");
            }
            destino.append(elementos[i]);
        }

        System.out.println("Saída 1: " + saida1);
        System.out.println("Saída 2: " + numeros + " - " + letras);

        scanner.close();
    }
}
