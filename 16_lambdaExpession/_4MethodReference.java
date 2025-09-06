// method reference to a Static method
@FunctionalInterface
interface MyLambda
{
    void display(String msg);
}

public class _4MethodReference {
    
    public static void display(String msg)
    {
        System.out.println(msg);
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        
        // MyLambda m=_4MethodReference::display();  //call using this syntex '::' is method reference to the method display.
        // m.display("Hello java!");

        _4MethodReference m=new _4MethodReference();
        m.display("Hello java");
        
    }
    
}



// to constructer
// @FunctionalInterface
// interface MyLambda
// {
//     void display(String msg);
// }

// class my {
//     public  void display(String msg)
//     {
//         System.out.println(msg);
//     }
// }

// public class _4MethodReference {
    
//     @SuppressWarnings("static-access")
//     public static void main(String[] args) {
        
//         MyLambda m=my::new;  //call using this syntex '::' is method reference to the method display.
//         m.display("Hello java!");

//     }
    
// }
