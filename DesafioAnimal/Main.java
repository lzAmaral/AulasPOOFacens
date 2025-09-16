package DesafioAnimal;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Animal();
        cachorro.setNome("Rex");
        cachorro.setTipo("Cachorro");
        cachorro.setIdade(3);
        cachorro.setEnergia(50);
        cachorro.setFelicidade(50);
        cachorro.checkStatus();
        cachorro.imprimestatus();

        cachorro.brincar();
        cachorro.alimentar();
        cachorro.dormir();
        cachorro.imprimestatus();

        Animal gato = new Animal();
        gato.setNome("Mia");
        gato.setTipo("Gato");
        gato.setIdade(2);
        gato.setEnergia(30);
        gato.setFelicidade(30);
        gato.checkStatus();
        gato.imprimestatus();

        gato.brincar();
        gato.alimentar();
        gato.dormir();
        gato.imprimestatus();
    }

}
