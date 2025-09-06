
// // filter()
// import java.util.*;
// import java.util.stream.*;
// public class ex1 {
//     public static void main(String[] args) {
//         List<String>names=Arrays.asList("Sonu","Shivang","Shiddhart","Shailesh","Ram","utkarsh");
//         names.stream().filter(name -> name.startsWith("S")).forEach(System.out::println);
//     }
// }



// //filter() and map()
// import java.util.*;
// import java.util.stream.*;
// public class ex1 {
//     public static void main(String[] args) {
//         List<Integer>number=Arrays.asList(1,2,3,4,5,6,7,8);
//         number.stream().filter(n -> n%2==0).map(n -> n*n).forEach(System.out::println);
//     }
// }



// Sorted()
import java.util.*;
import java.util.stream.*;
@SuppressWarnings("unused")
public class ex1 {
    public static void main(String[] args) {
        List<Integer>number=Arrays.asList(1,4,9,2,0,3,10,30,24,16);
        number.stream().sorted().forEach(System.out::println);
    }
}
