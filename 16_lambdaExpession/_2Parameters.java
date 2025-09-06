// @FunctionalInterface
// interface myLembda{
//     public int  add(int x,int y);
// }

// public class _2Parameters {
//     public static void main(String[] args) {
//         myLembda m = (a,b) ->{return a+b;};
//         // myLembda m = (a,b) ->a+b;
//         // even we can return over statement without the use of return keyword.
//         int res=m.add(20, 10);
//         System.out.println(res);
//     }
// }




// default method and static method
@FunctionalInterface
interface myLembda{
    public int  add(int x,int y);

    default void displaY(){  //default method
        System.out.println("Default method excute");
    }

    static void show(){
        System.out.println("Static method execute");
    }
}

public class _2Parameters {
    public static void main(String[] args) {
        myLembda m = (a,b) ->{return a+b;};
        // myLembda m = (a,b) ->a+b;
        // even we can return over statement without the use of return keyword.
        int res=m.add(20, 10);
        System.out.println(res);

        m.displaY();

        myLembda.show();
    }
}





// public class _2Parameters {
//     public static void print(String msg){
//         System.out.println(msg);
//     }
//     public static void main(String[] args) {
//         _2Parameters.print("Heloo java");
        
//     }
// }