package Aula2;

import java.util.Scanner;

public class AtvFun3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Contador de caracteres");
        System.out.println("Escreva uma frase");
        String frase = scanner.nextLine();
        System.out.println("Escolha a carectere");
        char caractere = scanner.next().charAt(0);
        int quantidade = contadorCaracteres(frase, caractere);
        System.out.println("O caractere '" + caractere + "' aparece " + quantidade + " vezes na frase.");
        scanner.close();
    }
public static int contadorCaracteres(String frase, char caractere) {
    int contador = 0;
    for (int i = 0; i < frase.length(); i++) {
        if (frase.charAt(i) == caractere) {
            contador++;
        }
    }
    return contador;
}
}
