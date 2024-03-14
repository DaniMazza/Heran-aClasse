public class Fornecedor extends Pessoa{
	private double credValue;
	private double debtValue;


	public Fornecedor() {}
	public Fornecedor(String name, String address, String phoneNumber, double credValue, double debtValue){
		super(name, address, phoneNumber);
		this.credValue = credValue;
		this.debtValue = debtValue;
	}
	public Fornecedor(String name, double credValue, double debtValue){
		super(name);
		this.credValue = credValue;
		this.debtValue = debtValue;
	}


	public double obterSaldo(){
		return credValue - debtValue;
	}

	public double getCredValue() {
		return credValue;
	}

	public double getDebtValue() {
		return debtValue;
	}

	public void setDebtValue(double debtValue) {
		this.debtValue = debtValue;
	}

	public void setCredValue(double credValue) {
		this.credValue = credValue;
	}
}
