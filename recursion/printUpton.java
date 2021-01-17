package recursion;

public class printUpton {
	
	static void uptoN(int n) {
		if (n==0)
			return;
		System.out.print(n+ " ");
		uptoN(n-1);
	}

	public static void main(String[] args) {
		uptoN(10);

	}

}
