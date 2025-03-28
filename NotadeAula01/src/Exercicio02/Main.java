package Exercicio02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Multiplicação");
        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + Matematica.soma(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + Matematica.subtracao(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + Matematica.divisao(num1, num2));
                break;
            case 4:
                System.out.println("Resultado: " + Matematica.multiplicacao(num1, num2));
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}

