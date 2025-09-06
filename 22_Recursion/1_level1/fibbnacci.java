public class fibbnacci {
    public static void main(String[] args) {
        // System.out.println(fib(10)); // gives nth fibbnacci term.
        System.out.println(fibboFormula(50));
    }

    //direct formula to find the nth fibbonacci number.(((1+root(5))/2)**n)/root(5);
    static int fibboFormula(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2), n)/Math.sqrt(5));  // gives the nth fibbonacci int just few second.
    }

    static int fib(int n){
        //base condition
        if(n<2){
            return n;
        }

        //recursive condition;
        return fib(n-1)+ fib(n-2);
        // first solve the fib(n-1) part and the solve the fib(n-1) (left >> right) .. in a tree like structure
        // generally not good for large number ,takes time , make call repeating of some part which is also executing in the first left part
    }
}
