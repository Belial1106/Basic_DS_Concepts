package recursion;

public class Josephus {
	
	
	
	static int jos(int n,int k) {
		
		if (n==1)
			return n;
		
		return (jos(n-1,k)+k-1)%n+1;
	}

	public static void main(String[] args) {
		System.out.println(jos(50,10));
	}

}
