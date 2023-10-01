
//User function Template for Java

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here
    // code here 
        //for row 0
        ArrayList<Integer> res =new ArrayList<>();
        
        int size= 0 ;
        if(m==1){
            
            for(int i = 0 ; i < n ; i++){
                res.add(matrix[i][0]);
            }
        }
        else if(n==1){
            for(int i = 0 ; i < m ; i++){
                res.add(matrix[0][i]);
            } 
            
        }
        else{
            for(int i =0 ; i < matrix[0].length ;i++){
             res.add(matrix[0][i]);
         }
         //now for row 1 to n-2 one side
            for(int i =1 ; i < n-1 ; i++){
             res.add(matrix[i][m-1]);
         }
        // now the last row in reverese order
            for(int i = m-1  ;i >=0 ; i--){
              res.add(matrix[n-1][i]);
         }
        //now the other side
           for(int i =n-2 ; i>=1 ; i--){
             res.add(matrix[i][0]);
         } 
        }
        return res;
    }
    
}

/*

Boundary traversal of matrix
EasyAccuracy: 35.32%Submissions: 68K+Points: 2
Win 2X Geekbits, Get on the Leaderboard & Top the Coding Charts! Register for GFG Weekly Coding Contest

banner
You are given a matrix of dimensions n x m. The task is to perform boundary traversal on the matrix in a clockwise manner.

Example 1:

Input:
n = 4, m = 4
matrix[][] = {{1, 2, 3, 4},
         {5, 6, 7, 8},
         {9, 10, 11, 12},
         {13, 14, 15,16}}
Output: 1 2 3 4 8 12 16 15 14 13 9 5
Explanation:
The matrix is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
The boundary traversal is:
1 2 3 4 8 12 16 15 14 13 9 5
Example 2:

Input:
n = 3, m = 4
matrrix[][] = {{12, 11, 10, 9},
         {8, 7, 6, 5},
         {4, 3, 2, 1}}
Output: 12 11 10 9 5 1 2 3 4 8
Your Task:
Complete the function boundaryTraversal() that takes matrix, n and m as input parameters and returns the list of integers that form the boundary traversal of the matrix in a clockwise manner.

Expected Time Complexity: O(N + M)
Expected Auxiliary Space: O(N+M)

Constraints:
1 <= n, m<= 1000
0 <= matrixi <= 1000


*/
