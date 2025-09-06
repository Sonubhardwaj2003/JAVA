import java.util.Base64;

public class Base64Example {
        public static void main(String[] args) {

                // create a sample String to encode
                String sample = "Hello you are in ABES.";

                // print actual String
                System.out.println("Sample String:\n"+ sample);

                // Encode into Base64 format
                String encodedString = Base64.getEncoder().encodeToString(sample.getBytes());

                // print encoded String
                System.out.println("Encoded String:\n"+ encodedString);

                // Encode into Base64 format without padding

                String encodedString1 = Base64.getEncoder().withoutPadding().encodeToString(sample.getBytes());

                // print encoded String
                System.out.println("Encoded String:\n"+ encodedString1);

                // decode into Base64 format
                byte[] DecodedByte = Base64.getDecoder().decode(encodedString);

                String decodedString = new String(DecodedByte);

                // print actual String
                System.out.println("actual String is :\n"+ decodedString);

                // decode into Base64 format
                byte[] DecodedByte1 = Base64.getDecoder().decode(encodedString1);

                String decodedString1 = new String(DecodedByte1);

                // print actual String
                System.out.println("actual String is :\n"+ decodedString1);
        }
}
