package Aula4;

import java.util.Scanner;

public class Pessoa {
    Scanner scanner = new Scanner(System.in);
    private String CPF;
    private String nome;
    private char sexo;
    private int idade;

    public void imprime(){
        System.out.println("CPF: "+CPF);
        System.out.println("Nome: "+nome);
        System.out.println("Sexo: "+sexo);
        System.out.println("Idade: "+idade);
    }
    public void perguntarParaSair() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Deseja sair? (s/n): ");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            System.out.println("Saindo...");
            System.exit(0);
        } else {
            System.out.println("Pessoa 2");
        }
        scanner.close();
    }


    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
