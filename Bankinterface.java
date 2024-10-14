import java.util.*;
class Bank
{
  int amount,withdrawamount;
  String name;
  
    void deposit(int amount)
    {
        this.amount=amount;
        System.out.println("Amount deposited"+amount);
    }
    void withdrawal(int withdrawamount)
    {
        this.withdrawamount=withdrawamount;
        System.out.println("Sufficient balance:"+amount);
        if(withdrawamount<=amount)
        {
        amount=amount-withdrawamount;
        System.out.println("Amount after withdrawal"+amount);
        }
        else
        {
        	System.out.println("Insufficient balance");
        }
    }
    void display(String name)
    {
        this.name=name;
        System.out.println("Account holder name:"+name+"  \n "+"Amount:"+amount);
    }
    public static void main(String args[])
    {
           int choice;
           int amount,withdrawamount;
           String name;
           Scanner sc=new Scanner(System.in);
            long num;
            System.out.println("---Welcome----");
           System.out.println("Enter your account number");
           num=sc.nextInt();
           Bank obj=new Bank();
           while(num!=0)
      {
           System.out.println("Enter choice"+"\n"+"1.Deposit money"+"\n"+"2.Withdraw amount"+"\n"+"3.Check balance" );
           choice =sc.nextInt();
           switch(choice)
           {
               case 1:System.out.println("enter deposit amount");
               amount=sc.nextInt();
               obj.deposit(amount);
               break;
               case 2:System.out.println("enter   withdrawal amount");
               withdrawamount=sc.nextInt();
             obj .withdrawal(withdrawamount);
              break;
              case 3:System.out.println("enter Account holder name");
              name=sc.next();
              obj. display( name);
              default: System.out.println("---Thankyou Visit Again🙏----");
              break;
           }
      }
    }
}