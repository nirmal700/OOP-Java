import java.util.Scanner;

class BankAccount
{
    String AccountHolderName;
    int accNo,balance;
    BankAccount()
    {
        AccountHolderName="";
        accNo=0;
        balance=0;
    }
    BankAccount( String AccountHolderName,int accNo, int balance)
    {
        this.AccountHolderName=AccountHolderName;
        this.accNo=accNo;
        this.balance=balance;
    }
    void deposit()
    {
        Scanner scanner = new Scanner(System.in);
        int deposit;
        System.out.println("Enter the Amount to Deposit :");
        deposit=scanner.nextInt();
        balance=balance+deposit;
    }
    void withdraw()
    {
        Scanner scanner = new Scanner(System.in);
        int withdraw;
        System.out.println("Enter the Amount to Deposit :");
        withdraw=scanner.nextInt();
        balance=balance-withdraw;
    }
    void ShowDetails()
    {
        System.out.println("The Account Holder Name is :"+AccountHolderName);
        System.out.println("The Account Number is :"+accNo);
        System.out.println("The Account Balance is :"+balance);
    }
}
public class BankAccount_A_4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Account Holder Name  :");
        String AccountHolderName = scanner.nextLine();
        System.out.println("Enter the Account  Number  :");
        int accNo = scanner.nextInt();
        System.out.println("Enter the Balance in the  Account  :");
        int balance = scanner.nextInt();
        System.out.println("Enter 1 to Deposit ");
        System.out.println("Enter 2 to Withdraw ");
        int choice = scanner.nextInt();
        BankAccount bankAccount = new BankAccount(AccountHolderName,accNo,balance);
        switch (choice) {
            case 1:
                bankAccount.deposit();
                break;
            case 2:
            bankAccount.withdraw();
        
            default:
            System.out.println("Invalid Choice");
                break;
        }
        bankAccount.ShowDetails();
    }
    
}
