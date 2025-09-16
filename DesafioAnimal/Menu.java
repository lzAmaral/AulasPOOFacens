package DesafioAnimal;
import java.util.Scanner;
import DesafioAnimal.Animal;
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal = new Animal();

 while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Alimentar");
            System.out.println("3 - Brincar");
            System.out.println("4 - Dormir");
            System.out.println("5 - Mostrar Status");
            System.out.println("0 - Sair (só se o animal morrer)");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o nome do animal: ");
                String nome = sc.nextLine();
                System.out.print("Digite a idade do animal: ");
                int idade = sc.nextInt();
                animal = new Animal( );
                System.out.println("Animal cadastrado com sucesso!");
            } else if (animal == null) {
                System.out.println("Cadastre um animal primeiro!");
            } else {
                switch (opcao) {
                    case 2 -> animal.alimentar();
                    case 3 -> animal.brincar();
                    case 4 -> animal.dormir();
                    case 5 -> animal.checkStatus();
                    case 0 -> {
                        if ((boolean) animal.checkVivo()) {
                            System.out.println("Programa encerrado.");
                            sc.close();
                            return;
                        } else {
                            System.out.println("O programa só encerra quando o animal morrer!");
                        }
                    }
                    default -> System.out.println("Opção inválida!");
                }

                if (animal.checkVivo() == false) {
                    animal.checkStatus();
                    System.out.println("GAME OVER!");
                    break;
                }
            }
        }
        sc.close();
}
}
