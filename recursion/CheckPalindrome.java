package recursion;

public class CheckPalindrome {
	
	
	static boolean palCheck(String s) 
	 {   
		if(s.length()<=1)
			return true;
		
		String first = s.substring(0,1);
		String last = s.substring(s.length()-1,s.length());
		
		if (!first.equals(last))
			return false;
		
		
		else
		
		
		
		
		return palCheck(s.substring(1,s.length()-1));
    }

	
	public static void main(String[] args) {
		String str = "aabaa";
		System.out.println(palCheck(str));

	}

}
