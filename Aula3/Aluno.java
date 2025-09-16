package Aula3;

public class Aluno {
    private String ra; //ATRIBUTOS
    private String nome; //ATRIBUTOS
    private String curso; //ATRIBUTOS

    public void imprime(){
        System.out.println("RA: "+ra);
        System.out.println("Nome: "+nome);
        System.out.println("Curso: "+curso);
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
