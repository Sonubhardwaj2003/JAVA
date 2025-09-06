package threading;
// class up extends Thread{
//     public void run(){
//         System.out.println("class up:");
//     }
// }
// public class synchronizes {
//     public static void main(String[] args) {
//         up u=new up();
//         u.start();
//         System.out.println(u.getPriority());
//         u.setPriority(2);
//         System.out.println(u.getPriority());
//     }
// }



import java.util.Scanner;

// import Account;

class Account {
    private int bal;

    public Account(int bal) {
        this.bal = bal;
    }
    public Boolean isSufficientBalance(int w){
        if(bal>w){
            return true;
        }
        else
        {
            return false;
        }
    }
    public void withdraw(int amt){
        bal=bal-amt;
        System.out.println("withdraw money is:"+amt);
        System.out.println("current balance is:"+bal);
    }
}
class Customer implements Runnable{
    private String name;
    private Account account;
    public Customer(Account account,String n){
        this.account=account;
        name=n;
    }
    @SuppressWarnings("resource")
    public void run(){
        Scanner kb=new Scanner(System.in);
        System.out.println(name+"Enter the ammount to withdraw");
        int amt=kb.nextInt();
        synchronized(account){

            if(account.isSufficientBalance(amt)){
                System.out.println(name);
                account.withdraw(amt);
            }
            else
            {
                System.out.println("insufficient balance");
            }
        }
    }
}
public class synchronizes {
    public static void main(String[] args) {
        
        Account a=new Account(1000);
        Customer o1=new Customer(a, "raj");
        Customer o2=new Customer(a, "simran");
        Thread t1=new Thread(o1);
        Thread t2=new Thread(o2);
        t1.start();
        t2.start();

    }
}
