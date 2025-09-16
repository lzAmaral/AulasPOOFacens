package Tarefas;
import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaOriginais = 0;
        double somaComAumento = 0;
        int count = 0;

        while (true) {
            System.out.print("Código do produto (negativo para sair): ");
            int codigo = scanner.nextInt();

            if (codigo < 0) break;

            System.out.print("Preço de custo: ");
            double preco = scanner.nextDouble();

            double novoPreco = preco * 1.2;

            System.out.printf("Código: %d | Novo preço: ", codigo, novoPreco);

            somaOriginais += preco;
            somaComAumento += novoPreco;
            count++;
        }

        if (count > 0) {
            System.out.printf("Média dos preços originais: ", somaOriginais / count);
            System.out.printf("Média dos preços com aumento: ", somaComAumento / count);
        } else {
            System.out.println("Nenhum produto inserido.");
        }

        scanner.close();
    }
}
