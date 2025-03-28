package exercicio03;

class Produto {
    String nome;
    double preco;
    int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void adicionarEstoque(int quantidade) {
        estoque += quantidade;
        System.out.println(quantidade + " unidades adicionadas. Estoque atual: " + estoque);
    }

    public void vender(int quantidade) {
        if (quantidade > estoque) {
            System.out.println("Estoque insuficiente!");
        } else {
            estoque -= quantidade;
            System.out.println(quantidade + " unidades vendidas. Estoque restante: " + estoque);
        }
    }

    public void exibirEstoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Estoque disponível: " + estoque);
    }
}
