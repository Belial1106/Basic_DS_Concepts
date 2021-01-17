package recursion;

public class oneToN {
	
	
//	
//	static void oneN(int n) {
//		if (n==0)
//			return;
//		
//		oneN(n-1);
//		System.out.print(n+" ");
//	}
	
	
	static void oneNtailRecursion(int n,int k) {
		
		if (n<1)
			return;
		
		System.out.print(k+ " ");
		oneNtailRecursion(n-1,k+1);
	}
	
	
	public static void main(String[] args) {
		int k=1;
		oneNtailRecursion(6,k);

	}

}
