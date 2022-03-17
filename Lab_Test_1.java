import java.util.*;
class MinimumBalanceException extends Exception
{
    String er;
    MinimumBalanceException(String er)
    {
        this.er = er;
    }
    public String toString()
	{
		return(er);
		
	}
}
class Account
{
    String AccountHolderName;
    int accNo;
    double balance;
    Account()
    {
        AccountHolderName="";
        accNo=0;
        balance=0;
    }
    Account( String AccountHolderName,int accNo, double balance)
    {
        this.AccountHolderName=AccountHolderName;
        this.accNo=accNo;
        this.balance=balance;
    }
    void withdraw(double withdraw)
    {
        if(balance-withdraw<=500)
        {
            try {
                throw new MinimumBalanceException("Insufficint Balance In the Balance");
            } catch (MinimumBalanceException e) {
                e.printStackTrace();
            }
        }
        else
        balance=balance-withdraw;
    }
    void ShowDetails()
    {
        System.out.println("The Account Holder Name is :"+AccountHolderName);
        System.out.println("The Account Number is :"+accNo);
        System.out.println("The Account Balance is :"+balance);
    }
    void deposit(double deposit)
    {
        balance=balance+deposit;
    }
    void transfer(Account account1, Account account2, double amt)
    {
        if(account1.balance-amt<=500)
        {
            try {
                throw new MinimumBalanceException("Insufficint Balance In the Balance");
            } catch (MinimumBalanceException e) {
                e.printStackTrace();
            }
        }
        else
        {
        account1.balance=account1.balance-amt;
        System.out.println("Transfer Successfull To " + account2.accNo + " and your Account account has been debited with "+ amt +" Current Avaialaibe Balance is "+account1.balance);
        }
    }
}
public class Lab_Test_1 {
    public static void main(String[] args) throws MinimumBalanceException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Account Holder Name  :");
        String AccountHolderName = scanner.nextLine();
        System.out.println("Enter the Account  Number  :");
        int accNo = scanner.nextInt();
        System.out.println("Enter the Balance in the  Account  :");
        double balance = scanner.nextDouble();
        System.out.println("Enter 1 to Deposit ");
        System.out.println("Enter 2 to Withdraw ");
        System.out.println("Enter 3 to Transfer ");
        int choice = scanner.nextInt();
        Account bankAccount = new Account(AccountHolderName,accNo,balance);
        switch (choice) {
            case 1:
                double deposit;
                System.out.println("Enter the Amount to Deposit :");
                deposit=scanner.nextDouble();
                bankAccount.deposit(deposit);
            break;
            case 2:
                double withdraw;
                System.out.println("Enter the Amount to Deposit :");
                withdraw=scanner.nextDouble();
                bankAccount.withdraw(withdraw);
            break;
            case 3:
            Account transferAccount = new Account();
                System.out.println("Enter the Transfer Account Holder Name  :");
                transferAccount.AccountHolderName = scanner.nextLine();
                System.out.println("Enter the Transfer Account  Number  :");
                transferAccount.accNo = scanner.nextInt();
                double trnsframt;
                System.out.println("Enter the Amount to Transfer :");
                trnsframt=scanner.nextDouble();
                bankAccount.transfer(bankAccount, transferAccount, trnsframt);
            break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        bankAccount.ShowDetails();
    }
    
}
