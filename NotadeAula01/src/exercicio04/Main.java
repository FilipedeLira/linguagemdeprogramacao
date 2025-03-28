package exercicio04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria();
        ContaBancaria contaDestino = new ContaBancaria();

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    minhaConta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    minhaConta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Valor do saque: ");
                    double saque = scanner.nextDouble();
                    minhaConta.sacar(saque);
                    break;
                case 4:
                    System.out.print("Valor da transferência: ");
                    double transferencia = scanner.nextDouble();
                    minhaConta.transferir(contaDestino, transferencia);
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
