package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		
		/*// Teste para _UpCasting e DownCasting
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
		
		// este falha
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		// certo
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		*/ // fim Teste para _UpCasting e DownCasting
		
		/* // Teste para o método @Override
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println("Valor Account Comum -> " + acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println("Valor SavingsAccount Poupança -> " + acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println("Valor BusinessAccount Poupança -> " + acc3.getBalance());
		*/
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		// Polimorfismo significa muitas formas com comportamentos diferentes, no exemplo abaixo
		// as variáveis são da mesma forma, mas com comportamentos diferentes.
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}

}
