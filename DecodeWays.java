/**
 * 
 */

/**
 * @author dipgarg
 *
 */
public class DecodeWays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(numDecodings("1"));

	}

	public static int numDecodings(String s) {

		if (s.length() < 1) {
			return 0;
		}

		if (s.charAt(0) - '0' == 0) {
			return 0;
		}
		if (s.length() == 1) {
			return 1;
		}
		int var1 = 1;
		int var2 = 1;
		for (int i = 1; i < s.length(); i++) {
			int var = 0;
			int d1 = s.charAt(i) - '0';
			if (d1 > 0 && d1 < 10) {
				var += var2;
			}
			int d2 = (s.charAt(i - 1) - '0') * 10 + d1;
			if (d2 < 27 && d2 > 9) {
				var += var1;
			}
			var1 = var2;
			var2 = var;

		}
		return var2;
	}
}
