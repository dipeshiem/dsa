/**
 * 
 */

/**
 * @author dipgarg
 *
 */

//find all Substring 
public class SubString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test = "abb";
		for (int i = 0; i < test.length(); i++) {
			for (int j = i+1; j <= test.length(); j++) {
				System.out.println(" "+ test.substring(i, j));
			}
			
		}

	}

}
