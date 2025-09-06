import java.util.*;

public class _2sortedSet {
    public static void main(String[] args) {
        SortedSet<String> ss=new TreeSet<>();
        // TreeSet<String> ss=new TreeSet<>();

        ss.add("Sonu");
        ss.add("Shivang");
        ss.add("Amit");
        ss.add("Sonu");
        ss.add("Ram");

        System.out.println(ss);
        
        System.out.println(ss.reversed());

        ss.remove("Sonu");
        System.out.println(ss);

        System.out.println("Iterator elements:");
        Iterator<String> it=ss.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Iterator<String> rev=((TreeSet<String>) ss).descendingIterator();
        System.out.println("Reverse Iterator Element :");
        while(rev.hasNext()){
            System.out.println(rev.next());
        }

    }
}
