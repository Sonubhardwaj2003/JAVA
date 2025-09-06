
public class stringBuilder {
    public static void main(String[] args) {
        //without StringBuilder
        String series="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            series+=ch;
        }
        System.out.println(series);  // O(n**2) time complexcity , a,ab,abc,abcd... 

        // with stringBuilder
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            sb.append(ch);
        }
        System.out.println(sb.toString());      // O(n) time complexicity .. modified each time 
        System.out.println(sb.reverse());
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.insert(0, 'z'));
        System.out.println(sb.capacity());
        // and many more operations...

    }
}
