public class Ex22_ContaComigo {
    public static void main(String[] args) {
        int contador = 1; // vai de 1 a 200 continuamente

        for (int linha = 1; linha <= 20; linha++) {
            StringBuilder texto = new StringBuilder("(" + linha);

            for (int i = 1; i <= 10; i++) {
                texto.append(", ").append(contador);
                contador++;
            }

            texto.append(")");
            System.out.println(texto);
        }
    }
}
