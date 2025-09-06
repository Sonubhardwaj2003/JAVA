package javaClass.Programs_st2;
@FunctionalInterface
interface Test11{
	int area();
	
}
interface Test22{
	int area(int n);
}

interface Test33{
	int area(int n1,int n2);
}

public class WithoutLambdaExpression implements Test11,Test22,Test33{
	int side=10;
	public int area() {
		return side;
	}
	public int area(int n) {
		return n;
	}
	public int area(int n1,int n2) {
		return n1 * n2;
	}
	public static void main(String args[]){
	Test11 t1=new WithoutLambdaExpression();
	System.out.println(t1.area());
	Test22 t2=new WithoutLambdaExpression();
	System.out.println(t2.area(20));
	Test33 t3=new WithoutLambdaExpression();
	System.out.println(t3.area(10,20));
}
	
}
