
// public class finalVariable {
//     final int max_value=100;
//     void method(){
//         max_value=10;
//     }
//     public static void main(String[] args) {
//         finalVariable f=new finalVariable();
//         f.method();
//     }
// }




// public class finalVariable {
//     final int max_value;
//     finalVariable(){
//             max_value=194;
//     }

//     void method(){
//         System.out.println(max_value);
//     }

//     public static void main(String[] args) {
//         finalVariable f=new finalVariable();
//         f.method();
//     }
// }




// public class finalVariable {
//     final int Roll_no;
//     finalVariable(int num){
//         Roll_no=num;
//     }

//     void method(){
//         System.out.println(Roll_no);
//     }

//     public static void main(String[] args) {
//         finalVariable f=new finalVariable(252);
//         f.method();
//     }
// }




public class finalVariable {
    static final int Roll_no;
    static{
        Roll_no=252;
    }

    void method(){
        System.out.println(Roll_no);
    }

    public static void main(String[] args) {
        finalVariable f=new finalVariable();
        f.method();
    }
}