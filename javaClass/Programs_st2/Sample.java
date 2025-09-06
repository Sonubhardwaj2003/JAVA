package javaClass.Programs_st2;
@FunctionalInterface
interface Demo {
	void display(String msg);

	default void Hello() {
		System.out.println("Hello");
	}
	
	static void display() {
		System.out.println("Hello Demo Class");
	}
}

public class Sample implements Demo {

	public void display(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Demo f = new Sample();
		f.display("functional interface demo");
		f.Hello(); // default method calling
		Demo.display();   // static method calling
		
	}
}
