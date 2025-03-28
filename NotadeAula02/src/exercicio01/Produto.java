package exercicio01;
class Produto {
    private int codigo;
    private String nome;
    private String tamanho;
    private String cor;
    private double valor;
    private int quantidade;

    public Produto(int codigo, String nome, String tamanho, String cor, double valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes() {
        System.out.println("\nProduto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Tamanho/Peso: " + tamanho);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$" + valor);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

    public boolean vender(int qtd, String formaPagamento, double valorPago) {
        if (qtd > quantidade) {
            System.out.println("Estoque insuficiente!");
            return false;
        }

        double valorTotal = valor * qtd;
        double desconto = 0;

        if (formaPagamento.equalsIgnoreCase("Pix") || formaPagamento.equalsIgnoreCase("Espécie") ||
                formaPagamento.equalsIgnoreCase("Transferência") || formaPagamento.equalsIgnoreCase("Débito")) {
            desconto = valorTotal * 0.05;
        }

        double valorFinal = valorTotal - desconto;

        if (formaPagamento.equalsIgnoreCase("Espécie")) {
            if (valorPago < valorFinal) {
                System.out.println("Valor insuficiente para pagamento.");
                return false;
            } else {
                double troco = valorPago - valorFinal;
                System.out.println("Compra realizada com sucesso! Troco: R$" + troco);
            }
        } else if (formaPagamento.equalsIgnoreCase("Crédito")) {
            System.out.println("Compra parcelada em 3x de R$" + (valorFinal / 3));
        } else {
            System.out.println("Compra realizada com sucesso! Total pago: R$" + valorFinal);
        }

        quantidade -= qtd;
        return true;
    }
}
