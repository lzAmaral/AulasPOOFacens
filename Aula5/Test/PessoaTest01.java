package Aula5.Test;
import Aula5.Domain.Pessoa;

public class PessoaTest01 {
public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("Lupe", 18);
    pessoa1.Emprestar("Livro de receitas", 30);
    pessoa1.Imprimir();
}
}
