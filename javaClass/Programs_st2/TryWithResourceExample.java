package javaClass.Programs_st2;
import java.io.FileOutputStream;

public class TryWithResourceExample {

	public static void main(String args[]) {
		// Using try-with-resources

		try (FileOutputStream fileOutputStream = new FileOutputStream(
				"C:/Users/madhv/OneDrive/Desktop/2023-24/EVEN/OOP WITH JAVA/NOTES/UNIT-2/TestFile1.txt")) {

			String msg = "Welcome to ABES!";

			byte byteArray[] = msg.getBytes(); // converting string into byte array

			fileOutputStream.write(byteArray);

			System.out.println("Message written to file successfuly!");

		} catch (Exception exception) {

			System.out.println(exception);
		}
	}

}
