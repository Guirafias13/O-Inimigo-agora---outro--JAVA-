public class Ex11_Booommm {
    public static void main(String[] args) throws InterruptedException {
        for (int segundos = 30; segundos >= 0; segundos--) {
            System.out.println(segundos);
            Thread.sleep(1000); // espera 1 segundo entre cada número
        }

        System.out.println("EXPLOSÃO");
    }
}
