package Packagess;
import shapes.circle;
import shapes.rectangle;
import shapes.square;

public class useShapes {
    public static void main(String[] args) {
        circle c=new circle();
        rectangle r=new rectangle();
        square s=new square();

        System.err.println(c.area(5));
        System.out.println(r.area(10, 20));
        System.out.println(s.area(5));
    }
}
