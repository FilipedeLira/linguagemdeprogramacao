package exercicio02;
public class Main {
    public static void main(String[] args) {
        // Testando hierarquia Médico
        ClinicoGeral clinico = new ClinicoGeral(true, true);
        Cirurgiao cirurgiao = new Cirurgiao(true);

        System.out.println("--- Teste Médico ---");
        clinico.tratarPaciente();
        clinico.receitar();
        cirurgiao.tratarPaciente();
        cirurgiao.fazerIncisao();
    }
}
