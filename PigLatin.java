public class PigLatin{
	public static String pigLatin (String str){
		String res = "";
		String test = "";
		str += " ";
		for(int i = 0; i<str.length(); i++){
			if(str.indexOf(' ')<0){
				res = atinlayIgpay(str);
			}
			else{
				
				while (str.indexOf(' ',i)>i){
					test+= str.charAt(i);
					i++;
				}
				res += " " + atinlayIgpay(test);
				test = "";
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
		String word = "i love cars";
		System.out.println(word);
		System.out.println(pigLatin(word));
	
	
	}



}
