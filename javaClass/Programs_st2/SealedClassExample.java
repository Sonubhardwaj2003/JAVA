package javaClass.Programs_st2;

sealed class Character permits A, B {
	public void printName() {
		System.out.println("Default");
	}

	void display(int a) {
		System.out.println(a);
	}
}

non-sealed class A extends Character {

	public void printName() {
		System.out.println("A");

	}
}

final class B extends Character {
	public void printName() {
		System.out.println("B");
	}
}

class C {
	public void printName() {
		System.out.println("C");
	}
}

public class SealedClassExample {
	public static void main(String[] args) {
		Character c1 = new A();
		Character c2 = new B();
		// Character c3 = new C();

		c1.printName();
		c2.printName();
		c2.display(20);
		// c3.printName();
		// c3.display(30);
	}
}
