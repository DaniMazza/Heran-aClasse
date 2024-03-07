import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("What your first name? ");
        String name = teclado.next();
        System.out.println("How much credit do you have??");
        double credValue = teclado.nextDouble();
        System.out.println("How much debt do you have??");
        double debtValue = teclado.nextDouble();


        Fornecedor firstPeople = new Fornecedor(name, credValue, debtValue);
        double saldo = firstPeople.obterSaldo(credValue, debtValue);
        System.out.println("O fornecedor " + firstPeople.getName() + " tem um saldo de: " + saldo);


    }
}
