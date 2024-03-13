


class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        
        int n = mat.length;
        int ans[] = new int[n*n];
        int ind = 0;
        boolean up = true;
        
        int row = 0 , col = 0;
        
        while(row < n && col < n){
            
            if(up){
                while(row > 0 && col < n-1 ){
                    ans[ind++] = mat[row][col];
                    row--;
                    col++;
                }
                    ans[ind++] = mat[row][col];
                    if(col == n-1){
                        row++;
                    }
                    else{
                        col++;
                    }
                
            }else{
                
                while(row < n-1 && col > 0){
                    ans[ind++] = mat[row][col];
                    row++;
                    col--;
                    
                }
                    ans[ind++] = mat[row][col];
                    if(row == n-1){
                        col++;
                    }
                    else{
                        row++;
                    }
            }
            up = !up;
        }
        
        return ans;
        
    }
}
/*

Print matrix in diagonal pattern
EasyAccuracy: 63.72%Submissions: 16K+Points: 2
200+ people shotlisted last month for SDE Internship. Grab your spot this month via GfG Weekly Contest! 

banner
Given a square matrix mat[][] of n*n size, the task is to determine the diagonal pattern which is a linear arrangement of the elements of the matrix as depicted in the following example:



Example 1:

Input:
n = 3
mat[][] = {{1, 2, 3},
           {4, 5, 6},
           {7, 8, 9}}
Output: {1, 2, 4, 7, 5, 3, 6, 8, 9}
Explaination:
Starting from (0, 0): 1,
Move to the right to (0, 1): 2,
Move diagonally down to (1, 0): 4,
Move diagonally down to (2, 0): 7,
Move diagonally up to (1, 1): 5,
Move diagonally up to (0, 2): 3,
Move to the right to (1, 2): 6,
Move diagonally up to (2, 1): 8,
Move diagonally up to (2, 2): 9
There for the output is {1, 2, 4, 7, 5, 3, 6, 8, 9}.
Example 2:

Input:
n = 2
mat[][] = {{1, 2},
           {3, 4}}
Output: {1, 2, 3, 4}
Explaination:
Starting from (0, 0): 1,
Move to the right to (0, 1): 2,
Move diagonally down to (1, 0): 3,
Move to the right to (1, 1): 4
There for the output is {1, 2, 3, 4}.
Your Task:
You only need to implement the given function matrixDiagonally() which takes a matrix mat[][] of size n*n as an input and returns a list of integers containing the matrix diagonally. Do not read input, instead use the arguments given in the function.

Expected Time Complexity: O(n*n).
Expected Auxiliary Space: O(1).
Constraints:
1 <= n <= 100
-100 <= elements of matrix <= 100


           {{1, 2, 3,-1},
           {4, 5, 6,-2},
           {7, 8, 9,-3}}
           {7, 8, 9,-3}}
           
          1,2,4,4,5,
          


*/

// (0,0) -> (0,1) -> (1,0) -> (2,0) -> (1,1) ->(0,2) -> (1,2) ->(2,1) ->(2,2)
