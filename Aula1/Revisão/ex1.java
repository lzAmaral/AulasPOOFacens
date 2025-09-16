package Revisão;
import java.util.Scanner;

public class ex1 {
public static void main(String[] args) {
    Scanner  scanner= new Scanner(System.in);

    System.out.println("Digite sua idade:");
    int idade = scanner.nextInt();

    if (idade >= 18) {
        System.out.println("Acesso liberado.");
    } else {
        System.out.println("PA acesso negado.");
    }

}
}
