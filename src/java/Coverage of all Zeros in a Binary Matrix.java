
// User function Template for Java

class Solution {
    
    
    /* T : O(n*m). S : O(1) */
    public int findCoverage(int[][] matrix) {
        // code here
        
        
        int[] dx= new int[]{0,1,-1,0}, dy = new int[]{1,0,0,-1}; 
        int totalCoverage=0, row= matrix.length, col= matrix[0].length;
        for( int i=0; i<row; i++){
            for( int j=0; j<col; j++){
                
                if( matrix[i][j]==0){
                for(int k=0; k<4; k++){
                    int dxi= dx[k]+ i, dyj= dy[k] + j;
                    
                    if( dxi >=0 && dxi < row && dyj >=0 && dyj < col && matrix[dxi][dyj]==1)
                       totalCoverage++;
                }
                
                }
            }
        }
        
        return totalCoverage;
    }
}

/*
Coverage of all Zeros in a Binary Matrix
Difficulty: EasyAccuracy: 58.53%Submissions: 10K+Points: 2
Given a binary matrix contains 0s and 1s only, we need to find the sum of coverage of all zeros of the matrix where coverage for a particular 0 is defined as a total number of ones around a zero in left, right, up and bottom directions.

Examples:

Input:
matrix = [[0, 1, 0],
          [0, 1, 1],
          [0, 0, 0]]
Output: 6
Explanation: There are a total of 6 coverage are there

Input: 
matrix = [[0, 1]]
Output: 1
Explanation: There are only 1 coverage.
Expected Time Complexity: O(n * m)
Expected Space Complexity: O(1)

Constraints:
1 <= matrix.size, matrix[0].size <= 100

*/

