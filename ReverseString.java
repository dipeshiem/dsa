
public class ReverseString {

	public static void main(String[] args) {

		String xyz = "dipesh";
		//System.out.println(revrseSting(xyz));
		System.out.println(revrseSting1(xyz));
		//System.out.println(revrseStingUsingRecurssion(xyz));

	}

	private static String revrseSting(String xyz) {
		char[] revrse = new char[xyz.length()];
		int j = 0;
		for (int i = xyz.length() - 1; i >= 0; i--) {
			revrse[j++] = xyz.charAt(i);

		}
		return new String(revrse);

	}
	
	private static String revrseSting1(String xyz) {
		String reverse = "";
		int j = 0;
		for (int i = xyz.length()-1; i >= 0; i--) {
			reverse = reverse+xyz.charAt(i);

		}
		return reverse;

	}

	private static String revrseStingUsingRecurssion(String xyz) {
		
		if(xyz.length() ==1) {
			return xyz;
		}
		int length = xyz.length();
		//System.err.println(length);
		return xyz.substring(length-1, length).concat(revrseStingUsingRecurssion(xyz.substring(0, length-1)));
		
	}

}
