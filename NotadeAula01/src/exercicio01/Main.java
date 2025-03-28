package exercicio01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        a.setNome  (sc.next());

        System.out.println("Digite a Nota 01: ");
        a.setNota1 (sc.nextDouble());
        sc.nextLine();

        System.out.println("Digite a Nota 01: ");
        a.setNota2 (sc.nextDouble());
        sc.nextLine();

        System.out.println("Digite a Nota 01: ");
        a.setNota3 (sc.nextDouble());
        sc.nextLine();

        a.calculaMedia();
        a.situacaoAluno();


        System.out.println("A média final foi: " + a.getMedia());


    }
}
