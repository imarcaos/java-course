package entities;

public class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount( ) {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		 balance += balance * interestRate;
	}
	
	// aqui entra o @Override para sobrescrever a função withdraw da Classe mãe Account, visto a Classe
	// SavingsAccount não ter taxas para levantamento.
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
