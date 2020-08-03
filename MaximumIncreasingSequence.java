/**
 * 
 */

/**
 * @author dipgarg
 *
 */
public class MaximumIncreasingSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] input = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		int output = getmis(input);
		System.out.println(output);

	}

	private static int getmis(int[] input) {
		int max = 1;
		int[] dummyArray = new int[input.length];
		for (int i = 0; i < dummyArray.length; i++) {
			dummyArray[i] =1;
		}
		for(int j = 1 ; j< input.length ; j++) {
			for(int k = 0 ; k <j;k++) {
				if(input[k] < input[j]) {
					dummyArray[j] = dummyArray[j] < dummyArray[k]+1 ?dummyArray[k]+1 : dummyArray[j] ;
				}
			}
		}
		
		
		for (int i = 0; i < dummyArray.length; i++) {
			if(dummyArray[i]>max) {
				max = dummyArray[i];
			}
		}
		return max;
		
	}

}
