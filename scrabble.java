public class scrabble {
	public static int letters(String str, char a){
		int res = 0;
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i)==a){
				res++;
			}
			
		}
		return res;
		
	}
    public static boolean canSpell(String lets, String word) {
		int n = 0;
        for(int i =0; i<word.length(); i++){
			if(letters(word,word.charAt(i))==letters(lets,word.charAt(i))){
				n++;
			}
			
		}
		return n == word.length();
    }
    public static void main(String[] args) {
        System.out.println(canSpell("awrimgggre", "magggie"));
    }
}
