package Aula2;

import java.util.Scanner;

public class Funcao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva seu first name");
        String firstName = scanner.nextLine();
        System.out.println("Escreva seu last name");
        String lastName = scanner.nextLine();
        NomeCompleto(firstName, lastName);
        scanner.close();
    }

    public static void NomeCompleto(String firstName, String lastName) {
        String completname = firstName + lastName;
        System.out.println("Seu nome completo é: " + firstName + " " + lastName);

        

    }

}
