package Revisão;
import java.util.Scanner;

public class ex2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("[1]- Cadastro\n[2]- Busca\n[3]- Apagar\n[4]- Sair");
    int opcao = scanner.nextInt();

    switch (opcao) {
        case 1:
        System.out.println("Cadastrando...");
            break;
        case 2:    
        System.out.println("Buscando...");
            break;
        case 3:
        System.out.println("Apagando...");
            break;
        case 4:
        System.out.println("Saindo...");
            break;
        default:
        System.out.println("Opção inválida.");
    }
}
}
