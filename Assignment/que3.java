// Create an abstract class Shape with an abstract method calculateArea(). Implement this method in two subclasses: Rectangle and Triangle
abstract class shape{
    abstract public double calculateArea();
}

class Rectangle extends shape{
    public int len;
    public int bre;

    public Rectangle(int l,int b){
        this.len=l;
        this.bre=b;
    }

    @Override
    public double calculateArea(){
        return len*bre;
    }
}

class Traingle extends shape{
    public int base;
    public int height;

    public Traingle(int b,int h){
        this.base=b;
        this.height=h;
    }

    @Override
    public double calculateArea() {
       return 0.5*(base*height);
    }

}
public class que3 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(10, 20);
        System.out.println("Area of Rectangle is :"+r.calculateArea());

        Traingle t=new Traingle(5, 10);
        System.out.println("Area of Traingle is :"+t.calculateArea());

    }
}
