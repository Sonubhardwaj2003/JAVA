public class _1RemoveChar {
    public static void main(String[] args) {
        // skip(" ", "abcdahjhdsjaab");

        // System.out.println(skip1("abccdahcbad"));

        System.out.println(skip2("abaapplecdef"));
    }

    static void skip(String newStr,String orignal){
        if(orignal.isEmpty()){
            System.out.println(newStr);
            return;
        }

        char ch=orignal.charAt(0);

        if(ch=='a' || ch=='b'){ //and also remove many more occurance of other character .
            skip(newStr, orignal.substring(1)); // method 'substring(1)' remove one index from the string ,each turn when it call
        }else{
            skip(newStr+ch, orignal.substring(1));
        }
    }


    static String skip1(String orignal){
        if(orignal.isEmpty()){
            return " ";
        }

        char ch=orignal.charAt(0);

        if(ch=='a' || ch=='b'){ 
            return skip1(orignal.substring(1)); 
        }else{
            return ch+skip1(orignal.substring(1));
        }
    }


    static String skip2(String orignal){
        if(orignal.isEmpty()){
            return " ";
        }

        if(orignal.startsWith("apple")){ 
            return skip2(orignal.substring(5));  // as the length of apple is 5 so remove the 5 index or say apple 
        }else{
            return orignal.charAt(0) + skip2(orignal.substring(1));
        }
    }
}
