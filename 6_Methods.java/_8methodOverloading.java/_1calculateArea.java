class Test{
    public int area(int l,int b)
    {
        int ans;
        ans=l*b;
        return ans;
    }
    public double area(int r)
    {
        double ans;
        ans=Math.PI*r*r;
        return ans;
    }
    public float area(float h,float b ){
        float ans;
        ans=b*h;
        return ans;
    }
    public float area(float s1,float s2,float h ){
        float ans;
        ans=(s1+s2)*h/2;
        return ans;
    }
}

public class _1calculateArea {
    
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println("area of rectangle is :"+t.area(12, 10));
        System.out.println("area of circle is :"+t.area(7));
        System.out.println("area of parallelogram is :"+t.area(15f, 9f));
        System.out.println("area of trapizum is :"+t.area(15f, 9f,4f));
    }
}
