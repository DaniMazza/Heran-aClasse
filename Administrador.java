public class Administrador  extends  Empregado {

    private  double ajudaDeCusto;

    public Administrador() {
    }

    public Administrador(
    		String name, String address, String phoneNumber,
    		int codigoSetor, double salarioBase, double imposto, 
    		double ajudaDeCusto) {
        super(name, address, phoneNumber, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(
            String name, int codigoSetor, double salarioBase, double imposto,
            double ajudaDeCusto)
    {
        super(name, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }
    public Administrador(
            String name, 
            int codigoSetor,
            double ajudaDeCusto)
    {
        super(name, codigoSetor);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(
    		String name, String address, String phoneNumber, 
            int codigoSetor,
            double ajudaDeCusto)
    {
        super(name, address, phoneNumber, codigoSetor);
        this.ajudaDeCusto = ajudaDeCusto;
    }


    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
}
