/**
 * 
 */

/**
 * @author dipgarg
 *
 */
public class ProductExceptSelf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int[] productExceptSelf(int[] nums) {
    	int length = nums.length;
    	int[] left = new int[length];
    	int[] right = new int[length];
    	int[] result = new int[length];
    	left[0] = 1;
    	right [length-1] = 1;
    	// fill left multiplication 
    	for (int i = 1; i < length; i++) {
			left[i] = left[i-1]*nums[i-1];	
		}
    	
    	//fill right multiplication
    	
      	for (int i = length-1; i >=0; i--) {
    			right[i] = right[i+1]*nums[i+1];	
    		}
      	
      	//filll result
      	for (int i = 0; i < result.length; i++) {
			result[i] = left[i] * right[i];
		}
    	return result;
        
        
    }
    
    public static int[] productExceptSelfWithoutExtraSpace(int[] nums) {
    	int length = nums.length;
    	int[] result = new int[length];
    	result[0] = 1;
    	// fill left multiplication 
    	for (int i = 1; i < length; i++) {
			result[i] = result[i-1]*nums[i-1];	
		}
    	
      	
      	//filll result
    	int right = nums[length-1];
      	for (int i = length-2; i >=0; i--) {
      		right = right * nums[i];
			result[i] = result[i] * right;
		}
    	return result;
        
        
    }

}
