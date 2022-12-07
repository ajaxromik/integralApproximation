
public class integralApproximation {

	public static void main(String[] args) {
		
		double subintervals = Math.pow(2, 30); //it's only a double so i can use pow()
		double x0 = 0; //starting position
		double intervalLength = 1; //length of the entire interval
		System.out.println(leftApprox(intervalLength, subintervals, x0));
		System.out.println(rightApprox(intervalLength, subintervals, x0));
		
	}
	
	public static double leftApprox(double intervalLength, double subintervals, double x0) {
		double sigma = 0;
		
		for(int i = 0; i < subintervals; i++) {
			sigma += function(i * intervalLength / subintervals + x0);
		}
		
		return sigma / subintervals;
	}
	
	public static double rightApprox(double intervalLength, double subintervals, double x0) {
		double sigma = 0;
		
		for(int i = 1; i <= subintervals; i++) {
			sigma += function(i * intervalLength / subintervals + x0);
		}
		
		return sigma / subintervals;
	}
	
	public static double function(double x) { //easily changeable function
		return x * x;
	}

}
