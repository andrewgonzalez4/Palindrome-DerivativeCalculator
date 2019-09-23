import java.util.Scanner;

public class DerivativeCalculator {
	
	
	public static double f(double x) {
		return Math.sin(x) + Math.cos(x) + Math.pow(3,x);
	}
	
	public static double derivative(double function, double number) {
		double h = 0.000000001;
		double top = f(number  + h) - f(number);
		double bottom = h;
		double slope = top/bottom;
		return slope;
	
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double value = scanner.nextDouble();
		System.out.println(derivative(f(value),value));
	}

}
