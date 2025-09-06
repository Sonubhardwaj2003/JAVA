package javaClass.Programs_st2;


@FunctionalInterface
interface Interface1{
	void method1(String str);//abstract method
	
	default void log(String s) {
		System.out.println("Interface 1 logging :"+s);
	}
	static void Hello() {
		System.out.println("Interface1");
	}
}

interface Interface2 {

	void method2();
	
	default void log(String s){
		System.out.println("Interface2 logging :"+s);
	}
	static void Hello() {
		System.out.println("Interface2");
	}


public class Default_Static implements Interface1,Interface2 {
	@Override
	public void method1(String str) {
		System.out.println(str);
		
	}
	@Override
	public void method2() {
		System.out.println("Method 2");
		
	}
	
	
	@Override
	public void log(String s) {
		System.out.println("My class log function");
		
	}

	public static void main(String args[])
	{
		Default_Static f1 = new Default_Static(); 
		f1.method1("Hello");
		f1.method2();
		f1.log("Functional Interface Class");
		Interface1.Hello();
		Interface2.Hello();
	}
	
}
}
