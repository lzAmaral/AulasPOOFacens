package Aula5.Domain;

public class Pessoa {
    private String nome;
    private int idade;
    private String livro;
    private int diasDevolucao;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa (String nome, int idade, String livro, int diasDevolucao) {
        this.nome = nome;
        this.idade = idade;
        this.livro = livro;
        this.diasDevolucao = diasDevolucao;
    }

    public void Emprestar(String livro) {
        this.livro = livro;
    }

    public void Emprestar(String livro, int diasDevolucao) {
        this.livro = livro;
        this.diasDevolucao = diasDevolucao;
    }

    public void Imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.livro != null) {
            System.out.println("Livro emprestado: " + this.livro);
            System.out.println("Dias para devolução: " + this.diasDevolucao);
        } else {
            System.out.println("Nenhum livro emprestado.");
        }
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getLivro() {
        return livro;
    }
    public void setLivro(String livro) {
        this.livro = livro;
    }
    public int getDiasDevolucao() {
        return diasDevolucao;
    }
    public void setDiasDevolucao(int diasDevolucao) {
        this.diasDevolucao = diasDevolucao;
    }



}
