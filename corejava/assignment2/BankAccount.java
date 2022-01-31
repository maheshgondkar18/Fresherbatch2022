package assignment.com;

import java.util.Scanner;

public class BankAccount
{
    private int Balance =0;

    public int getBalance() 
    {
        return Balance;   
        }
   public void setBalance(int balance) 
   {
        Balance = balance;
    
   }

}

class SavingAccount extends BankAccount
{

}

class CurrentAccount{
public int getBalance()
{
       Scanner input = new Scanner(System.in);
        System.out.println("enter the amout to credit");
        int creditedamount = input.nextInt();

        int balance = creditedamount;
        System.out.println("balance"+getBalance());
        return balance;
    }
}
class AccountBalanc {
    public static void main(String[] args) {

        CurrentAccount s =new CurrentAccount();
        s.getBalance();

    }
}
