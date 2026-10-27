public class PigLatin{
	public static String pigLatin (String str){
		String res = "";
		String test = "";
		for(int i = 0; i<str.length(); i++){
			if(str.indexOf(' ')<0){
				res = atinlayIgpay(str);
			}
			
		}
		return res;
	}
	public static String atinlayIgpay(String str){
		String res = "";
			if(str.length()>2){
				res += str.substring(1) + str.charAt(0) + "ay";
			}
			else{
				res += str;
			}
		return res;
	}
	public static void main (String[] args){
		String word = "car";
		System.out.println(word);
		System.out.println(pigLatin(word));
	
	
	}



}
