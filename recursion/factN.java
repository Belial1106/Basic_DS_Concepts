package recursion;

public class factN {
	
	
	static int factorial(int n) {
		if (n==0)
			return 1;
		
		else
			return n*factorial(n-1);
	
	}
	
	static int factTail(int n,int val) {
		if (n==0) {
			return val;
		}
		else
			return factTail(n-1,n*val);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
		System.out.println(factTail(5,1));
	}

}
