public class Abecedarian{
	public static boolean isAbecedarian(String str){
		for(int i = 0; i<str.length();i++){
			if(i+1<str.length() && str.charAt(i)>str.charAt(i+1)){
				return false;
			}
			
		}
		return true;
		
	}
	public static void main(String[] args){
		System.out.println(isAbecedarian("cba"));
	
	
	
	}


}
