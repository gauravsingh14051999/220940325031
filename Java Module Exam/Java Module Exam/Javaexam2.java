import java.util.*;

class BankAccount
{
    int accno;
    double balance;
    Scanner sc=new Scanner(System.in);

    BankAccount(int  a,double b)
    {
        this.accno=a;
        this.balance=b;
    }
    void withdraw() throws Exception
    {
        double amount;

        System.out.println("Enter withdrawal amount");
        amount=sc.nextInt();
        if(balance>=amount)
        {
            balance=balance-amount;
            System.out.println("Remaining Balance is "+balance);

        }
        else {
            throw new  Exception("Not Sufficient balance");
        }

    }
    void deposit()
    {
        int amount;
        System.out.println("Enter Deposit amount");
        amount=sc.nextInt();
        if(amount>=0)
        {
            balance=balance+amount;
            System.out.println("Balance is "+balance);
        }
        else{
            System.out.println("Invalid amount");
        }

    }
    void show()
    {
        System.out.println("Account No. is  "+accno+" Balance is "+balance );
    }

}

public class Javaexam2 {
    public static void main(String[] args) {
        BankAccount Bank=new BankAccount(12345,5000);
        Scanner sc=new Scanner(System.in);
        Bank.show();
        Bank.deposit();
        Bank.show();
        try
        {
            Bank.withdraw();
        }
        catch(Exception b)
        {
            System.out.println(b);
        }
        Bank.show();

    }
}
