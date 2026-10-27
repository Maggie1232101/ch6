public class Binary{
	public static String convertToBinary (int num){
		int r = 1;
		String str = "";
		while(num!=0){
			r = num%2;
			num = num/2;
			str = "" + r + str;
		}
		return str;
		
	}
	public static void main(String[] args){
		System.out.println(convertToBinary(1));
	
	
	
	
	}



}
