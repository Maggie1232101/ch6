

public class PPAP{
	public static String pap(String str){
		String str1 = "";
		String str2 = "";
		int s = 0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==' '){
				s++;
			}
			if(s==3){
				if(str.charAt(i)!=','){
				str1+=str.charAt(i);
			}}
			if(s==7){
				str2+=str.charAt(i);
			}
			
			
		}
		return cap(str2)+str1;
	}
	public static String cap(String str){
		String ret = "";
		ret+= str.charAt(1);
		ret.toUpperCase();
		//ret+=str.substring(1);
		return ret;
		
	}
	public static void main(String[] args){
		String word = "I have a maggie, I have a downs";
		System.out.println(word);
		
		System.out.print("uh!" + pap(word));
	
	
	}

}
