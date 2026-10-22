public class Scrabble{
	public static boolean canSpell(String lets, String word){
		int n = 0;
		
		for(int i = 0; i<word.length(); i++){
			if(lets.indexOf(word.charAt(i))>=0){
					n++;
					
			}
			
			
		}
		
		return n==word.length();
		
	}
	public static void main(String[] args){
		System.out.println(canSpell("awrimgrge","zebra"));
	
	
	}


}
