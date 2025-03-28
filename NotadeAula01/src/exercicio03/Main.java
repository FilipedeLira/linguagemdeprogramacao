package exercicio03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto("Camiseta", 50.0, 10);

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar estoque");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Exibir estoque");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantidade a adicionar: ");
                    int add = scanner.nextInt();
                    produto.adicionarEstoque(add);
                    break;
                case 2:
                    System.out.print("Quantidade a vender: ");
                    int vender = scanner.nextInt();
                    produto.vender(vender);
                    break;
                case 3:
                    produto.exibirEstoque();
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

