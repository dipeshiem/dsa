import java.util.Arrays;

/**
 * 
 */

/**
 * @author dipgarg
 *
 */
public class UniquePAth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 7));
	}

	public static int uniquePaths(int[][] obstacleGrid) {
        
		int R = obstacleGrid.length;
        int C = obstacleGrid[0].length;
	    int[][] d = new int [obstacleGrid.length][obstacleGrid[0].length];
	    
        if(obstacleGrid[0][0] == 1){
            return 0;
        }

	    // Filling the values for the first column
        for (int i = 1; i < R; i++) {
            d[i][0] = (obstacleGrid[i][0] == 1 && obstacleGrid[i - 1][0] == 1) ? 1 : 0;
        }

        // Filling the values for the first row
        for (int i = 1; i < C; i++) {
            obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) ? 1 : 0;
        }
	    for(int col = 1; col < d.length; ++col) {
	      for(int row = 1; row < d[col].length; ++row) {
              if(obstacleGrid[col][row] ==1){
                  d[col][row] =0;
              }else{
                  d[col][row] = d[col - 1][row] + d[col][row - 1];
              }
	        
	      }
	    }
	    return d[obstacleGrid.length-1][obstacleGrid[0].length-1];
	}

}
