package com.class17_2;

public class Application {

	public static void main(String[] args) {
	ScannerMethod scanMthd = new ScannerMethod();
	scanMthd.sub();
	scanMthd.sum1(23, 20);
	Application obj = new Application();
	obj.sum(8, 4);
	obj.sub(4, 4);
	obj.div(10, 5);
	obj.mult(6, 2);
	Calculator obj1 = new Calculator();
	obj1.example();
	}
 int sum(int a, int b) {
	System.out.println(a +b);
	return a + b;
}
 int sub (int a, int b) {
	System.out.println(a - b);
	return a - b;
}
 int div (int a, int b) {
	System.out.println(a/b);
	return a/b;
}
int mult (int a, int b) {
	System.out.println(a*b);
	return a*b;
}
}