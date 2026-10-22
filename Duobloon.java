public class Duobloon{
	public static boolean isDuobloon(String str){
		for(int i = 0; i<str.length(); i++){
			if (str.indexOf(str.charAt(i)) ==i){
				if(i+1<str.length() && str.indexOf(str.charAt(i),i+1)<0){
					return false;
				}
			}
			
		}
		return true;
		
	}
	public static void main(String[] args){
		System.out.println(isDuobloon("papa"));
	
	
	
	}



}
