import java.util.*;

public class _0IteratorInterface {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        Iterator<String> it=al.iterator();

        while(it.hasNext()){
            String n=it.next();
            System.out.println(n);
        }
    }
}
