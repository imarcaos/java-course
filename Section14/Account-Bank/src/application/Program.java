package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING - É atribuir uma variável/objeto de SubClass(BusinessAccount) para a SuperClass(Account)
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING - É converter um objeto da SuperClass para a SubClass
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		// a seguir ja posso fazer uma operação loan() que pertence a BusinessAccount
		// que seria inexistente no caso do acc3
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		// a linha acima causa um erro não detectado pelo compilador, então fazemos como os if's a seguir para testar
		// no if a seguir ele falha executando a outra que esta correta
		
		//este falha
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		//certo
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

	}

}
