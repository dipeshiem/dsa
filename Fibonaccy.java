/**
 * 
 */

/**
 * @author dipgarg
 *
 */
public class Fibonaccy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(fib(10));
		System.out.println(fibDP(10));

	}

	public static int fib(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		return fib(N - 1) + fib(N - 2);

	}
	
	public static int fibDP(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		int var0 =0;
		int var1 = 1;
		for(int i = 2 ; i<=n; i++) {
			int var = var0+var1;
			var0 = var1;
			var1 = var;
			
		}
		return var1;
		
		
	}

}
