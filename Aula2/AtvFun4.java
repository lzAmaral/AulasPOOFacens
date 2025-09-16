package Aula2;

import java.util.Scanner;

public class AtvFun4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de graus celsius para fahrenheit");
        System.out.println("Escreva a temperatura em graus celsius");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsiusParaFahrenheit(celsius);
        System.out.println(celsius + " graus celsius é igual a " + fahrenheit );
        scanner.close();
    }
    public static double celsiusParaFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
        
    }
    
}
