import java.util.Scanner;

public class Tester {
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


		System.out.println("What your first name? ");
		name = teclado.next();
		System.out.println("what is your sector code?");
		int codigoSetor = teclado.nextInt();

		Empregado secondPeople = new Empregado(name, codigoSetor);
		System.out.println("Empregado(a): " + name + "\n" +
				"recebe um salario líquido de: " + secondPeople.calcularSalario(1000, 5)); 
		teclado.close();
		public class TestePessoas {

    public static void main(String[] args) {

        Fornecedor fornecedor1 = new Fornecedor("Gabriel", null, null, 300, 1000);
        System.out.println("Fornecedor >>> "+ fornecedor1.getNome()+" - Saldo "+fornecedor1.obterSaldo());


        Empregado empregado1 =
                new Empregado("Daniel", null, null, 171, 10000, 27.5);
        Empregado empregado2 =
                new Administrador("Antonio", null, null, 171, 10000, 27.5, 500);

        Empregado empregado3 =
                new Operario("Davi", null, null, 171, 10000, 27.5,2000, 10);

        Empregado empregado4 =
                new Vendedor("Julia", null, null, 171, 10000, 27.5,10000, 20);



        System.out.println("Empregado >>> "+ empregado1.getNome()+" - Salario "+empregado1.calcularSalario());
        System.out.println("Empregado >>> "+ empregado2.getNome()+" - Salario "+empregado2.calcularSalario());
        System.out.println("Empregado >>> "+ empregado3.getNome()+" - Salario "+empregado3.calcularSalario());
        System.out.println("Empregado >>> "+ empregado4.getNome()+" - Salario "+empregado4.calcularSalario());


        Pessoa p1 = fornecedor1;
        Pessoa p2 = empregado1;

        if(p1 instanceof Fornecedor) {
            System.out.println("p1 instanceof Fornecedor >>>"+ (p1 instanceof Fornecedor));
            /*
             * cast de tipo, forçando a conversão  e fazendo com que o compilador ignore o erro de conversão
             */
            fornecedor1 = (Fornecedor) p1;
            System.out.println("Fornecedor >>> "+ fornecedor1.getNome()+" - Saldo "+fornecedor1.obterSaldo());
        }



    }
}

	}
}

