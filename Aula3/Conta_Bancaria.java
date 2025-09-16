package Aula3;

public class Conta_Bancaria {
    private String id;
    private double saldo;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para imprimir o saldo
    public void imprimir() {
        System.out.println("Saldo atual: R$" + saldo);
    }

}