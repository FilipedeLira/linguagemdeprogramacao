package exercicio01;
class Animal {
    protected float tamanho;
    protected String cor;

    public Animal(float tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public void comer() {
        System.out.println("O animal está comendo.");
    }
}




