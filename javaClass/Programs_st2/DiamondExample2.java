package javaClass.Programs_st2;
class DiamondDemo<T> {

	T a;

	DiamondDemo(T var1) {
		a = var1;
	}

	public T display() {
		return a;
	}
}

public class DiamondExample2 {
	public static void main(String args[]) {
		DiamondDemo<String> d = new DiamondDemo<>("Hello");
		System.out.println(d.display());
	}

}
