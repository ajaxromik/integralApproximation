
public class integralApproximation {

	public static void main(String[] args) {
		
		double subintervals = Math.pow(2, 31); //it's only a double so i can use pow()
		System.out.println(leftApprox(subintervals));
		System.out.println(rightApprox(subintervals));
		
	}
	
	public static double leftApprox(double subintervals) {
		double sigma = 0;
		
		for(int i = 0; i < subintervals; i++) {
			sigma += function(i / subintervals);
		}
		
		return sigma / subintervals;
	}
	
	public static double rightApprox(double subintervals) {
		double sigma = 0;
		
		for(int i = 1; i <= subintervals; i++) {
			sigma += function(i / subintervals);
		}
		
		return sigma / subintervals;
	}
	
	public static double function(double x) {
		return x * x;
	}

}
