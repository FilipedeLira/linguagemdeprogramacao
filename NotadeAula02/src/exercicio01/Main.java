package exercicio01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um produto para exemplo
        Produto produto = new Produto(101, "Tênis Esportivo", "42", "Preto", 200.0, 10);

        int opcao;
        do {
            System.out.println("\n1 - Exibir Produto");
            System.out.println("2 - Vender Produto");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    produto.exibirDetalhes();
                    break;
                case 2:
                    System.out.print("Quantidade para compra: ");
                    int qtd = scanner.nextInt();

                    System.out.print("Forma de pagamento (Pix, Espécie, Transferência, Débito, Crédito): ");
                    scanner.nextLine();  // Consumir a quebra de linha
                    String formaPagamento = scanner.nextLine();

                    double valorPago = 0;
                    if (formaPagamento.equalsIgnoreCase("Espécie")) {
                        System.out.print("Valor pago: ");
                        valorPago = scanner.nextDouble();
                    }

                    produto.vender(qtd, formaPagamento, valorPago);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

