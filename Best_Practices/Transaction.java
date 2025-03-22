class Balance{
    
    double balance;

    Balance(double balance){
        this.balance=balance;
    }
    String Add(double amount){
        this.balance+=amount;
        return "Added money !";
    }
    double CheckBalance(){
        return balance;
    }
    String Withdraw(double amount){
        this.balance-=amount;
        return "Money withdrawn";
    }
}
 
class Account extends Balance{
    String Acount_Id;
    String Name;
    Account(String Id, String Name, double balance){
        super(balance);
        Acount_Id=Id;
        this.Name=Name;
    }
    String Withdraw(double amount){
        if(amount>balance){
            return "Withdraw req amount is greater than balance.Plz check again";
        }
        return super.Withdraw(amount);
    }
    

}







public class Transaction {
    public static void main(String[] args){
       Account ac=new Account("0xat1109","Md. Mazharul Islam",1290.09);
       System.out.println("Balance : "+ac.CheckBalance());
       System.out.println("Adding req : " + ac.Add(101.009f));
       System.out.println("Balance : "+ac.CheckBalance());
       System.out.println("Withdraw req : "+ac.Withdraw(508.409234f));
       System.out.println("Withdraw req : "+ac.Withdraw(1000f));
       System.out.println("Balance : "+ac.CheckBalance());
    }
}
