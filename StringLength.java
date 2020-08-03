
public class StringLength {
	
	public static void main (String args[]) {
		String test = "dipesh";
		char[] mychar = test.toCharArray();
		int length =0;
		for (char c : mychar) {
			length++;
		}
		System.out.println(length);
	}

}
