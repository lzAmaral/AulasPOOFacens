package Aula5.Domain;

public class Pocao {
    private String nome;
    private int poder;
    private String tipo;
    public Object getNome;

    public Pocao(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }

    public Pocao(String nome, int poder, String tipo) {
        this(nome, poder);
        this.tipo = tipo;
    }

    public void Status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Poder: " + this.poder);
        System.out.println("Tipo: " + this.tipo);
    }

    public void Usar() {
        System.out.println("Usando poção " + this.nome);
    }

    public void Usar(String alvo) {
        System.out.println("Usando poção " + this.nome + " em " + alvo);
    }

    public void Usar(String alvo, int vezes) {
        System.out.println("Usando poção " + this.nome + " em " + alvo + " por " + vezes + " vezes.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        if (poder > 100) {
            this.poder = 100;
        } else {
            this.poder = poder;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
