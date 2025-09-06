// import java.text.Format;

// import javax.xml.crypto.Data;

public class str2 {
    public static void main(String[] args) {
        // String str1="java";
        // String str2="java";
        // System.out.println(str1==str2);

        // String str1="Java";
        // String str2="java";
        // System.out.println(str1==str2);
        
        String str1 = "java";
        String str2 = new String("java");
        System.out.println(str1 == str2);
        System.out.println("*********");
   
   
        // 📌 Common Format Specifiers by Data Type
        // | Data Type | Specifier | Description | Example |
        // | Integer | %d | Decimal integer | String.format("%d", 42) → "42" |
        // | Floating-point | %f | Decimal number with default 6 decimal places |
        // String.format("%.2f", 3.14159) → "3.14" |
        // | Character | %c | Single character | String.format("%c", 'A') → "A" |
        // | String | %s | String | String.format("%s", "Java") → "Java" |
        // | Boolean | %b | Boolean value (true/false) | String.format("%b", true) →
        // "true" |
        // | Hexadecimal | %x / %X | Integer in hex (lower/upper case) |
        // String.format("%x", 255) → "ff" |
        // | Octal | %o | Integer in octal | String.format("%o", 10) → "12" |
        // | Scientific | %e / %E | Scientific notation | String.format("%e", 12345.678)
        // → "1.234568e+04" |
        // | Hashcode | %h | Object hashcode | String.format("%h", obj) |


        float num = 12.3444763f;
        System.out.printf("Formatted number is %.2f", num); // to print the no. of dicimals after the value ,use formatt specifier in java
        System.out.println();

        System.out.println(Math.PI);
        System.out.printf("%.3f", Math.PI); // outut : 3.142
        System.out.println();

        int n = 28;
        // System.out.printf("%x",n); // hexadecimal value conversion from the decimal
        // value
        System.out.printf("%o", n);// Octal value conversion from the decimal value
        System.out.println();
        System.out.println("*********");


        // printing mix datatypes
        System.out.println('a'+'c'); // 97+99=196
        System.out.println("a"+"b");
        System.out.println((char)('a'+3)); //97+3=100 (d)
        System.out.println("a"+1);
    }
}
