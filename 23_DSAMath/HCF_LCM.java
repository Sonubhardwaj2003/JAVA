public class HCF_LCM {
    public static void main(String[] args) {
        System.out.println("HCF : "+hcf(10000, 10050));
        System.out.println("LCM : "+lcm(10000, 10050));
    }

    // claculate the hcf
    static int hcf(int a,int b){
        while(a!=b){
            if(a>b) {
                a=a-b;
            }else{
                b=b-a;
            }
        }

        return a;
    }

    //calculate lcm
    static int lcm(int a ,int b){
        int hcf=hcf(a, b);
        return (a*b)/hcf;
    }
}
