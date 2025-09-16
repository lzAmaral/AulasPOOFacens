package Aula2;

import java.util.Scanner;

public class AtvFun1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("Escreva o operador (+, -, *, /)");
        String operador = scanner.nextLine();
        System.out.println("Escreva o primeiro Numero");
        int num1 = scanner.nextInt();
        System.out.println("Escreva o segundo Numero");
        int num2 = scanner.nextInt();

        int resultado = Calculadora(operador, num1, num2);
        scanner.close();
    }
    public static int Calculadora(String operador, int num1, int num2) {
        int resultado = 0;
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                System.out.println("O resultado da soma é: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case "/":
                if (num2 != 0) {
                    double divResultado = (double) num1 / num2;
                    System.out.println("O resultado da divisão é: " + divResultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operador inválido. Por favor, use +, -, * ou /.");
                break;
        
    }
        return resultado;
    }
}
