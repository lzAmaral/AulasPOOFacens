package Tarefas;
import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o RA do aluno (0 para encerrar): ");
            int codigo = scanner.nextInt();

            if (codigo == 0) {
                break;
            }

            double somaNotas = 0;
            for (int i = 1; i <= 3; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            double media = somaNotas / 3;
            System.out.println("Código do aluno: " + codigo + " | Média: " + media);
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}