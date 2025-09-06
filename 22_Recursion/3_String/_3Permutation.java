import java.util.ArrayList;

public class _3Permutation {
    public static void main(String[] args) {
        permutation("", "abc");

        System.out.println(permutation2("", "abc"));


        ArrayList<String> result = new ArrayList<>();
        permutation3("", "abc", result);  // Call the method with empty newStr and full input
        // Print the result
        for (String perm : result) {
            System.out.println(perm);
        }


        ArrayList<String> ans = permutation4("","abc");
        System.out.println(ans);

    }

    //return an individual String , an array of strings
    static void permutation(String newStr,String orignal){
        if(orignal.isEmpty()){
            System.out.println(newStr);
            return;
        }

        char ch=orignal.charAt(0);

        for(int i=0;i<=newStr.length();i++){
            String f=newStr.substring(0, i);
            String s=newStr.substring(i,newStr.length());
            permutation(f+ch+s, orignal.substring(1));
        }
    }


    //return an ArrayList
    static ArrayList<String> list=new ArrayList<>();
    static ArrayList<String> permutation2(String newStr,String orignal){
        if(orignal.isEmpty()){
            list.add(newStr);
            return list;
        }

        char ch=orignal.charAt(0);

        for(int i=0;i<=newStr.length();i++){
            String f=newStr.substring(0, i);
            String s=newStr.substring(i,newStr.length());
            permutation2(f+ch+s, orignal.substring(1));
        }

        return list;
    }



    //pass the ArrayList as an argumnet    
    static void permutation3(String newStr,String orignal,ArrayList<String> list){
        if(orignal.isEmpty()){
            list.add(newStr);
            return ;
        }

        char ch=orignal.charAt(0);

        for(int i=0;i<=newStr.length();i++){
            String f=newStr.substring(0, i);
            String s=newStr.substring(i,newStr.length());
            permutation3(f+ch+s, orignal.substring(1),list);
        }

    }



    // create list each time and add all the list in one  array list at a time
    static ArrayList<String> permutation4(String newStr,String orignal){
        if(orignal.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(newStr);
            return list;
        }

        char ch=orignal.charAt(0);

        ArrayList<String> ans=new ArrayList<>();

        for(int i=0;i<=newStr.length();i++){
            String f=newStr.substring(0, i);
            String s=newStr.substring(i,newStr.length());
            ans.addAll(permutation4(f+ch+s, orignal.substring(1)));
        }

        return ans;
    }
}
