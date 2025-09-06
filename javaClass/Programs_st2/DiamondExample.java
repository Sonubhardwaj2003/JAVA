package javaClass.Programs_st2;

abstract class D<T> { 
		abstract T add(T num1, T num2); 
	}   

	public class DiamondExample{ 
		public static void main(String[] args) 
		{ 
			D<Integer> obj = new D<>() { 
				Integer add(Integer n1, Integer n2) 
				{ 
					return (n1 + n2);     
				} 
			}; 
			Integer result = obj.add(20, 30); 
			System.out.println("Addition of two numbers: " + result); 
		} 
	} 

