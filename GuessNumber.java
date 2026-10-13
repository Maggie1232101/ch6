import java.util.Scanner;
import java.util.Random;

public class GuessNumber{

	public static void main(String[] args){
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		int num = random.nextInt(100)+1;
		System.out.print("I'm thinkin of a number (1-100), try to guess it: ");
		int Ynum = in.nextInt();
		
		while(Ynum!=num){
			if(Ynum>num){
				System.out.print("Lower ");
			}
			else{
				System.out.print("Higher ");
			}
			Ynum = in.nextInt();
		}
		if(Ynum==num){
			System.out.println("you guessed my number!" + num);
		}
	}
}
