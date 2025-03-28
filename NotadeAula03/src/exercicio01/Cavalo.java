package exercicio01;
class Cavalo extends Animal {
    private String raca;

    public Cavalo(float tamanho, String cor, String raca) {
        super(tamanho, cor);
        this.raca = raca;
    }

    public void fugir() {
        System.out.println("O cavalo está fugindo!");
    }
}