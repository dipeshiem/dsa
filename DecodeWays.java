/**
 * 
 */

/**
 * @author dipgarg
 * 
 *         problem statement : there is number to character encoding like 1 -> A
 *         , 2 -> B ....... 26 -> z
 * 
 *         how many way a number can be decoded for example 112 can be decoded
 *         as 1 1 2 A A B 11 2 K B 1 12 A L
 *
 */
public class DecodeWays {

	/**
	 * can be solved using recurssion or dynamic Programming
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(numDecodingsDynanamicProgramming("1124"));
		System.out.println(numDecodingsDynanamicProgrammingwithNoExtraSpace("1124"));
		System.out.println(numDecodingsWithRecurssion("1124"));

	}

	public static int numDecodingsDynanamicProgramming(String s) {

		// if length = 0 then return 0
		if (s.length() < 1) {
			return 0;
		}

		// if char at 0th position is O then return 0
		if (s.charAt(0) - '0' == 0) {
			return 0;
		}

		// if length is 1 then return 1
		if (s.length() == 1) {
			return 1;
		}

		// initialize array for storing number of way for each position
		int[] dp = new int[s.length() + 1];
		dp[0] = 1;
		dp[1] = 1;

		for (int i = 1; i < s.length(); i++) {
			int lastDigit = s.charAt(i) - '0';
			int ways1 = 0;
			int ways2 = 0;
			if (lastDigit > 0 && lastDigit < 10) {
				ways1 = dp[i];
			}
			int lastTwoDigit = (s.charAt(i - 1) - '0') * 10 + lastDigit;
			if (lastTwoDigit < 27 && lastTwoDigit > 9) {
				ways2 = dp[i - 1];
			}
			dp[i + 1] = ways1 + ways2;

		}
		return dp[s.length()];
	}

	public static int numDecodingsDynanamicProgrammingwithNoExtraSpace(String s) {
		if (s.length() < 1) {
			return 0;
		}

		// if char at 0th position is O then return 0
		if (s.charAt(0) - '0' == 0) {
			return 0;
		}

		// if length is 1 then return 1
		if (s.length() == 1) {
			return 1;
		}
		int var0 = 1;
		int var1 = 1;
		for (int i = 1; i < s.length(); i++) {
			int ways1 = 0;
			int ways2 = 0;
			int d1 = s.charAt(i) - '0';
			if (d1 > 0 && d1 < 10) {
				ways1 = var1;
			}
			int d2 = (s.charAt(i - 1) - '0') * 10 + d1;
			if (d2 < 27 && d2 > 9) {
				ways2 = var0;
			}
			var0 = var1;
			var1 = ways1 + ways2;

		}
		return var1;
	}

	public static int numDecodingsWithRecurssion(String s) {
		if(s.length()==1 || s.length()==0) {
			return 1;
		}
		
		int d1 = s.charAt(s.length()-1) - '0';
		
		int ways1 = 0;
		if (d1 > 0 && d1 < 10) {
			//System.out.println(s.substring(0,s.length()-1));
			ways1 = ways1 +numDecodingsWithRecurssion(s.substring(0,s.length()-1));
		}
			
	
		
		int d2 = (s.charAt(s.length()-2) - '0') * 10 + d1;
		int ways2 = 0;
		if (d2 < 27 && d2 > 9) {
			//System.out.println("test"+s.substring(0,s.length()-2));
			ways2 = ways2 +numDecodingsWithRecurssion(s.substring(0,s.length()-2));;
		}
			 
		
		
		
		return ways1+ways2;
	}
}
