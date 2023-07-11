/*
Find kth element of spiral matrix
MediumAccuracy: 50.66%Submissions: 34K+Points: 4
POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !

Given a matrix with n rows and m columns. Your task is to find the kth element which is obtained while traversing the matrix spirally. You need to complete the method findK which takes four arguments the first argument is the matrix A and the next two arguments will be n and m denoting the size of the matrix A and then the forth argument is an integer k. The function will return the kth element obtained while traversing the matrix spirally.

Example 1:

Input:
n = 4, m = 4, k = 10
A[][] = {{1  2  3  4},
         {5  6  7  8},
         {9  10 11 12},
         {13 14 15 16}}
Output:
13
Explanation:

The spiral order of matrix will look like 1->2->3->4->8->12->16->15->14->13->9->5->6->7->11->10. So the 10th element in this order is 13. 

Example 2:

Input:
n = 3, m = 3, k = 4
A[][] = {{1 2 3},
         {4 5 6},
         {7 8 9}}
Output:
6
Explanation:
The spiral order of matrix will look like 1->2->3->6->9->8->7->4->5. So the 4th element in this order is 6.

Your Task:
You only need to implement the given function findK(). Do not read input, instead use the arguments given in the function. Return the K'th element obtained by traversing matrix spirally.

Expected Time Complexity: O(n*m)
Expected Auxiliary Space: O(n*m)

Constraints:
1<=n,m<=103
1<=k<=n*m*/
class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
// Your code here
 
int startRow=0;
int startCol=0;
int endRow=n-1;
int endCol=m-1;
int count=0;
while(startRow<=endRow && startCol<=endCol&&count!=k)
{
   //top
   for(int j=startCol;j<=endCol;j++)
   {
        count++;
       if(count==k)
       {
        return A[startRow][j];
       }
      
   }
   
   //right
   for(int i=startRow+1;i<=endRow;i++)
   {
          count++;
       if(count==k)
       {
       return A[i][endCol];
       }
    
   }
   //bottom
   for(int j=endCol-1;j>=startCol;j--)
   {
       count++;
       if(count==k)
       {
           return A[endRow][j]; 
       }
       
     
   }
   //left
   for(int i=endRow-1;i>=startRow+1;i--)
   {
       count++;
       if(count==k)
       {
          return A[i][startCol];
       }
       
      
   }
   startRow++;
   startCol++;
   endRow--;
   endCol--;
}
 
return -1;
 
    }
}
