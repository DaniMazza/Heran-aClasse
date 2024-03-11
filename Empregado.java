
public class Empregado extends Pessoa {

	private int codigoSetor;
	private double salarioBase;
	private double imposto;

	public Empregado(
		String name, String address, String phoneNumber, 
		int codigoSetor, double salarioBase, double imposto) 
	{
		super(name, address, phoneNumber);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	public Empregado(
			String name, 
			int codigoSetor, double salarioBase, double imposto) 
		{
			super(name);
			this.codigoSetor = codigoSetor;
			this.salarioBase = salarioBase;
			this.imposto = imposto;
	}
	public Empregado(
			String name, 
			int codigoSetor) 
		{
			super(name);
			this.codigoSetor = codigoSetor;
	}
	
	public Empregado(
			String name, String address, String phoneNumber, 
			int codigoSetor) 
		{
			super(name, address, phoneNumber);
			this.codigoSetor = codigoSetor;
		}
	
	public double calcularSalario(double salarioBase, double imposto) {
		double salario = salarioBase - (salarioBase * (imposto/100));
		
		return salario;
	}
			


	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

}
