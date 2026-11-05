public class Ex15_UmaBrincadeiraSobreAlturas {
    public static void main(String[] args) {
        // Usamos centímetros (inteiros) para evitar erros de arredondamento com decimais
        int anacleto = 150;   // 1,50 m
        int felisberto = 110; // 1,10 m
        int anos = 0;

        while (felisberto <= anacleto) {
            anacleto += 2;
            felisberto += 3;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para Felisberto ser maior que Anacleto.");
        System.out.println("Anacleto: " + anacleto + " cm | Felisberto: " + felisberto + " cm");
    }
}
