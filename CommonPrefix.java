/**
 * 
 */

/**
 * @author dipgarg
 *
 */
public class CommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strList = {"java2blog","javaworld","javabean","javatemp"};
		System.out.println(findCommon(strList));

	}

	private static String findCommon(String[] strList) {
		String minString = getMinimun(strList);
		int commonLength = minString.length();
		for (int i = 0; i < strList.length; i++) {
			int j = 0;
			for (; j < commonLength; j++) {
				if(minString.charAt(j)!= strList[i].charAt(j)) {
					break;
				}
			}
			commonLength = j;
			
		}
		return minString.substring(0, commonLength);
	}

	private static String getMinimun(String[] strList) {
		String minimum = strList[0];
		for (int i = 1; i < strList.length; i++) {
			if(strList[i].length()<minimum.length()) {
				minimum = strList[i];
			}
		}
		return minimum;
	}

}
