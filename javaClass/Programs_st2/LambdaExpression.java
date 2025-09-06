package javaClass.Programs_st2;
@FunctionalInterface
interface Test1 {
	int area();

}

interface Test2 {
	int area(int n);
}

interface Test3 {
	int area(int n1, int n2);
}

public class LambdaExpression {
	public static void main(String args[]) {
		int side = 10;
		Test1 t1 = () -> side;
		System.out.println(t1.area());
		Test2 t2 = (n) -> n;
		System.out.println(t2.area(20));
		Test3 t3 = (n1, n2) -> n1 * n2;
		System.out.println(t3.area(10, 20));
	}

}