package Tarefas;
import java.util.Scanner;
public class Atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaPares = 0;
        int quantidadePares = 0;
        int numero;

        System.out.println("---CALCULADORA DE MÉDIA DE NÚMEROS PARES---");
        System.out.println("Digite números inteiros positivos para calcular a média dos pares: ");
        System.out.println("Digite 0 para encerrar e ver o resultado. ");

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero != 0 && numero % 2 == 0) {
                somaPares += numero;
                quantidadePares++;
            }

        } while (numero != 0);

        if (quantidadePares > 0) {
            double media = (double) somaPares / quantidadePares;
            System.out.printf("Foram digitados %d números pares. A média dos números pares é: %.2f%n", quantidadePares, media);
        } else {
            System.out.println("Nenhum número par foi digitado. A média não pode ser calculada.");
        }


    }
}
