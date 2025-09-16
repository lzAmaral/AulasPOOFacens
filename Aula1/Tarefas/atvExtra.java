package Tarefas;
import java.util.Scanner;

public class atvExtra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas foram entrevistadas? ");
        int totalPessoas = scanner.nextInt();

        int somaIdades = 0;
        double somaAlturasMulheres = 0;
        int contadorMulheres = 0;
        int somaIdadesHomens = 0;
        int contadorHomens = 0;
        int contadorIdade18a35 = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("\nPessoa " + i);

            int sexo;
            do {
                System.out.print("Sexo (0 - feminino, 1 - masculino): ");
                sexo = scanner.nextInt();
            } while (sexo != 0 && sexo != 1);

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();

            somaIdades += idade;

            if (sexo == 0) {
                somaAlturasMulheres += altura;
                contadorMulheres++;
            } else {
                somaIdadesHomens += idade;
                contadorHomens++;
            }

            if (idade >= 18 && idade <= 35) {
                contadorIdade18a35++;
            }
        }

        double mediaIdadeGrupo = (double) somaIdades / totalPessoas;
        double mediaAlturaMulheres = contadorMulheres > 0 ? somaAlturasMulheres / contadorMulheres : 0;
        double mediaIdadeHomens = contadorHomens > 0 ? (double) somaIdadesHomens / contadorHomens : 0;
        double percentual18a35 = ((double) contadorIdade18a35 / totalPessoas) * 100;

        System.out.println("Resultados da Pesquisa ===");
        System.out.printf("a) Média da idade do grupo: ", mediaIdadeGrupo);
        System.out.printf("b) Média da altura das mulheres: ", mediaAlturaMulheres);
        System.out.printf("c) Média da idade dos homens: ", mediaIdadeHomens);
        System.out.printf("d) Percentual com idade entre 18 e 35 anos: ", percentual18a35);

    }
}
