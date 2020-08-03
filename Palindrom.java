/**
 * 
 */

/**
 * @author dipgarg
 *
 */
public class Palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test = "dipesh";
		String test1 = "did";
		System.out.println(checkPalindrom(test));
		System.out.println(checkPalindrom(test1));

	}

	private static boolean checkPalindrom(String test) {
		for (int i = 0 , j = test.length()-1; i <= j; i++,j--) {
			if(test.charAt(i)!= test.charAt(j)) {
				return false;
			}
			
		}
		
		return true;
	}
	

}
