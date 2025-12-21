import java.net.InetAddress;
import java.net.UnknownHostException;

class Solution{
    public static void main(String[] args) {
        try{
            InetAddress address=InetAddress.getLocalHost();
            String dottedQuad=address.getHostAddress();
            System.out.println(address);
            System.out.println(dottedQuad);
        }
        catch(UnknownHostException ex){
            System.out.println("Could not find this computer's address.");
        }
    }
}