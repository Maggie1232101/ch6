

public class roots{
	public static double SquareRoot(double a, double b){
		return (b+a/b)/2;
		
	}
	
	public static void main(String[] args){
		double guess = 6;
		double lastGuess = 8;
		double root = 16;
		while(Math.abs(guess-lastGuess)>0.0001){
			lastGuess = guess;
			guess = SquareRoot(16,guess);
			System.out.println(guess);
			
		}
	
	}

}
