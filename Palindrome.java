public class Palindrome{
	public static boolean isPalindrome(String str){
		String s ="";
		String test = onlyLetters(str);
		for(int i = 0; i<test.length(); i++){
			s+= str.charAt(test.length()-1-i);
		}
		return s.equals(test);	
	}
	public static String onlyLetters(String str){
		str.toLowerCase();
		String s ="";
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) < 27){
				s+=str.charAt(i);
				
			}
			
			
			
		}
		return s;
	}
	public static void main(String[] args){
		System.out.println(isPalindrome("Amy, must I jujitsu my ma?"));
	}
}
