
public class StringLength {
	
	public static void main (String args[]) {
		String test = "dipesh";
		char[] mychar = test.toCharArray();
		int length =0;
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		for (char c : mychar) {
			length++;
		}
		System.out.println(length);
	}

}
