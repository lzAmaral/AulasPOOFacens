package Aula5.Test;

import java.util.Scanner;

import Aula5.Domain.Pocao;

public class PocaoTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pocao pocao1 = null;

        while (true) {
            while (true) {
                System.out.println("\n===== MENU =====");
                System.out.println("1 - Cadastrar Poção");
                System.out.println("2 - Escolher Poção");
                System.out.println("3 - Usar Poção");
                System.out.println("4 - Mostrar Status da Poção");
                System.out.println("5 - Descartar Poção");
                System.out.println("6 - Sair");

                System.out.print("Escolha: ");
                int opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcao == 1) {
                    System.out.print("Digite o nome da poção: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o poder da poção (0-100): ");
                    int poder = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o tipo da poção: ");
                    String tipo = scanner.nextLine();
                    pocao1 = new Pocao(nome, poder, tipo);
                    System.out.println("Poção cadastrada com sucesso!");
                } else if (opcao == 2) {
                    if (pocao1 == null) {
                        System.out.println("Nenhuma poção cadastrada. Cadastre uma poção primeiro.");
                    } else {
                        System.out.println("Poção selecionada: " + pocao1.getNome());
                    }
                } else if (opcao == 3) {
                    if (pocao1 == null) {
                        System.out.println("Nenhuma poção cadastrada. Cadastre uma poção primeiro.");
                    } else {
                        System.out.print("Digite o alvo para usar a poção: ");
                        String alvo = scanner.nextLine();
                        System.out.print("Digite quantas vezes deseja usar a poção: ");
                        int vezes = scanner.nextInt();
                        pocao1.Usar(alvo, vezes);
                        System.out.println("O dano foi de " + pocao1.getPoder() * vezes);
                    }
                } else if (opcao == 4) {
                    if (pocao1 == null) {
                        System.out.println("Nenhuma poção cadastrada. Cadastre uma poção primeiro.");
                    } else {
                        System.out.println("##Status da Poção##");
                        pocao1.Status();
                        System.out.println("##################");
                    }
                } else if (opcao == 5) {
                    if (pocao1 == null) {
                        System.out.println("Poção descartada com sucesso!");
                }
                    pocao1 = null;
                } else if (opcao == 6) {
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;
                } else {
                    System.out.println("Opção inválida!");
                }

            }

        }
    }
}
