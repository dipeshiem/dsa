/**
 * 
 */

/**
 * @author dipgarg
 *
 */
public class Atoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(myAtoi("-91283472332"));

	}public  static int myAtoi(String str) {
        str = str.trim();
        int  isNegetive =  str.charAt(0)=='-'? -1:1;
        int  i =  str.charAt(0)=='-'? 1:0;
        int output = 0 ;
        for(; i< str.length(); i++){
            int c = (int)str.charAt(i);
        	if(c > 48 && c < 58) {
                output = output * 10 + str.charAt(i)-'0';
            }else{
                break;
            }
        }
        output = output *isNegetive;
        System.out.println(output);

        
     // handle max and min
    	if (output > Integer.MAX_VALUE)
    		return Integer.MAX_VALUE;
     
    	if (output < Integer.MIN_VALUE)
    		return Integer.MIN_VALUE;
    	
    	
        return (int)output;

        
    }

}
