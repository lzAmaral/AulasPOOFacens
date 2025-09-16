package Aula2;

import java.util.Scanner;

public class AtvFun2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verificar se o numero é par");
        System.out.println("Escreva um numero");
        int num = scanner.nextInt();
        Boolean resultado = verificarPar(num);
        if (resultado) {
            System.out.println("O numero " + num + " é par.");
        } else {
            System.out.println("O numero " + num + " é impar.");
        }
        scanner.close();
    }

    public static Boolean verificarPar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
