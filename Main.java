import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         System.out.print("Enter account number: ");
         int accNo = scanner.nextInt();
         System.out.print("Enter initial balance: ");
         double balance = scanner.nextDouble();

         BankAccount account = new BankAccount(accNo, balance);

         account.show();

         System.out.print("Enter deposit amount: ");
         double depositAmount = scanner.nextDouble();
         account.deposit(depositAmount);
         account.show();

         System.out.print("Enter withdrawal amount: ");
         double withdrawAmount = scanner.nextDouble();
         account.withdraw(withdrawAmount);
         account.show();

         System.out.print("Enter invalid deposit amount (negative value): ");
         double invalidDepositAmount = scanner.nextDouble();
         account.deposit(invalidDepositAmount);
         
     } catch (Exception e) {
         System.out.println("Error: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}
