package PS3package;

public class exceptionTest {

	public static void main(String[] args) {
		
		     Account a = new Account(101);
		      System.out.println("Depositing $500...");
		      a.deposit(500.00);
		      try
		      {
		    	  double withdraw(double money) throws InsufficientFundsException {
		    			if (money <= balance) {
		    				balance -= money;
		    			} else {
		    				double needs = money - balance;
		    				throw new InsufficientFundsException(needs);
		    			}
		         System.out.println("\nWithdrawing $100...");
		         a.withdraw(100.00);
		         System.out.println("\nWithdrawing $600...");
		         a.withdraw(600.00);
		      }catch(InsufficientFundsException e)
		      {
		         System.out.println("Sorry, but you are short $"
		                                  + e.getAmount());
		         e.printStackTrace();
		      }
		    }
		
	}

}
