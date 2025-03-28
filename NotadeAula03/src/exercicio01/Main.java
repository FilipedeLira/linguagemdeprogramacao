package exercicio01;
public class Main {
    public static void main(String[] args) {
        // Testando hierarquia Animal
        Cavalo cavalo = new Cavalo(1.5f, "Marrom", "Mangalarga");
        Leao leao = new Leao(1.2f, "Dourado", true);

        System.out.println("--- Teste Animal ---");
        cavalo.comer();
        cavalo.fugir();
        leao.comer();
        leao.cacar();

    }
}
