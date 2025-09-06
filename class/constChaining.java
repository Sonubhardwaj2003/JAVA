class constCha1{
    public static String name;
    public static int sallary;
    public static String Address;

    public constCha1(){
        this("Sonu Bhardwaj", sallary, Address);
    }

    // public constCha1(String string) {
    //    this("");
    // }

    @SuppressWarnings("static-access")
    public constCha1(String n,int sal,String add){
        this.name=n;
        this.sallary=sal;
        this.Address=add;
    }

    public void display() {
        System.out.println(name);
        System.out.println(sallary);
        System.out.println(Address);
    }

}
public class constChaining {
    public static void main(String[] args) {
        constCha1 c=new constCha1();
        c.display();
    }
}
