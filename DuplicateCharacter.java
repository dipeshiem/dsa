
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * 
 */

/**
 * @author dipgarg
 *
 */
public class DuplicateCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test = "Dipeshdip";
		getDupChar(test);

	}

	private static void getDupChar(String test) {
		HashMap<Character, Integer> values = new HashMap<Character, Integer>();
		
		for (int i = 0; i < test.length(); i++) {
			values.put(test.charAt(i), values.getOrDefault(test.charAt(i), 0)+1);
		}
		
		
			for (Character c : values.keySet()) {
			   if (values.get(c) > 1)
				    System.out.println("duplicate character : " + c + " ====== " + " count : " + values.get(c));
				 
				  }
			
		}
	}
