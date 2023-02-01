package entitieBank;

public class Bank {
	private int numberAccount;
	private String name;
	private double saldoAccount;
	
	public static double BANK_TAX = 5.00;
	
	public Bank(int numberAccount, String name, double initialValue) {
		this.numberAccount = numberAccount;
		this.name = name;
		depositAccount(initialValue);
	}
	
	public Bank(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldoAccount() {
		return saldoAccount;
	}
	public void widthdrawAccount(double value){
		this.saldoAccount -= (value + BANK_TAX);
		
	}
	public void depositAccount(double value) {
		this.saldoAccount += value;
	}
	public String toString() {
		return "Account " + getNumberAccount() + ", Holder: " + getName() + ", Balance: $" + String.format("%.2f", getSaldoAccount());
	}
}
