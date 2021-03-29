package com.java8;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Before Java 8");
		FunctionExample sum = new SumOperator();
		System.out.println(sum.operate(3, 4));
		FunctionExample multiply = new MultiplyOperator();
		System.out.println(multiply.operate(3, 4));
		
		System.out.println("After Java 8");
		
		FunctionExample sumJ8 = (a,b) -> a+b;
		FunctionExample multiplyJ8 = (a,b) -> a*b;
		System.out.println(sumJ8.operate(4, 5));
		System.out.println(multiplyJ8.operate(4, 5));
		
	}

}
