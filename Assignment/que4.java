// Create a class BankAccount with deposit and withdraw methods. Use constructor to set account number and initial balance
class BankAccount{

    public String accountNo;
    public double intlBlance;
    public double newBalance;
    public double widthraw;

    public BankAccount(String accountNo,double inbal ,double newbal,double wid){
        this.accountNo=accountNo;
        this.intlBlance=inbal;
        this.newBalance=newbal;
        this.widthraw=wid;
    }

    public void deposit(){
        System.out.println("Current balance :"+intlBlance);
        System.out.println("Balance after depositing :"+(intlBlance+newBalance));
    }
    public void withdraw(){
        System.out.println("Balance after widthraw :"+(intlBlance+newBalance-widthraw));
    }
}
public class que4 {
    public static void main(String[] args) {
        BankAccount b=new BankAccount("123456abcuno8267", 50000, 100000, 30000);

        b.deposit();
        b.withdraw();
    }
}
