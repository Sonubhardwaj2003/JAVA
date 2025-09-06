// Create a package named mathoperations that contains a class Addition with a method add(int a, int b) which returns the sum of two numbers. Create another class in a different file to use this package and display the result.


package mathOperation;

public class Addition {
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Addition a=new Addition();
        System.out.println(a.add(10,20));
    }
}
