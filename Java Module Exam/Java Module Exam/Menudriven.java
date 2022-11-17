import java.util.*;

class BankAccount1
{
    int accno;
    double balance;
    Scanner sc=new Scanner(System.in);

    BankAccount1(int  a,double b)
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

public class Menudriven {
    public static void main(String[] args) {
        BankAccount1 Bank=new BankAccount1(12345,5000);
        Scanner sc=new Scanner(System.in);
        String x="";

        while(true) {
            System.out.println("===================================================");
            System.out.println("1.Show Balance\n2.Withdraw\n3.Deposit amount\nPress 0 to Exit");
            System.out.println("Enter Your Choice");
            int n = sc.nextInt();

            if (n == 0) {
                break;
            } else {
                switch (n) {
                    case 1:
                        Bank.show();
                        break;
                    case 2:
                        try {
                            Bank.withdraw();
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        break;
                    case 3:
                        Bank.deposit();
                        break;
                    default:
                        System.out.println("Invalid Input");

                }
            }


        }

    }
}
