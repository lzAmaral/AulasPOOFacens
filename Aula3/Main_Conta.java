package Aula3;
public class Main_Conta {
    public static void main(String[] args) {
        Conta_Bancaria conta1 = new Conta_Bancaria(); 
        conta1.setId("0428-5");
               System.out.println("Conta criada com ID: " + conta1.getId());

        conta1.depositar(500);
        conta1.sacar(550);
        conta1.imprimir();
    }
}