package shapes;

public class rectangle {
    public int area(int len,int bre){
        return len*bre;
    }
    public static void main(String[] args) {
        rectangle r=new rectangle();
        System.out.println(r.area(10, 20));
    }
}
