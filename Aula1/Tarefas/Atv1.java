package Tarefas;
import java.util.Scanner;

public class Atv1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int soma = 0;
        int contador = 0;

        System.out.println("Digite valores inteiros positivos (negativo para encerrar):");
        
        while (true) {
            numero = sc.nextInt();
            
            if (numero < 0) { 
                break;
            }
            
            soma += numero;
            contador++;
        }
        
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média aritmética é: " + media);
        } else {
            System.out.println("Nenhum valor positivo foi digitado.");
        }
        
        sc.close();
    }
}

    