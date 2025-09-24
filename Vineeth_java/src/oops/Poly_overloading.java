package oops;

class CalculatorOL{				//This is the overloading method
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b, int c) {
		return a+b+c;
	}
	double add(double a,double b) {
		return a+b;
	}
}
public class Poly_overloading {
	public static void main(String[] args) {
		CalculatorOL calc = new CalculatorOL();
		
		System.out.println("Sum of 2 ints : "+calc.add(5, 10));
		System.out.println("Sum of 3 ints : "+calc.add(5, 10, 20));
		System.out.println("Sum of 2 doubles : "+calc.add(2.5, 7.3));
	}
}
