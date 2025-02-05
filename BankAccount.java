
public class BankAccount {
	
	
	   
	    int accNo;       
	    double balance;    
	     public BankAccount(int accNo, double balance) throws Exception {
	        if (balance < 0) {
	            throw new Exception("Invalid amount");
	        }
	        this.accNo = accNo;
	        this.balance = balance;
	    }

	     public void deposit(double amount) throws Exception {
	        if (amount <= 0) {
	            throw new Exception("Invalid amount entered");
	        }
	        balance += amount;
	        System.out.println("Deposited Rs: " + amount);
	    }

	    public void withdraw(double amount) throws Exception {
	        if (amount <= 0) {
	            throw new Exception("invalid withdrawal amount");
	        }
	        if (amount > balance) {
	            throw new Exception("Low balance In your account");
	        }
	        balance -= amount;
	        System.out.println("Withdrawn: " + amount);
	    }

	    public void show() {
	        System.out.println(" your account Number: " + accNo);
	        System.out.println("your current Balance Rs.: " + balance);
	    }

		public int getAccNo() {
			
			return 0;
		}
	
	

}
	

