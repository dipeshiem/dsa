/**
 * 
 */

/**
 * @author dipgarg Given n non-negative integers representing an elevation map
 *         where the width of each bar is 1, compute how much water it is able
 *         to trap after raining.
 * 
 * 
 *         The above elevation map is represented by array
 *         [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue
 *         section) are being trapped. Thanks Marcos for contributing this
 *         image!
 * 
 *         Example:
 * 
 *         Input: [0,1,0,2,1,0,1,3,2,1,2,1] Output: 6
 *
 *         Solution https://www.youtube.com/watch?v=ECbgLWIXeMo&t=98s
 */
public class RainingWater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(rainingWaterQuantity(input));
		System.out.println(rainingWaterQuantityWithDP(input));

	}

	/**
	 * Time complexity: O(n^2)O(n2). For each element of array, we iterate the left
	 * and right parts.
	 * 
	 * Space complexity: O(1)O(1) extra space.
	 * 
	 * @param input
	 * @return
	 */
	private static int rainingWaterQuantity(int[] input) {
		// check max from left and max from right and then min of these two for
		// each cell
		int sum = 0;
		for (int i = 0; i < input.length - 1; i++) {
			// find max from left
			int leftMAx = input[i];
			for (int j = 0; j < i; j++) {
				leftMAx = Math.max(leftMAx, input[j]);
			}

			// find max at right
			int rightMAx = input[i];
			for (int j = i; j <= input.length - 1; j++) {
				rightMAx = Math.max(rightMAx, input[j]);
			}
			sum = sum + (Math.min(leftMAx, rightMAx) - input[i]);
			//System.out.println(sum);
		}

		return sum;
	}

	private static int rainingWaterQuantityWithDP(int[] input) {
		// check max from left and max from right and then min of these two for
		// each cell
		int n = input.length;
		// craete two create, left and right
		int[] left = new int[n];
		int[] right = new int[n];
		//fill left
		left[0]= 0;
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i-1], input[i]);
		}
		right[n-1]=0;
		for (int i = n-2; i > 0; i--) {
			right[i] = Math.max(right[i+1], input[i]);
		}
		int sum = 0;
		for (int i = 0; i < input.length - 1; i++) {
			// find max from left
			
			sum = sum + (Math.min(left[i], right[i]) - input[i]);
			//sSystem.out.println(sum);
		}

		return sum;
	}

}
