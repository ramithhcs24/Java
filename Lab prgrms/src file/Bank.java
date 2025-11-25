import java.util.Scanner;

class Account{
    String cust_name;
    String acc_num;
    String acctype;
    double balance;

    public void Setdetails(String name , String num , String type , double bal)
    {
        this.cust_name = name ;
        this.acc_num = num;
        this.acctype = type;
        this.balance = bal;
    }

    public void print() {
        System.out.println("Account name: " + cust_name + ", Account number: " + acc_num + ", Account type: " + acctype + ", Current Balance: " + balance);
    }

    public boolean minbalance()
    {
        if(balance<500){
            System.out.println("The balance is below the minimum balance level and 100 fine is imposed ");
            balance = balance -100;
            return true;
        }
        else{
            System.out.println("The balance is above the min balance level");
            return false;
        }
            
        

    }

}

class Savings extends Account {

    public void CI(double P , double r , double n , double t) 
    {
        double amount = P * Math.pow((1+ r/n ), (n*t));
        double compound = amount - P;
        System.out.println("The compound interest obtained is : "+compound);
    }

    public void withdrawl(double amt)
    {
        if(minbalance()==false)
        {
            if(balance-amt >= 500 )
            {
                balance = balance -amt;
                System.out.println("Amount"+amt+"is withdrawn");
                System.out.println("The new balance is : "+balance);
            }
            else{
                System.out.println("Cannot withdraw breaches minimum balance criteria");
            }
        }

        else{
            System.out.println("Cannot withdraw breaches minimum balance criteria ");
        }
    }

    public void deposit(double amt){
        balance = balance + amt;
        System.out.println("Amount "+amt+" has been deposited . The new balance is : "+balance);
    }
}

class Current extends Account{
    public void chequebook(){
        System.out.println("Chequebook is issued ");
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number of accounts you want to enter : ");
        n = sc.nextInt();
        sc.nextLine();
        for(int i=1 ; i<=n ; i++){
            System.out.println("Enter the name of the customer : ");
            String name = sc.nextLine();
            System.out.println("Enter the acccount number : ");
            String num = sc.nextLine();
            System.out.println("Enter the type of the account Savings/Current : ");
            String type = sc.next();
            if(type.equalsIgnoreCase("savings"))
            {
                System.out.println("Enter the balance in the account : ");
                double bal = sc.nextDouble();
                Savings s = new Savings();
                s.Setdetails(name , num, type, bal);
                s.print();
                boolean running = true;
                while(running){
                    System.out.println("Enter the choice \n 1.Compound interest \n 2.Withdrawl \n 3.Deposit \n 4.Exit ");
                    System.out.println("Choice : ");
                    int chose = sc.nextInt();
                    switch (chose) {
                        case 1:
                            System.out.println("Enter Principal , rate , n, time ");
                            double pr=sc.nextDouble();
                            double r = sc.nextDouble();
                            double na = sc.nextDouble();
                            double t = sc.nextDouble();
                            s.CI(pr,r,na,t);
                            break;
                        case 2:
                            System.out.println("Enter the amount to withdraw : ");
                            double w = sc.nextDouble();
                            s.withdrawl(w);
                            break;
                        case 3:
                            System.out.println("Enter the amount to deposit : ");
                            double d = sc.nextDouble();
                            s.deposit(d);
                            break;
                        case 4:
                            running = false;
                            break;
                        default:
                            System.out.println("Invalid choice ");
                            break;
                    }
                }
            }
            else if (type.equalsIgnoreCase("current"))
            {
                System.out.println("Enter the balance in the account : ");
                double bal = sc.nextDouble();
                Current c = new Current();
                c.Setdetails(name, num, type, bal);
                c.print();
                c.chequebook();
            }
            else {
                System.out.println("Invalid choice ");
            }

        }
    }
}
