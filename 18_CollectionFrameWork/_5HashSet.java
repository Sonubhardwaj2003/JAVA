import java.util.HashSet;

public class _5HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        // hashset doesnot allowed duplicate value.and give output in any order
        hs.add(10);
        hs.add(5);
        hs.add(20);
        hs.add(10);
        hs.add(30);
        System.out.println(hs);

        // System.out.println(hs.hashCode());
        // System.out.println(hs.remove(10));
        // System.out.println(hs);

        HashSet<Integer> hs1=new HashSet<>();
        // hashset doesnot allowed duplicate value.and give output in any order
        hs1.add(10);
        hs1.add(5);
        hs1.add(20);

        int arr[]=new int[10];

        for(var x:hs){
            if(hs1.contains(x)){
                int i=0;
                arr[i]=x;
                i++;
            }
        }

        for(int z: arr){
            System.out.println(z);
        }
       
    }
}
