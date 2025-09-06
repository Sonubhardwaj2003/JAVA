import java.util.HashMap;
import java.util.LinkedHashMap;

public class _3mapInterface {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        HashMap<Integer,String> m=new HashMap();
        m.put(1, "Sonu");
        m.put(2, "Ram");
        m.put(3, "Aman");
        System.out.println(m);


        LinkedHashMap<String,String> lhm=new LinkedHashMap<>();
        lhm.put("Sonu", "252");
        lhm.put("Sumit", "253");
        lhm.put("Sunil", "254");
        lhm.put("Aman", "252");
        lhm.put(null, null);
        System.out.println(lhm);
    }
}
