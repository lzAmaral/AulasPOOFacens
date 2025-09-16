package Aula4;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setCPF("409.575.938-05");
        pessoa.setNome("Luiz Amaral");
        pessoa.setSexo('M');
        pessoa.setIdade(19);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setCPF("440.990.550-00");
        pessoa2.setNome("Thomas Ribeiro");
        pessoa2.setSexo('M');
        pessoa2.setIdade(18);


        pessoa.imprime();
        pessoa.perguntarParaSair();
        System.out.println("-----------------------------------------------------");
        pessoa2.imprime();
        pessoa.perguntarParaSair(); 
        System.out.println("-----------------------------------------------------");


    }

}
