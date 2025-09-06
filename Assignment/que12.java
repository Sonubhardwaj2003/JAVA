// 2)Create an interface Playable with a method void play().
// Create two classes: Guitar and Piano that implement the Playable interface.
// The Guitar class should print "Strumming the guitar".
// The Piano class should print "Playing the piano".
// In the main method, demonstrate polymorphism by creating an array of Playable objects and invoking the play() method.3
interface Playable{
    public void play();
}
class Guiter implements Playable{
    public void play(){
        System.out.println("Strumming the guiter");
    }
}
class Piano implements Playable{
    public void play(){
        System.out.println("Playing The piano");
    }
}
public class que12 {
    public static void main(String[] args) {
        
        Playable[] instruments = {new Guiter(), new Piano()};

        for (Playable instrument : instruments) {
            instrument.play();
        }

    }
}
