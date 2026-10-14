public class Gauss{
	
	public static double gauss(double x, double n){
		double a = 1;
		double prev=1;
		double result=1;
		for(double i=1; i<=n;i++){
			a = prev*(-(x*x)/i);
			result += a;
			prev = a;
			
		}
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(gauss(3.0,3.0));
	
	
	}


}
