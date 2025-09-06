package javaClass.Programs_st2;
@FunctionalInterface
interface Interface5 {
	public Message getMessage(String n);
}

class Message {
	public Message(String m) {
		System.out.println(m.length());
	}
}

public class MethodConstructorReference {
	public static void main(String[] args) {
		Interface5 m = Message::new; // constructor referencing
		m.getMessage("hello");
	}
}
