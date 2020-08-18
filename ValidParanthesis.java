import java.util.Stack;

/**
 * 
 */

/**
 * @author dipgarg
 *
 */
public class ValidParanthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isValid("]"));

	}

	public static boolean isValid(String s) {
		Stack<Character> characters = new Stack<Character>();
		int i = 0;
		
		while (i < s.length()) {
			try {
			Character c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				characters.push(c);
			}
			if (c == ')') {
				Character popc = characters.pop();
				if (popc != '(')
					return false;
			} else if (c == '}') {
				Character popc = characters.pop();
				if (popc != '{')
					return false;
			} else if (c == ']') {
				Character popc = characters.pop();
				if (popc != '[')
					return false;
			}
			i++;
			}catch (Exception e) {
				return false;
			}
		}
		return characters.empty() ?true :false;
	}
}
