import java.util.ArrayList;

public class _1arrList {
    public static void main(String[] args) {
        ArrayList<String> li=new ArrayList<>();
        li.add("Java");
        li.add("python");
        li.add("C++");
        li.add("JavaScript");
        li.add("DSA");

        System.out.println("Elements of list :");

        for(String s:li){
            System.out.println(s);
        }
        
        System.out.println("Element at index 2 :"+li.get(2));

        li.set(2, "java");
        System.out.println(li);
    }
}
