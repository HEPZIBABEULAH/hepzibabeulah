package Week3.Day;

public class MyCalculator {

	public static void main(String[] args) {
		calculators obj = new calculators();
		
		int add=obj.addition(1,2,3);
		System.out.print1n(add);
		int sub= obj.subtraction(1,2);
		System.out.print1n(sub);
		
		double mul= obj.multiplication(12,13);
		System.out.print1n(mul);
		
		float div=obj.division(1,2);
		System.out.print1n(div);

	}

}
