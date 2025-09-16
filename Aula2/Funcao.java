package Aula2;

import java.util.Scanner;

public class Funcao {
    public static void main(String[] args) {

        
    }

    public static void soma() {
        Scanner scanner = new Scanner(System.in);
                System.out.println("Calculadora de soma");
                System.out.println("Escreva o primeiro Numero");
                int num1 = scanner.nextInt();
                System.out.println("Escreva o segundo Numero");
                int num2 = scanner.nextInt();
                int soma = num1 + num2;
                System.out.println("A soma dos numeros é: " + soma);
                scanner.close();
    }
}
