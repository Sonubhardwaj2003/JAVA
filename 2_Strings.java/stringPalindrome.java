public class stringPalindrome {
    public static void main(String[] args) {
        String str="abszsba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        if(str.length()==0 || str==null){
            return true;
        }

        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char start=str.charAt(i);
            char last=str.charAt(str.length()-1-i);

            if(start!=last){
                return false;
            }
        }

        // String rev="";
        // for(int i=str.length()-1;i>=0;i--){
        //     char ch=str.charAt(i);
        //     rev+=ch;
        // }
        // if(rev.equals(str)) return true;

        return true;
    }
}
