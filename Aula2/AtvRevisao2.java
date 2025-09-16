package    Aula2;

import java.util.Scanner;

public class AtvRevisao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva em que ano o João nasceu:(Tem que ser antes que 2016)");
        int anoNascimento = scanner.nextInt();
        int idade = 2025 - anoNascimento;
        System.out.println("A idade do João Hoje será:"+idade);
        int idade16 = 2016 - anoNascimento;
        System.out.println("Em 2016 o João tinha:"+idade16);
        scanner.close();

    }
    }