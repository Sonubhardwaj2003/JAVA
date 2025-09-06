import java.util.ArrayList;

public class _2sebSeqSet {
    public static void main(String[] args) {
        // System.out.println(subSet("", "abc"));

        subSet2("", "abc");
    }

    static ArrayList<String> list=new ArrayList<>();
    static ArrayList<String> subSet(String newStr,String str){
        if(str.isEmpty()){
            list.add(newStr);
            return list;
        }

        char ch=str.charAt(0);

        // Include the character
        subSet(newStr + ch, str.substring(1));
        // Exclude the character
        subSet(newStr, str.substring(1));

        return list;

    }



    static void subSet2(String newStr,String str){
        if(str.isEmpty()){
            System.out.println(newStr);
            return ;
        }

        char ch=str.charAt(0);

        // Include the character
        subSet2(newStr + ch, str.substring(1));
        // Exclude the character
        subSet2(newStr, str.substring(1));

    }

}