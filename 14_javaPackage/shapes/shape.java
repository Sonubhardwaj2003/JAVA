// Create a package shapes that contains three classes: Circle, Rectangle, and Square. Each class should have methods to calculate the area. Create a main class outside the package to access all three classes and display their areas.
package shapes;

class Circle{
    // public int radius;
    public  double area(int radius){
        return Math.PI*radius*radius;
    }
}

class Reactangle{
    // public int len;
    // public int bre;
    public int area(int len,int bre){
        return len*bre;
    }
}

class Square{
    // public int side;
    public int area(int side){
        return side*side;
    }

}

public class shape {
    public static void main(String[] args) {
        
    }
}
