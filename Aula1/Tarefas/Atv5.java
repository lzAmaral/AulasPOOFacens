package Tarefas;
import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impar = new int[10];
        int contPar = 0, contImpar = 0;

        System.out.println("digite 10 nuneros");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                pares[contPar] = numeros[i];
                contPar++;
            } else {
                impar[contImpar] = numeros[i];
                contImpar++;
            }
        }
        System.out.print("Vetor original: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.print("\nVetor PAR: ");
        for (int i = 0; i < contPar; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.print("\nVetor IMPAR: ");
        for (int i = 0; i < contImpar; i++) {
            System.out.print(impar[i] + " ");
        }

        sc.close();
    }

}
