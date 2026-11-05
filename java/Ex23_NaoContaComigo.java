public class Ex23_NaoContaComigo {
    public static void main(String[] args) {
        for (int linha = 1; linha <= 20; linha++) {
            StringBuilder texto = new StringBuilder("(" + linha);

            for (int i = 1; i <= 10; i++) {
                texto.append(", ").append(i);
            }

            texto.append(")");
            System.out.println(texto);
        }
    }
}
