package DesafioAnimal;

public class Animal {
 private String nome;
 private String tipo;
 private int idade;
 private int energia;
 private int felicidade;
 private boolean vivo;

    public Animal() {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.energia = 100;
        this.felicidade = 100;
        this.vivo = true;
    }
 
 public void imprimestatus() {
    System.out.println("# Status do Animal #");
     System.out.println("Nome: " + nome);
     System.out.println("Tipo: " + tipo);
     System.out.println("Idade: " + idade);
     System.out.println("Energia: " + energia);
     System.out.println("Felicidade: " + felicidade);
     System.out.println("Vivo: " + vivo);
    }
    
    public boolean checkVivo() {
        if  (!vivo){
            System.out.println(nome + " está morto e não pode realizar ações.");
            return false;
        }
        return vivo;
    }

    public void checkStatus() {
        if (energia <= 0 || felicidade <= 0) {
            vivo = false;
            System.out.println(nome + " morreu.");
        } else {
            vivo = true;
            System.out.println(nome + " está vivo.");
        }
    }
    public void alimentar() {
        if (vivo) {
            energia += 10;
            System.out.println(nome + " foi alimentado.");
        } else {
            System.out.println(nome + " está morto e não pode ser alimentado.");
        }
    }
    
    public void brincar() {
        if (vivo) {
            energia -= 5;
            felicidade += 10;
            System.out.println(nome + " está brincando.");
        } else {
            System.out.println(nome + " está morto e não pode brincar.");
        }
    }
    
    public void dormir() {
        if (vivo) {
            energia += 15;
            System.out.println(nome + " está dormindo.");
        } else {
            System.out.println(nome + " está morto e não pode dormir.");
        }
    }
    
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public int getFelicidade() {
        return felicidade;
    }
    public void setFelicidade(int felicidade) {
        this.felicidade = felicidade;
    }
    public boolean isVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    
    public String getNome() {
       return nome;
    }
    
    public void setNome(String nome) {
       this.nome = nome;
    }
    
    
}
